package de.proleague.draft.controller;

import de.proleague.draft.HelloApplication;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class OverviewController implements Initializable {
    public Button button;

    public TextFlow textflow;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String toInsert = "";
        for(int i=0;i<HelloController.clubs.size();i++) {
            toInsert = toInsert + HelloController.clubs.get(i).getName();
            toInsert = toInsert +"\n";
        }
        textflow.getChildren().add(new Text(toInsert));
    }


    public void onButtonClick() throws IOException {
        HelloApplication.changeScene("draft.fxml");
    }
}