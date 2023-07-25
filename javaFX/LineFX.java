package javaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class LineFX extends Application {

    @Override
    public void start(Stage arg0) throws Exception {
        // Line line = new Line();
        // Line line1 = new Line();
        // line1.setStartX(100);
        // line1.setStartY(100);
        // line1.setEndX(200);
        // line1.setEndY(200);
        // line.setStartX(100);
        // line.setStartY(100);
        // line.setEndX(200);
        // line.setEndY(200);
        // line.rotateProperty().set(90);
        // line.setStroke(Color.RED);
        // line.setStrokeWidth(5);
        // line1.setStroke(Color.RED);
        // line1.setStrokeWidth(5);
        // line.endXProperty().bind(widthProperty().subtract(10));
        // line.endYProperty().bind(heightProperty().subtract(10));
        // line1.endXProperty().bind(widthProperty().subtract(10));
        // line1.endYProperty().bind(heightProperty().subtract(10));

        Scene scene = new Scene(new LinePane(), 200, 200);
        arg0.setTitle("LineFX");
        arg0.setScene(scene);
        arg0.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

class LinePane extends Pane {
    public LinePane() {
        Line line1 = new Line(10, 10, 10, 10);
        line1.endXProperty().bind(widthProperty().subtract(10));
        line1.endYProperty().bind(heightProperty().subtract(10));
        line1.setStrokeWidth(5);
        line1.setStroke(Color.GREEN);
        getChildren().add(line1);

        Line line2 = new Line(10, 10, 10, 10);
        line2.startXProperty().bind(widthProperty().subtract(10));
        line2.endYProperty().bind(heightProperty().subtract(10));
        line2.setStrokeWidth(5);
        line2.setStroke(Color.GREEN);
        getChildren().add(line2);
    }
}