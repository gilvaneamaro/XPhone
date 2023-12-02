package com.xphone.xphone;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import utils.Alerts;

import java.io.IOException;

public class MainScreen  extends Application {
    private static Scene mainScene;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainScreen.class.getResource("initial-screen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1200, 900);
        mainScene = new Scene(fxmlLoader.load(), 900, 600);
        stage.setTitle("XPhone");
        stage.setScene(scene);
        stage.show();
    }
    public static Scene getMainScene(){
        return mainScene;
    }
    public static void main(String[] args) {
        launch();
    }
}
