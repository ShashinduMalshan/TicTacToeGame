module com.assignment.tictactoe.service.tictactoe {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.assignment.tictactoe.controller to javafx.fxml;
    exports com.assignment.tictactoe;
}