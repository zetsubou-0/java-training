package com.training.coolproject.justtraining.ui.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by Torus on 21.11.2016.
 */
public class MainWindow extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/com/training/coolproject/justtraining/ui/fxml/mainWindow.fxml"));
        primaryStage.setTitle("Main Window");
        primaryStage.setScene(new Scene(root, 400, 600));
        primaryStage.setMinHeight(400);
        primaryStage.setMinWidth(600);
        primaryStage.show();
    }

    public void startApp(String[] args) {
        launch(args);
    }
}
