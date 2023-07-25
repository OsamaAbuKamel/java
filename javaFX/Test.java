package javaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Test extends Application {

    @Override
    public void start(Stage arg0) throws Exception {
        String css = getClass().getResource("main.css").toExternalForm();
        VBox root = new VBox(10);
        Button btn = new Button("Click me");
        btn.setId("btn");
        Button btn2 = new Button("Click me");
        btn2.setId("btn2");
        root.getChildren().addAll(btn, btn2);
        Scene scene = new Scene(root, 400, 300);
        scene.getStylesheets().add(css);
        arg0.setTitle("Hello @FontFace");
        arg0.setScene(scene);
        arg0.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
