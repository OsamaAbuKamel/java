package Ch15;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class ResizableCircleRectangle extends Application {
    private Circle circle = new javafx.scene.shape.Circle(60);
    private Rectangle rectangle = new Rectangle(120, 120);
    private StackPane pane = new StackPane();

    @Override
    public void start(Stage arg0) throws Exception {
        circle.setFill(Color.GREY);
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.BLACK);
        pane.getChildren().addAll(rectangle, circle);
        Scene scene = new Scene(pane, 140, 140);
        arg0.setScene(scene);
        arg0.show();
        pane.widthProperty().addListener(ov -> resize());
        pane.heightProperty().addListener(ov -> resize());

    }

    private void resize() {
        double length = Math.min(pane.getWidth(), pane.getHeight());
        circle.setRadius(length / 2 - 15);
        rectangle.setWidth(length - 30);
        rectangle.setHeight(length - 30);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
