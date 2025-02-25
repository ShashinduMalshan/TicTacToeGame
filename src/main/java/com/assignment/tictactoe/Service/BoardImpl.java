package com.assignment.tictactoe.Service;


public class BoardImpl implements BoardUi {

    private Piece[][] pieces;


    public BoardImpl() {
        pieces =new Piece [3][3];
        initializeBoard();
    }




    //permenat
    public void initializeBoard(){
        for (int i = 0; i < pieces.length; i++) {
            for (int j = 0; j < pieces[i].length; j++) {
                pieces[i][j] = Piece.EMPTY;

            }
        }
    }


    //permenat
    public boolean isLegalMove(int row, int col){

        Boolean islegal = false;

        if (pieces[row][col] == Piece.EMPTY) {
            islegal=true;
        }
        return islegal;

    }



    //permenat
    public void updateMove(int row, int col, Piece piece){


        if (isLegalMove(row,col)) {
            pieces[row][col] = piece;
            Piece won = checkWinner();
            System.out.println(won+"   dinAAAAAAAAAAAAAAAAAAAAAAAA");
            isDraw();

        } else {
            System.out.println("Please Select Empty Row");
        }

    }


    public boolean isDraw(){
        for (int i = 0; i < pieces.length; i++) {
            for (int j = 0; j < pieces[i].length; j++) {
                if (pieces[i][j] == Piece.EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    //permenat
    public void printBoard(){
        // Print the array in matrix form
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (pieces[i][j]==Piece.EMPTY) {
                    System.out.print(" . ");
                }

                else {
                    System.out.print(pieces[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public Piece checkWinner() {


        for (int i = 0; i < 3; i++) {
            if (pieces[i][0] == pieces[i][1] && pieces[i][1] == pieces[i][2] && pieces[i][0] != Piece.EMPTY) {
                System.out.println("Condition 1");
                return pieces[i][0];
            }
            if (pieces[0][i] == pieces[1][i] && pieces[1][i] == pieces[2][i] && pieces[0][i] != Piece.EMPTY) {
                System.out.println(" Condition 2");
                return pieces[0][i];
            }
        }
        if (pieces[0][0] == pieces[1][1] && pieces[1][1] == pieces[2][2] && pieces[0][0] != Piece.EMPTY) {
            System.out.println("Condition 3");
            return pieces[1][1];
        }
        if (pieces[2][0] == pieces[1][1] && pieces[1][1] == pieces[0][2] && pieces[0][2] != Piece.EMPTY) {
            System.out.println("Condition 4");
            return pieces[1][1];
        }
        return Piece.EMPTY;
    }
    public String getPieceAt(int row, int col) {
        if (pieces[row][col] == Piece.EMPTY) {
            return " ";
        }
        return pieces[row][col].toString();
    }
    public void undoMove(int row, int col) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3) {
            pieces[row][col] = Piece.EMPTY; // Reset the cell to its original state
        }
    }
}