package controllers;

import Application.Main;
import Model.Player;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class correosPhisisngController {
    Main main;


    Player currentPlayer;

    @FXML
    private Button fakeButton;

    @FXML
    private Pane leftPane;

    @FXML
    private Button rightButton;

    @FXML
    private Pane rightPane;

    @FXML
    private Button startPhishingScene;

    @FXML
    void starScene(ActionEvent event) {
        main.openPhishingMail(currentPlayer);

    }


    @FXML
    void redirectAssert(ActionEvent event) {
        main.openPhishingMailAssert(currentPlayer);
        main.addPoints(5, currentPlayer);

    }

    @FXML
    void redirectFailure(ActionEvent event) {
        main.openMailFailure(currentPlayer);

    }

    public void setApplication(Main main) {
        this.main = main;
    }

    public void setCurrentPlayer(Player player) {
        this.currentPlayer = player;
    }
}
