package de.proleague.draft;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    public static Stage mainStage;

    @Override
    public void start(Stage stage) throws IOException {
        mainStage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Draft Proleague.de");
        stage.setScene(scene);
        stage.show();
    }

    public static void changeScene(String scene) throws IOException {
        Parent pane = FXMLLoader.load(HelloApplication.class.getResource(scene));
        mainStage.getScene().setRoot(pane);
    }

    public static void main(String[] args) {
        launch();
    }
}