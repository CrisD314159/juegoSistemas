package controllers;

import Application.Main;
import Model.Player;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class pinSelectionAsserts {
    Main main;
    Player currentPlayer;
    @FXML
    private Button continueButton;




    @FXML
    void continueNextStage(ActionEvent event) {
        main.openConclusion(currentPlayer);

    }


    @FXML
    void addPoints(ActionEvent event) {
        main.addPoints(5, currentPlayer);
        main.openConclusion(currentPlayer);


    }

    @FXML
    void continueFeedback(ActionEvent event) {
        main.openPinFailure(currentPlayer);

    }

    public void setApplication(Main main) {
        this.main = main;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }
}
