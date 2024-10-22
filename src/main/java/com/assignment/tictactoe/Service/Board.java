package com.assignment.tictactoe.Service;

public interface Board {

    void initializeBoard();
    boolean isLegalMove(int row, int col);
    void updateMove(int row, int col, Piece piece);
    Piece checkWinner();
    void printBoard();
    String getPieceAt(int row, int col);


}
