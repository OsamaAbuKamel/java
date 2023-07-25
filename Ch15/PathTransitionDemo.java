package Ch15;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class PathTransitionDemo extends Application {

    @Override
    public void start(Stage arg0) throws Exception {
        Pane pane = new Pane();
        Rectangle rectangle = new Rectangle(0, 0, 25, 25);
        rectangle.setFill(Color.ORANGE);
        Circle circle = new Circle(125, 100, 50);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        // Add circle and rectangle to the pane
        pane.getChildren().add(circle);
        pane.getChildren().add(rectangle);

        PathTransition transition = new PathTransition();
        transition.setDuration(Duration.millis(4000));
        transition.setPath(circle);
        transition.setNode(rectangle);
        transition.setOrientation(
                PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        transition.setCycleCount(Timeline.INDEFINITE);
        transition.setAutoReverse(true);
        transition.play();

        circle.setOnMousePressed(e -> transition.pause());
        circle.setOnMouseReleased(e -> transition.play());
        Scene scene = new Scene(pane, 250, 200);
        arg0.setScene(scene);
        arg0.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
