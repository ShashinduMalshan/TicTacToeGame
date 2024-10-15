package com.assignment.tictactoe.service.Controller;

import java.util.Random;
import java.util.Scanner;

public class BoardImpl {
    Scanner input = new Scanner(System.in);
    Random rand = new Random();

    private Piece[][] pieces;


    public BoardImpl() {
        pieces =new Piece [3][3];
        initializeBoard();
    }


    public void boardImpl(){

        L1:  while (true) {
            boolean validMove = false;
            try {

                System.out.print("Please enter the number of rows you would like to play : ");
                int row = input.nextInt();
                System.out.print("Please enter the number of columns you would like to play : ");
                int col = input.nextInt();

                Player humanPlayer = new HumanPlayer(this);
                Player aiPlayer = new AiPlayer(this);

                validMove=humanPlayer.move(row,col);
                if (!validMove){
                    continue ;
                }
                aiPlayer.move(row,col);



                printBoard(); // print Board

            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("invalid input");
            }
        }

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
    public void  updateMove(int row, int col, Piece piece){


        if (isLegalMove(row,col)) {
            pieces[row][col] = piece;
            Piece won = checkWinner();
            System.out.println(won+"   dinAAAAAAAAAAAAAAAAAAAAAAAA");
        } else {
            System.out.println("Please Select Empty Row");
        }

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
            System.out.println(); // Move to the next line after each row
        }
    }

    public Piece  checkWinner() {


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
        if (pieces[0][2] == pieces[1][1] && pieces[1][1] == pieces[2][2] && pieces[0][2] != Piece.EMPTY) {
            System.out.println("Condition 4");
            return pieces[1][1];
        }
        return Piece.EMPTY;
    }

}

