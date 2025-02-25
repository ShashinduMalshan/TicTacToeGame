package com.assignment.tictactoe.Service;

public interface BoardUi {

    void initializeBoard();
    boolean isLegalMove(int row, int col);
    void updateMove(int row, int col, Piece piece);
    void printBoard();
    String getPieceAt(int row, int col);

    
}
