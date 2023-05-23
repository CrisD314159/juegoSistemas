package controllers;

import Application.Main;
import Model.Player;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class onlinePurchasesController {
    Main main;

    Player currentPlayer;

    @FXML
    private Button startOnlinePurchases;

    @FXML
    private Button failButton;

    @FXML
    private Button rightWebButton;

    @FXML
    void openAssert(ActionEvent event) {
        main.openOnlinePurchasesAssert(currentPlayer);

    }

    @FXML
    void openFail(ActionEvent event) {
        main.openOnlinePurchasesFail(currentPlayer);

    }

    @FXML
    void startOnlinePurchases(ActionEvent event) {
        main.openOnlinePurchases(currentPlayer);

    }

    public void setApplication(Main main) {
        this.main = main;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }
}
