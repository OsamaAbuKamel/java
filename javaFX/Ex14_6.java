package javaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Ex14_6 extends Application {

    @Override
    public void start(Stage arg0) throws Exception {
        Color color = Color.BLACK;
        Pane pane = new Pane();
        for (int i = 0; i < 65; i++) {
            for (int j = 0; j < i; j++) {
                Rectangle rectangle = new Rectangle(50, 50, 50, 50);
                rectangle.setFill(color);
                pane.getChildren().addAll(rectangle);

            }
        }
        Scene scene = new Scene(pane, 400, 300);
        arg0.setTitle("STYLESHEET_CASPIAN");
        arg0.setScene(scene);
        arg0.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
