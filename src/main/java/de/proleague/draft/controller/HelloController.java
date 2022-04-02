package de.proleague.draft.controller;

import de.proleague.draft.HelloApplication;
import de.proleague.draft.model.Club;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class HelloController {


    public TextArea textarea;
    public static ObservableList<Club> clubs;


    public void onButtonClick() throws IOException {
        if(textarea.getText().length() != 0){
            clubs = FXCollections.observableArrayList();
            clubs.clear();
            String[] tmp = textarea.getText().split("\n");
            for(int i=0;i<tmp.length;i++) {
                Club toAdd = new Club(i, tmp[i]);
                clubs.add(toAdd);
            }

            HelloApplication.changeScene("overview.fxml");
        }
        else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error: no clubs added");
            alert.setContentText("Please add clubs to draftpool");
            alert.showAndWait();
        }
    }
}