package controllers;

import Application.Main;
import Model.Player;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class passwordSelector {
    Main main;

    Player currentPlayer;

    @FXML
    private Button checkButton;

    @FXML
    private TextField passwordField;

    @FXML
    private Pane passwordPane;

    @FXML
    private Button startButton;

    @FXML
    void startStage(ActionEvent event) {
        main.openPasswordSelector(currentPlayer);

    }

    @FXML
    void checkPasswordAction(ActionEvent event) {
        String contrasenia = "";
        contrasenia = passwordField.getText();
        if (verifyField(contrasenia)){
            if(verifyRequirements(contrasenia)){
                main.openPasswordAssert(currentPlayer);
            }else {
                main.openPasswordFail(currentPlayer);
            }
        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Rellena el campo obligatorio ");
            alert.setTitle("Aviso");
            alert.showAndWait();
        }

    }

    private boolean verifyRequirements(String contrasenia) {
        return contrasenia.length() >= 8 && verifySpecialChar(contrasenia) >= 1 && verifyCapitalized(contrasenia) >= 1
                && verfyNumber(contrasenia) >= 1;
    }

    private int verfyNumber(String contrasenia) {
        int contador = 0;
        for (int i = 0; i < contrasenia.length(); i++) {
            if(Character.isDigit(contrasenia.charAt(i))){
                contador++;
            }

        }
        return contador;
    }


    private int verifyCapitalized(String contrasenia) {
        int contador = 0;
        for (int i = 0; i < contrasenia.length(); i++) {
            if(Character.isUpperCase(contrasenia.charAt(i))){
                contador++;
            }

        }
        return contador;
    }

    private int verifySpecialChar(String contrasenia) {
        String regex ="[^a-zA-Z0-9]";
        int contador= 0;
        for (int i = 0; i < contrasenia.length(); i++) {
            if (String.valueOf(contrasenia.charAt(i)).matches(regex)) {
                //contrasenia.charAt(i) == '!' || contrasenia.charAt(i) == '@' || contrasenia.charAt(i) == '$' || contrasenia.charAt(i) == '-' ||
                        //contrasenia.charAt(i) == '_'
                contador++;

            }
        }
        return contador;
    }

    private boolean verifyField(String contrasenia) {
        if(contrasenia.equals("")){
            return false;
        }
        return true;
    }

    public void setApplication(Main main) {
        this.main = main;
    }

    public void setCurrentPlayer(Player player) {
        this.currentPlayer = player;

    }
}
