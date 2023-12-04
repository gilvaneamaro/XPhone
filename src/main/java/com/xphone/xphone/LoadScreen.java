package com.xphone.xphone;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import utils.Alerts;

import java.io.IOException;

public class LoadScreen {

    @FXML
    public void openTelaCadastroCliente(ActionEvent event) {
        try {
            loadView("cadastro-view.fxml");
        } catch (IOException e) {
            Alerts.showAlert("ERRO", "Erro", "Erro ao tentar trocar tela", Alert.AlertType.ERROR);
            throw new RuntimeException(e);
        }
    }

    public void loadView(String absoluteName) throws IOException {
        FXMLLoader loader = new FXMLLoader(MainScreen.class.getResource(absoluteName));
        AnchorPane pane = loader.load();
        Scene mainScene = MainScreen.getMainScene();
        AnchorPane mainAnchorPane = (AnchorPane) mainScene.getRoot();
        mainAnchorPane.getChildren().clear();
        mainAnchorPane.getChildren().addAll(pane.getChildren());
    }

}
