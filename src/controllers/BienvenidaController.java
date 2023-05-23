package controllers;

import Application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class BienvenidaController {

    @FXML
    private Label bienvenidaLabel;

    @FXML
    private Button iniciarButton;

    Main main;

    @FXML
    void iniciarJuegoAction(ActionEvent event) {
        iniciarJuegoEvent();

    }

    private void iniciarJuegoEvent() {
        main.abrirInstrucciones();

    }


    public void setApplication(Main main) {
        this.main = main;
    }
}
