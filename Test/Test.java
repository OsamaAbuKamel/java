package Test;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

// import javafx classes omitted
public class Test extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Code to create and display pane omitted
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 200, 250);
        primaryStage.setTitle("MyJavaFX"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        pane.requestFocus();
        pane.setOnKeyPressed(e -> System.out.print("Key pressed " + e.getCode() + " "));
        pane.setOnKeyTyped(e -> System.out.println("Key typed " + e.getCode()));
    }

    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}