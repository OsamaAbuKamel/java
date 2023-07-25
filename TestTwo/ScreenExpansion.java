package TestTwo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ScreenExpansion extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();

        // Create a button that will expand the screen.
        Button expandButton = new Button("Expand Screen");
        expandButton.setOnAction(event -> {
            // Get the current stage.
            Stage stage = (Stage) expandButton.getScene().getWindow();

            // Expand the stage to fill the screen.
            stage.setMaximized(true);
        });

        // Create a label that will display the name of the stage.
        Label nameLabel = new Label();
        nameLabel.textProperty().bind(primaryStage.titleProperty());

        // Add the button and the label to the root pane.
        root.getChildren().addAll(expandButton, nameLabel);

        // Create a scene and set it on the stage.
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();

        // Add a mouse event handler to the stage.
        primaryStage.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            // Get the scene's position.
            double sceneX = scene.getX();
            double sceneY = scene.getY();

            // Get the mouse position.
            double mouseX = event.getSceneX();
            double mouseY = event.getSceneY();

            // Expand the stage to the mouse position.
            primaryStage.setX(mouseX + sceneX);
            primaryStage.setY(mouseY + sceneY);
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
