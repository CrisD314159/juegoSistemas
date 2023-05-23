package controllers;

import Application.Main;
import Model.Player;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class onlinePurchasesAsserts {
    Main main;
    Player currentPlayer;

    @FXML
    private Button continueButton;



    @FXML
    void continueFeedback(ActionEvent event) {
        main.openOnlinePurchasesFailure(currentPlayer);

    }


    @FXML
    void continueNextStage(ActionEvent event) {
        main.openPinStart(currentPlayer);

    }

    @FXML
    void addPoints(ActionEvent event) {
        main.addPoints(5, currentPlayer);
        continueNextStage(currentPlayer);

    }

    private void continueNextStage(Player currentPlayer) {
        main.openPinStart(currentPlayer);
    }


    public void setApplication(Main main) {
        this.main = main;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;

    }
}
