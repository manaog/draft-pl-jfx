package de.proleague.draft.controller;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.util.Duration;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.concurrent.atomic.AtomicInteger;

public class DraftController implements Initializable {
    public Button button;
    public Label draft;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        draft.setText("press \"DRAFT\" to draft first Team");
        button.setText("DRAFT!");
    }

    public void onButtonClick() throws InterruptedException {
        if(HelloController.clubs.size()>0){
            if(HelloController.clubs.size()>1){
                int a = new Random().nextInt(10);
                int before = -1;
                AtomicInteger id = new AtomicInteger();

                Timeline t = new Timeline();
                t.setCycleCount(1);
                t.getKeyFrames().add(new KeyFrame(
                        Duration.millis(200),
                        (ActionEvent event) -> {
                            int tempId = new Random().nextInt(HelloController.clubs.size());
                            if (0 == a) {
                                id.set(tempId);
                            }
                            draft.setText(HelloController.clubs.get(tempId).getName());
                        }
                ));

                t.getKeyFrames().add(new KeyFrame(
                        Duration.millis(400),
                        (ActionEvent event) -> {
                            int tempId = new Random().nextInt(HelloController.clubs.size());
                            while(tempId == before) {
                                tempId = new Random().nextInt(HelloController.clubs.size());
                            }
                            if (0 == a) {
                                id.set(tempId);
                            }
                            draft.setText(HelloController.clubs.get(tempId).getName());
                        }
                ));

                t.getKeyFrames().add(new KeyFrame(
                        Duration.millis(600),
                        (ActionEvent event) -> {
                            int tempId = new Random().nextInt(HelloController.clubs.size());
                            while(tempId == before) {
                                tempId = new Random().nextInt(HelloController.clubs.size());
                            }
                            if (0 == a) {
                                id.set(tempId);
                            }
                            draft.setText(HelloController.clubs.get(tempId).getName());
                        }
                ));

                t.getKeyFrames().add(new KeyFrame(
                        Duration.millis(800),
                        (ActionEvent event) -> {
                            int tempId = new Random().nextInt(HelloController.clubs.size());
                            while(tempId == before) {
                                tempId = new Random().nextInt(HelloController.clubs.size());
                            }
                            if (0 == a) {
                                id.set(tempId);
                            }
                            draft.setText(HelloController.clubs.get(tempId).getName());
                        }
                ));

                t.getKeyFrames().add(new KeyFrame(
                        Duration.millis(1000),
                        (ActionEvent event) -> {
                            int tempId = new Random().nextInt(HelloController.clubs.size());
                            while(tempId == before) {
                                tempId = new Random().nextInt(HelloController.clubs.size());
                            }
                            if (0 == a) {
                                id.set(tempId);
                            }
                            draft.setText(HelloController.clubs.get(tempId).getName());
                        }
                ));

                t.getKeyFrames().add(new KeyFrame(
                        Duration.millis(1200),
                        (ActionEvent event) -> {
                            int tempId = new Random().nextInt(HelloController.clubs.size());
                            while(tempId == before) {
                                tempId = new Random().nextInt(HelloController.clubs.size());
                            }
                            if (0 == a) {
                                id.set(tempId);
                            }
                            draft.setText(HelloController.clubs.get(tempId).getName());
                        }
                ));

                t.getKeyFrames().add(new KeyFrame(
                        Duration.millis(1400),
                        (ActionEvent event) -> {
                            int tempId = new Random().nextInt(HelloController.clubs.size());
                            while(tempId == before) {
                                tempId = new Random().nextInt(HelloController.clubs.size());
                            }
                            if (0 == a) {
                                id.set(tempId);
                            }
                            draft.setText(HelloController.clubs.get(tempId).getName());
                        }
                ));

                t.getKeyFrames().add(new KeyFrame(
                        Duration.millis(1600),
                        (ActionEvent event) -> {
                            int tempId = new Random().nextInt(HelloController.clubs.size());
                            while(tempId == before) {
                                tempId = new Random().nextInt(HelloController.clubs.size());
                            }
                            if (0 == a) {
                                id.set(tempId);
                            }
                            draft.setText(HelloController.clubs.get(tempId).getName());
                        }
                ));

                t.getKeyFrames().add(new KeyFrame(
                        Duration.millis(1800),
                        (ActionEvent event) -> {
                            int tempId = new Random().nextInt(HelloController.clubs.size());
                            while(tempId == before) {
                                tempId = new Random().nextInt(HelloController.clubs.size());
                            }
                            if (0 == a) {
                                id.set(tempId);
                            }
                            draft.setText(HelloController.clubs.get(tempId).getName());
                        }
                ));

                t.getKeyFrames().add(new KeyFrame(
                        Duration.millis(2000),
                        (ActionEvent event) -> {
                            int tempId = new Random().nextInt(HelloController.clubs.size());
                            while(tempId == before) {
                                tempId = new Random().nextInt(HelloController.clubs.size());
                            }
                            if (0 == a) {
                                id.set(tempId);
                            }
                            draft.setText(HelloController.clubs.get(tempId).getName());
                        }
                ));

                t.getKeyFrames().add(new KeyFrame(
                        Duration.millis(2200),
                        (ActionEvent event) -> {
                            draft.setText(HelloController.clubs.get(id.get()).getName());
                        }
                ));
                t.play();
                t.setOnFinished((ActionEvent event) -> {
                    System.out.println("drafted Club is: " + HelloController.clubs.get(id.get()).getName());
                    draft.setText(HelloController.clubs.get(id.get()).getName());
                    HelloController.clubs.remove(HelloController.clubs.get(id.get()));
                });
            } else {
                System.out.println("drafted Club is: " + HelloController.clubs.get(0).getName());
                draft.setText(HelloController.clubs.get(0).getName());
                HelloController.clubs.remove(HelloController.clubs.get(0));
            }
//            int a = new Random().nextInt(10);
//            int id = 0;
//            for(int i = 0;i<10;i++) {
//                int tempId = new Random().nextInt(HelloController.clubs.size());
//                draft.setText(HelloController.clubs.get(tempId).getName());
//                if (i == a) {
//                   id = tempId;
//                }
//            }
//            draft.setText(HelloController.clubs.get(id).getName());
//            HelloController.clubs.remove(id);

        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Finished");
            alert.setContentText("All clubs have been drafted");
            alert.showAndWait();
        }
    }


}