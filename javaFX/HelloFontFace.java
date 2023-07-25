package javaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloFontFace extends Application {
    @Override
    public void start(Stage primaryStage) {
        String css = HelloFontFace.class.getResource("main.css").toExternalForm();
        Label label = new Label("Hello @FontFace");
        // label.setStyle("-fx-font-family: sample; -fx-font-size: 80;");
        Scene scene = new Scene(label);
        scene.getStylesheets().add(css);
        primaryStage.setTitle("Hello @FontFace");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}