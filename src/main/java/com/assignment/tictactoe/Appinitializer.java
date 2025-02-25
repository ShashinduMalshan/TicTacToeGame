package com.assignment.tictactoe;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Appinitializer extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Parent load = FXMLLoader.load(getClass().getResource("/View/ticTacToe.fxml"));


        Scene scene = new Scene(load);
        stage.setTitle("Tic Tac Toe");
        stage.setScene(scene);

        stage.show();




    }

    public static void main(String[] args) {
        launch(args);

    }

}
