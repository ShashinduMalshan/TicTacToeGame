package com.assignment.tictactoe.Service;

public class HardAiPlayer extends Player {

    public HardAiPlayer(BoardImpl board) {
        super(board);
    }

    @Override
    public boolean move(int row, int col) {
        int[] bestMove = findBestMove();
        if (bestMove != null) {
            board.updateMove(bestMove[0], bestMove[1], Piece.O);
            System.out.println("AI places O at: " + bestMove[0] + ", " + bestMove[1]);
            return true;
        }
        return false;
    }

    private int[] findBestMove() {
        int bestValue = Integer.MIN_VALUE;
        int[] bestMove = null;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board.isLegalMove(i, j)) {
                    board.updateMove(i, j, Piece.O);
                    int moveValue =  minimax(0, false);
                    board.undoMove(i, j);

                    if (moveValue > bestValue) {
                        bestMove = new int[]{i, j};
                        bestValue = moveValue;
                    }
                }
            }
        }
        return bestMove;
    }

    private int minimax(int depth, boolean isMaximizing) {

        Piece winner = board.checkWinner();
        if (winner == Piece.O) {
            return 10 - depth;
        } else if (winner == Piece.X) {
            return depth - 10;
        } else if (board.isDraw()) {
            return 0;
        }

        if (isMaximizing) {
            int bestValue = Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board.isLegalMove(i, j)) {
                        board.updateMove(i, j, Piece.O);
                        bestValue = Math.max(bestValue, minimax(depth + 1, false));
                        board.undoMove(i, j);
                    }
                }
            }
            return bestValue;
        } else {
            int bestValue = Integer.MAX_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board.isLegalMove(i, j)) {
                        board.updateMove(i, j, Piece.X);
                        bestValue = Math.min(bestValue, minimax(depth + 1, true));
                        board.undoMove(i, j);
                    }
                }
            }
            return bestValue;
        }
    }
}
