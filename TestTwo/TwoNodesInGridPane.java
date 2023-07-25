package TestTwo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TwoNodesInGridPane extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Create the GridPane
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // Create the nodes
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");

        // Add the nodes to the same position in the GridPane
        GridPane.setConstraints(button1, 0, 0);
        gridPane.getChildren().add(button1);

        GridPane.setConstraints(button2, 0, 0);
        gridPane.getChildren().add(button2);

        // Create the scene and set it on the stage
        Scene scene = new Scene(gridPane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
