package javaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TwoScenesExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Scene 1");

        // Create a button to switch to Scene2
        Button switchButton = new Button("Switch to Scene 2");
        switchButton.setOnAction(e -> switchToScene2(primaryStage));

        // Create a layout and add the button
        VBox vbox = new VBox(10);
        vbox.getChildren().add(switchButton);

        // Create Scene1 and set it on the primary stage
        Scene scene1 = new Scene(vbox, 200, 200);
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    private void switchToScene2(Stage primaryStage) {
        // Create a button to switch back to Scene1
        Button switchBackButton = new Button("Switch back to Scene 1");
        switchBackButton.setOnAction(e -> switchToScene1(primaryStage));

        // Create a layout and add the button
        VBox vbox = new VBox(10);
        vbox.getChildren().add(switchBackButton);

        // Create Scene2 and set it on the primary stage
        Scene scene2 = new Scene(vbox, 300, 300);
        primaryStage.setScene(scene2);
    }

    private void switchToScene1(Stage primaryStage) {
        // Retrieve the first scene
        Scene scene1 = primaryStage.getScene();

        // Set the first scene back on the primary stage
        primaryStage.setScene(scene1);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
