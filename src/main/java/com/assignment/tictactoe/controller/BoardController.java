package com.assignment.tictactoe.controller;

import com.assignment.tictactoe.Service.*;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;

import java.util.Optional;

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


            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle(lblWinner.getText());
            alert.setHeaderText("Do you want to play again");
            //  alert.setContentText("Are you sure you want to proceed?");

            Optional<ButtonType> result = alert.showAndWait();

            if (result.isPresent() && result.get() == ButtonType.OK) {
                System.out.println("User chose OK");
                board.initializeBoard();
                updateUI();
                lblWinner.setText("");


            } else {
                System.out.println("User cancelled the action");
                Platform.exit();

            }

        }else { boolean draw = board.isDraw();
            if (draw) {
                System.out.println("The game is a draw!");
                lblWinner.setText("Draw");

                // Add the alert for the draw condition
                Alert drawAlert = new Alert(Alert.AlertType.CONFIRMATION);
                drawAlert.setTitle("Game Draw");
                drawAlert.setHeaderText("The game is a draw. Do you want to play again?");
                Optional<ButtonType> result = drawAlert.showAndWait();

                if (result.isPresent() && result.get() == ButtonType.OK) {
                    System.out.println("User chose OK");
                    board.initializeBoard();
                    updateUI();
                    lblWinner.setText("");
                } else {
                    System.out.println("User cancelled the action");
                    Platform.exit();
                }

           }
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
