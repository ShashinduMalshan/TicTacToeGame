package com.assignment.tictactoe.service;

import com.assignment.tictactoe.service.Controller.AiPlayer;
import com.assignment.tictactoe.service.Controller.HumanPlayer;
import com.assignment.tictactoe.service.Controller.Player;
import javafx.application.Application;
import javafx.stage.Stage;
import com.assignment.tictactoe.service.Controller.BoardImpl;

import java.io.IOException;
import java.util.Scanner;


public class Appinitializer extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Scanner input = new Scanner(System.in);

//        FXMLLoader fxmlLoader = new FXMLLoader(Appinitializer.class.getResource("/View/ticTacView.fxml"));
//        Scene scene = new Scene(fxmlLoader.load());
//        stage.setTitle("Tic Tac Toe");
//
//
//        stage.setScene(scene);
//        stage.show();
        BoardImpl board = new BoardImpl();


        L1:  while (true) {
            boolean validMove = false;
            try {

                System.out.print("Please enter the number of rows you would like to play : ");
                int row = input.nextInt();
                System.out.print("Please enter the number of columns you would like to play : ");
                int col = input.nextInt();

                Player humanPlayer = new HumanPlayer(board);
                Player aiPlayer = new AiPlayer(board);

                validMove=humanPlayer.move(row,col);
                if (!validMove){
                    continue ;
                }
                aiPlayer.move(row,col);


        board.boardImpl();

                board.printBoard(); // print Board

            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("invalid input");
            }
        }

    }

    public static void main(String[] args) {
        launch(args);

    }

}
