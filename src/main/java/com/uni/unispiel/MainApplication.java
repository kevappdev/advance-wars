package com.uni.unispiel;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        this.initStage(stage);
        this.initScene(stage);
        stage.show();
    }

    private void initStage(Stage stage) throws IOException {
        stage.setTitle(Globals.GAME_TITLE);
        stage.setMaxWidth(Globals.WINDOW_SIZE);
        stage.setMinWidth(Globals.WINDOW_SIZE);
        stage.setMaxHeight(Globals.WINDOW_SIZE);
        stage.setMinHeight(Globals.WINDOW_SIZE);
    }

    private void initScene(Stage stage) throws IOException {
        SceneController.init(stage);
    }


    public static void main(String[] args) {
        launch();
    }
}