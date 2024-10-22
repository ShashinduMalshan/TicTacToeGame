package com.assignment.tictactoe.Service;

import java.util.Random;

public class AiPlayer extends Player {
    Random rand = new Random();


    public AiPlayer(BoardImpl board) {
        super(board);

    }

    @Override
    public boolean move(int row, int col) {
        int aiRow;
        int aiCol;

        do {
            aiRow = rand.nextInt(3);
            aiCol = rand.nextInt(3);
        }
        while (!board.isLegalMove(aiRow,aiCol));

        board.updateMove(aiRow, aiCol, Piece.O);  // AI places 'O' on the board
        System.out.println("AI add  " + aiRow + "  " + aiCol );
        return false;
    }
}
