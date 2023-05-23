package Application;

import Model.Aventura;
import Model.Player;
import controllers.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {

    Aventura aventura = new Aventura();

    Stage stage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        StackPane root = new StackPane();
        root.setAlignment(Pos.CENTER);

        this.stage = stage;
        this.stage.setTitle("Bienvenid@S");
        mostrarVentanaPrincipal();

    }

    public void mostrarVentanaPrincipal() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../views/Bienvenida.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            BienvenidaController mainViewController = loader.getController();

            mainViewController.setApplication(this);

            Scene scene = new Scene(rootLayout);
            scene.getStylesheets().clear();
            scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("../Stylesheets/Style.css")).toExternalForm());
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void abrirInstrucciones() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../views/Instrucciones.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            InstruccionesController mainViewController = loader.getController();

            mainViewController.setApplication(this);

            Scene scene = new Scene(rootLayout);
            scene.getStylesheets().clear();
            scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("../Stylesheets/Style.css")).toExternalForm());
            stage.setTitle("Antes de empezar...");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openPhishingMail(Player player) {
        try {


            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../views/mailPhising.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            correosPhisisngController mainViewController = loader.getController();

            rootLayout.getStyleClass().add("center-view");


            mainViewController.setApplication(this);
            mainViewController.setCurrentPlayer(player);
            rootLayout.setStyle("-fx-orientation: center");

            Scene scene = new Scene(rootLayout);
            scene.getStylesheets().clear();
            scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("../Stylesheets/Style.css")).toExternalForm());
            stage.setTitle("Identificando correos Pishing");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openPhishingMailAssert(Player player) {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../views/correosPhisisngAssert.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            correosPhishingAsserts mainViewController = loader.getController();

            mainViewController.setApplication(this);
            mainViewController.setCurrentPlayer(player);

            Scene scene = new Scene(rootLayout);
            scene.getStylesheets().clear();
            scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("../Stylesheets/Style.css")).toExternalForm());
            stage.setTitle("Que bien! Acertaste");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }





    }

    public void openPhishingMailFailure(Player player) {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../views/correosPhisingFailure.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            correosPhishingAsserts mainViewController = loader.getController();

            mainViewController.setApplication(this);
            mainViewController.setCurrentPlayer(player);

            Scene scene = new Scene(rootLayout);
            scene.getStylesheets().clear();
            scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("../Stylesheets/Style.css")).toExternalForm());
            stage.setTitle("Parece que tienes un error");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openPasswordSelector(Player player) {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../views/passwordSelector.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            passwordSelector mainViewController = loader.getController();

            mainViewController.setApplication(this);
            mainViewController.setCurrentPlayer(player);

            Scene scene = new Scene(rootLayout);
            scene.getStylesheets().clear();
            scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("../Stylesheets/Style.css")).toExternalForm());
            stage.setTitle("Segundo escenario");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void openPasswordAssert(Player player) {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../views/passwordSelectorAssert.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            passwordSelectorAsserts mainViewController = loader.getController();

            mainViewController.setApplication(this);
            mainViewController.setCurrentPlayer(player);

            Scene scene = new Scene(rootLayout);
            scene.getStylesheets().clear();
            scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("../Stylesheets/Style.css")).toExternalForm());
            stage.setTitle("Que bien! Acertaste");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openPasswordFailure(Player player) {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../views/passwordSelectorFailure.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            passwordSelectorAsserts mainViewController = loader.getController();

            mainViewController.setApplication(this);
            mainViewController.setCurrentPlayer(player);

            Scene scene = new Scene(rootLayout);
            scene.getStylesheets().clear();
            scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("../Stylesheets/Style.css")).toExternalForm());
            stage.setTitle("Error:(");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openPhishingStart(Player player) {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../views/mailPhishingStart.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            correosPhisisngController mainViewController = loader.getController();

            mainViewController.setApplication(this);
            mainViewController.setCurrentPlayer(player);

            Scene scene = new Scene(rootLayout);
            scene.getStylesheets().clear();
            scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("../Stylesheets/Style.css")).toExternalForm());
            stage.setTitle("Phishing");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void openMailFailure( Player player) {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../views/failureMail.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            correosPhishingAsserts mainViewController = loader.getController();

            mainViewController.setApplication(this);
            mainViewController.setCurrentPlayer(player);

            Scene scene = new Scene(rootLayout);
            scene.getStylesheets().clear();
            scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("../Stylesheets/Style.css")).toExternalForm());
            stage.setTitle("Fallaste");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void openPasswordStart(Player player) {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../views/passwordStart.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            passwordSelector mainViewController = loader.getController();

            mainViewController.setApplication(this);
            mainViewController.setCurrentPlayer(player);

            Scene scene = new Scene(rootLayout);
            scene.getStylesheets().clear();
            scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("../Stylesheets/Style.css")).toExternalForm());
            stage.setTitle("Fallaste");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openInputName() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../views/nameInput.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            NameInputController mainViewController = loader.getController();

            mainViewController.setApplication(this);

            Scene scene = new Scene(rootLayout);
            scene.getStylesheets().clear();
            scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("../Stylesheets/Style.css")).toExternalForm());
            stage.setTitle("Ingresa tu nombre");
            stage.centerOnScreen();
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public Player createPlayer(String name) {

        return aventura.createPlayer(name);

    }

    public void addPoints(int i, Player player) {
        aventura.addPoints(i, player);
    }

    public void openPasswordFail(Player currentPlayer) {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../views/passwordFail.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            passwordSelectorAsserts mainViewController = loader.getController();

            mainViewController.setApplication(this);
            mainViewController.setCurrentPlayer(currentPlayer);

            Scene scene = new Scene(rootLayout);
            scene.getStylesheets().clear();
            scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("../Stylesheets/Style.css")).toExternalForm());
            stage.setTitle("Fallaste");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openOnlinePurchasesStart(Player currentPlayer) {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../views/onlinePurchasesStart.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            onlinePurchasesController mainViewController = loader.getController();

            mainViewController.setApplication(this);
            mainViewController.setCurrentPlayer(currentPlayer);

            Scene scene = new Scene(rootLayout);
            scene.getStylesheets().clear();
            scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("../Stylesheets/Style.css")).toExternalForm());
            stage.setTitle("Compras en línea");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void openOnlinePurchases(Player currentPlayer) {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../views/onlinePurchases.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            onlinePurchasesController mainViewController = loader.getController();

            mainViewController.setApplication(this);
            mainViewController.setCurrentPlayer(currentPlayer);

            Scene scene = new Scene(rootLayout);
            scene.getStylesheets().clear();
            scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("../Stylesheets/Style.css")).toExternalForm());
            stage.setTitle("Compras en línea");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void openOnlinePurchasesAssert(Player currentPlayer) {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../views/onlinePurchasesAssert.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            onlinePurchasesAsserts mainViewController = loader.getController();

            mainViewController.setApplication(this);
            mainViewController.setCurrentPlayer(currentPlayer);

            Scene scene = new Scene(rootLayout);
            scene.getStylesheets().clear();
            scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("../Stylesheets/Style.css")).toExternalForm());
            stage.setTitle("Acertaste");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void openOnlinePurchasesFail(Player currentPlayer) {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../views/onlinePurchasesFail.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            onlinePurchasesAsserts mainViewController = loader.getController();

            mainViewController.setApplication(this);
            mainViewController.setCurrentPlayer(currentPlayer);

            Scene scene = new Scene(rootLayout);
            scene.getStylesheets().clear();
            scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("../Stylesheets/Style.css")).toExternalForm());
            stage.setTitle("Fallaste");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void openPinStart(Player currentPlayer) {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../views/pinStart.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            pinSelectionController mainViewController = loader.getController();

            mainViewController.setApplication(this);
            mainViewController.setCurrentPlayer(currentPlayer);

            Scene scene = new Scene(rootLayout);
            scene.getStylesheets().clear();
            scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("../Stylesheets/Style.css")).toExternalForm());
            stage.setTitle("PIN en dispositivos móviles");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void openPinSelector(Player currentPlayer) {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../views/pinSelection.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            pinSelectionController mainViewController = loader.getController();

            mainViewController.setApplication(this);
            mainViewController.setCurrentPlayer(currentPlayer);

            Scene scene = new Scene(rootLayout);
            scene.getStylesheets().clear();
            scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("../Stylesheets/Style.css")).toExternalForm());
            stage.setTitle("PIN es dispositivos móviles");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void openPinAssert(Player currentPlayer) {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../views/pinSeletionAssert.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            pinSelectionAsserts mainViewController = loader.getController();

            mainViewController.setApplication(this);
            mainViewController.setCurrentPlayer(currentPlayer);

            Scene scene = new Scene(rootLayout);
            scene.getStylesheets().clear();
            scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("../Stylesheets/Style.css")).toExternalForm());
            stage.setTitle("Acertaste" + currentPlayer.getName());
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void openPinFail(Player currentPlayer) {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../views/PinFail.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            pinSelectionAsserts mainViewController = loader.getController();

            mainViewController.setApplication(this);
            mainViewController.setCurrentPlayer(currentPlayer);

            Scene scene = new Scene(rootLayout);
            scene.getStylesheets().clear();
            scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("../Stylesheets/Style.css")).toExternalForm());
            stage.setTitle("Fallaste");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openPinFailure(Player currentPlayer) {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../views/pinSelectionFailure.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            pinSelectionAsserts mainViewController = loader.getController();

            mainViewController.setApplication(this);
            mainViewController.setCurrentPlayer(currentPlayer);

            Scene scene = new Scene(rootLayout);
            scene.getStylesheets().clear();
            scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("../Stylesheets/Style.css")).toExternalForm());
            stage.setTitle("Haz fallado");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void openConclusion(Player currentPlayer) {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../views/Conclusion.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            ConclusionController mainViewController = loader.getController();

            mainViewController.setCurrentPlayer(currentPlayer);
            mainViewController.setApplication(this);


            Scene scene = new Scene(rootLayout);
            scene.getStylesheets().clear();
            scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("../Stylesheets/Style.css")).toExternalForm());
            stage.setTitle("Felicidades!! " +currentPlayer.getName());
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void shutDownGame() {
        stage.close();
    }

    public void openOnlinePurchasesFailure(Player currentPlayer) {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../views/onlinePurchasesFailure.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            onlinePurchasesAsserts mainViewController = loader.getController();

            mainViewController.setCurrentPlayer(currentPlayer);
            mainViewController.setApplication(this);


            Scene scene = new Scene(rootLayout);
            scene.getStylesheets().clear();
            scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("../Stylesheets/Style.css")).toExternalForm());
            stage.setTitle("Haz fallado");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}