package com.assignment.tictactoe.Service;


public class HumanPlayer extends Player{

    public HumanPlayer(BoardImpl board) {
        super(board);
    }


    @Override
    public boolean move(int row , int col) {

        boolean isLegalMove = board.isLegalMove(row, col);

        if (isLegalMove) {
            board.updateMove(row, col, Piece.X);
            System.out.println("HumanPlayer added");
            return true;
        } else {
            System.out.println("alrady add this box");
            return false;
        }

    }
}
