package controllers;

import Application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class InstruccionesController {

    Main main;
    @FXML
    private Label finalInstruction;

    @FXML
    private Label labelInstruction;

    @FXML
    private Button startButton;

    @FXML
    void startGame(ActionEvent event) {
        main.openInputName();

    }

    public void setApplication(Main main) {
        this.main = main;

    }
}
