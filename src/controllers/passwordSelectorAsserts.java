package controllers;

import Application.Main;
import Model.Player;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class passwordSelectorAsserts {
    Main main;

    Player currentPlayer;
    @FXML
    private Button continueButton;

    @FXML
    void addPoints(ActionEvent event) {
        main.addPoints(5, currentPlayer);
        continueNextStage(event);
    }


    @FXML
    void continueNextStage(ActionEvent event) {
        main.openOnlinePurchasesStart(currentPlayer);


    }

    public void setApplication(Main main) {
        this.main = main;
    }

    public void setCurrentPlayer(Player player) {
        this.currentPlayer = player;


    }



    @FXML
    void continueFeedback(ActionEvent event) {
        main.openPasswordFailure(currentPlayer);

    }
}
