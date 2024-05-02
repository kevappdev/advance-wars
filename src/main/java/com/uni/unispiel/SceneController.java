package com.uni.unispiel;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.imageio.IIOException;
import java.io.IOException;

public class SceneController {

    private static Stage stage;

    public static void init(Stage stage) throws IOException {
        SceneController.stage = stage;
        SceneController.switchScene("start-view.fxml");
    }

    public static void switchScene(String sceneName) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource(sceneName));
        Scene scene = new Scene(fxmlLoader.load(), Globals.SCENE_SIZE, Globals.SCENE_SIZE);
        ControllerImplement controller = fxmlLoader.getController();
        controller.init(stage);
        stage.setTitle(Globals.GAME_TITLE);
        stage.setScene(scene);
    }

}
