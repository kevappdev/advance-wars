package com.uni.unispiel;

import javafx.stage.Stage;

import java.io.IOException;

public class StartController implements ControllerImplement {

    public void startGame() throws IOException {
        SceneController.switchScene("game-view.fxml");
    }

    Stage stage;


    @Override
    public void init(Stage stage) {
        this.stage = stage;
    }
}