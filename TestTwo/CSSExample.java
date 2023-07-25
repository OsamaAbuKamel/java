package TestTwo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class CSSExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button button = new Button("Click me!");
        button.setId("id");
        Scene scene = new Scene(new StackPane(button), 500, 400);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();

        // Load the CSS file.

        // Add the CSS file to the scene.

    }

    public static void main(String[] args) {
        launch(args);
    }
}