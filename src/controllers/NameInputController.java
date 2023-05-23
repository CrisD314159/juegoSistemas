package controllers;

import Application.Main;
import Model.Player;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class NameInputController {

    Main main;


    @FXML
    private Button continueButton;

    @FXML
    private TextField nameField;

    @FXML
    void startGame(ActionEvent event) {
        String name = "";
        name = nameField.getText();
        if(verifyFields(name)){
            Player player= main.createPlayer(name);
            if (player != null){
                main.openPhishingStart(player);

            }

        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Ingresa un nombre antes de empezar");
            alert.setTitle("Antes de continuar");
            alert.setHeaderText("Aviso");
            alert.showAndWait();
        }

    }

    private boolean verifyFields(String name) {
        if(name.equals("")){
            return false;
        }
        return true;

    }

    public void setApplication(Main main) {
        this.main = main;
    }
}
