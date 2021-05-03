package dk.eamv.ferrari.presentation;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class App extends Application {
    private FXMLLoader loader = new FXMLLoader();
    private Parent root;
    public static Stage stage = new Stage();
    public static Stage popupStage = new Stage();
    public static Scene sceneMain;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage pStage) throws Exception {
        popupStage.initModality(Modality.APPLICATION_MODAL);
        popupStage.initOwner(stage);
        loader.setLocation(getClass().getResource("Main.fxml"));
        root = loader.load();
        sceneMain = new Scene(root);
        stage.setScene(sceneMain);
        stage.setTitle("Main View");
        stage.show();
    }
}