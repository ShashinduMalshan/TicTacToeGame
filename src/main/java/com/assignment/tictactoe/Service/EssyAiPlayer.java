package com.assignment.tictactoe.Service;

import java.util.Random;

public class EssyAiPlayer extends Player {
    Random rand = new Random();


    public EssyAiPlayer(BoardImpl board) {
        super(board);

    }

    @Override
    public boolean move(int row, int col) {
        int aiRow;
        int aiCol;
        int increment=0;

        do {
            aiRow = rand.nextInt(3);
            aiCol = rand.nextInt(3);
            increment++;
        }
        while (!board.isLegalMove(aiRow,aiCol)&&increment<10);

        board.updateMove(aiRow, aiCol, Piece.O);  // AI places 'O' on the board
        System.out.println("AI add  " + aiRow + "  " + aiCol );

        return false;
    }
}
