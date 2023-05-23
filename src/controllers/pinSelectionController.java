package controllers;

import Application.Main;
import Model.Player;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.Pane;

public class pinSelectionController {
    Main main;
    Player currentPlayer;
    @FXML
    private Button checkPinButton;

    @FXML
    private PasswordField pinField;

    @FXML
    private Pane pinPane;

    @FXML
    void checkPin(ActionEvent event) {
        String pin = "";
        pin = pinField.getText();
        if(verificarCampo(pin) && veryOnlyNumber(pin)){
            if(verifyPin(pin)){
                main.openPinAssert(currentPlayer);
            }else {
                main.openPinFail(currentPlayer);
            }

        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Verifica los datos y vuelve a intentar");
            alert.setTitle("Aviso");
            alert.showAndWait();
        }

    }

    private boolean verifyPin(String pin) {
        if (pin.length() >= 4 && verifyRepeatedDigits(pin)){
            return true;

        }
        return false;
    }

    private boolean verifyRepeatedDigits(String pin) {
        char caracter = pin.charAt(0);
        for (int i = 1; i < pin.length(); i++) {
            if(caracter == pin.charAt(i)){
                return false;
            }
        }
        return true;
    }

    private boolean veryOnlyNumber(String pin) {
        int caracteres = 0;
        for (int i = 0; i < pin.length(); i++) {
            if (Character.isDigit(pin.charAt(i))){
                caracteres++;
            }
        }
        if (caracteres == pin.length()){
            return true;
        }
        return false;
    }

    private boolean verificarCampo(String pin) {
        if(pin.equals("")){
            return false;
        }
        return true;
    }

    @FXML
    private Button startPinScene;

    @FXML
    void startPin(ActionEvent event) {
        main.openPinSelector(currentPlayer);

    }


    public void setApplication(Main main) {
        this.main = main;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }
}
