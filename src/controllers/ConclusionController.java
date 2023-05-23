package controllers;

import Application.Main;
import Model.Player;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class ConclusionController {

    Main main;

    Player currentPlayer;


    @FXML
    private Button continueButton;

    @FXML
    private Label statsLabel;

    @FXML
    private Button tryAgainButton;

    @FXML
    void reStartGame(ActionEvent event) {
        main.mostrarVentanaPrincipal();
    }

    @FXML
    void shutDownGame(ActionEvent event) {
        main.shutDownGame();

    }
    public void setApplication(Main main) {
        this.main = main;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
        showStats(currentPlayer);
    }




    public void showStats(Player player){
        statsLabel.setText(player.getName()+", "+ " Tu puntaje final es: " +player.getPoints()+ " puntos");
    }
}
