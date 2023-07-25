package javaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TestSplitPane extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage arg0) throws Exception {
        SplitPane root = new SplitPane();
        root.setPrefSize(400, 400);
        root.setDividerPositions(0.25);

        // AnchorPane left = new AnchorPane();
        // AnchorPane right = new AnchorPane();
        Pane left = new Pane();
        Pane right = new Pane();

        root.getItems().addAll(left, right);

        Scene scene = new Scene(root);
        arg0.setScene(scene);
        arg0.show();

    }
}
