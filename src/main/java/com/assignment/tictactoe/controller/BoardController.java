package com.assignment.tictactoe.controller;

import com.assignment.tictactoe.Service.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class BoardController {
    public Button btn1;
    public Button btn2;
    public Button btn4;
    public Button btn5;
    public Button btn3;
    public Button btn6;
    public Button btn7;
    public Button btn8;
    public Button btn9;
    public Label lble;
    public Label lblWinner;
    private BoardImpl board;
    private Player humanPlayer;
    private Player aiPlayer;

    public BoardController() {

        board = new BoardImpl();
        humanPlayer = new HumanPlayer(board);
        aiPlayer = new AiPlayer(board);

    }

    @FXML
    public void btnAction(int row, int col) {
        System.out.println("row: " + row + " col: " + col);


        boolean validMove = humanPlayer.move(row, col);
        updateUI();
        if (validMove) {
            aiPlayer.move(row, col);
            updateUI();
            board.printBoard();

        } else {
            System.out.println("Invalid move, try again!");
            updateUI();
        }
        winner();


    }



    public  void winner() {


        if (board.checkWinner()!=Piece.EMPTY){
            System.out.println(board.checkWinner()+" Player wins!");
            lblWinner.setText(board.checkWinner() == Piece.X ? " You wins! " : " You lost! ");

        }

    }



    public  void updateUI() {

        btn1.setText(board.getPieceAt(0, 0).toString());
        btn2.setText(board.getPieceAt(0, 1).toString());
        btn3.setText(board.getPieceAt(0, 2).toString());
        btn4.setText(board.getPieceAt(1, 0).toString());
        btn5.setText(board.getPieceAt(1, 1).toString());
        btn6.setText(board.getPieceAt(1, 2).toString());
        btn7.setText(board.getPieceAt(2, 0).toString());
        btn8.setText(board.getPieceAt(2, 1).toString());
        btn9.setText(board.getPieceAt(2, 2).toString());
    }



    public void btn1Action(ActionEvent actionEvent) {
        btnAction(0,0);

    }

    public void btn2Action(ActionEvent actionEvent) {
        btnAction(0,1);
    }

    public void btn4Action(ActionEvent actionEvent) {
        btnAction(1,0);
    }

    public void btn5Action(ActionEvent actionEvent) {
        btnAction(1,1);
    }

    public void btn3Action(ActionEvent actionEvent) {
        btnAction(0,2);
    }

    public void btn6Action(ActionEvent actionEvent) {
        btnAction(1,2);
    }

    public void btn7Action(ActionEvent actionEvent) {
        btnAction(2,0);
    }

    public void btn8Action(ActionEvent actionEvent) {
        btnAction(2,1);
    }

    public void btn9Action(ActionEvent actionEvent) {
        btnAction(2,2);
    }
}
