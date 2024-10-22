package com.assignment.tictactoe;

import com.assignment.tictactoe.Service.AiPlayer;
import com.assignment.tictactoe.Service.HumanPlayer;
import com.assignment.tictactoe.Service.Player;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import com.assignment.tictactoe.Service.BoardImpl;

import java.io.IOException;


public class Appinitializer extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Parent load = FXMLLoader.load(getClass().getResource("/View/ticTacToe.fxml"));


        Scene scene = new Scene(load);
        stage.setTitle("gg");
        stage.setScene(scene);

        stage.show();




    }

    public static void main(String[] args) {
        launch(args);

    }

}
