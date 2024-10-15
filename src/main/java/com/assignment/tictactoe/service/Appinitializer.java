package com.assignment.tictactoe.service;

import javafx.application.Application;
import javafx.stage.Stage;
import com.assignment.tictactoe.service.Controller.BoardImpl;

import java.io.IOException;


public class Appinitializer extends Application {
    @Override
    public void start(Stage stage) throws IOException {

//        FXMLLoader fxmlLoader = new FXMLLoader(Appinitializer.class.getResource("/View/ticTacView.fxml"));
//        Scene scene = new Scene(fxmlLoader.load());
//        stage.setTitle("Tic Tac Toe");
//
//
//        stage.setScene(scene);
//        stage.show();
        BoardImpl board = new BoardImpl();
        board.boardImpl();

    }

    public static void main(String[] args) {
        launch(args);

    }

}
