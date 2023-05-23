package controllers;

import Application.Main;
import Model.Player;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class correosPhishingAsserts {
    Main main;

    Player currentPlayer;

    @FXML
    private Button continueButton;

    @FXML
    void continueNextStage(ActionEvent event) {
        main.openPasswordStart(currentPlayer);

    }

    @FXML
    void continueFeedback(ActionEvent event) {
        main.openPhishingMailFailure(currentPlayer);

    }



    public void setApplication(Main main) {
        this.main = main;
    }

    public void setCurrentPlayer(Player player) {
        this.currentPlayer = player;
    }
}
