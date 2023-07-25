package javaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ControlCircleWithoutEventHandling extends Application {
    private CirclePane circlePane = new CirclePane();

    @Override
    public void start(Stage arg0) throws Exception {

        HBox box = new HBox();
        box.setSpacing(10);
        box.setAlignment(Pos.CENTER);
        Button btEnlarge = new Button("Enlarge");
        Button btShrink = new Button("Shrink");
        box.getChildren().addAll(btEnlarge, btShrink);
        btEnlarge.setOnAction(new EnlargeHandler());
        btShrink.setOnAction(e -> {
            circlePane.shrink();
        });
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(circlePane);
        borderPane.setBottom(box);
        borderPane.setAlignment(box, Pos.CENTER);
        Scene scene = new Scene(borderPane, 400, 300);
        arg0.setScene(scene);
        arg0.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    class EnlargeHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent arg0) {
            circlePane.enlarge();
        }

    }
}

class CirclePane extends StackPane {
    private Circle circle = new Circle(50);

    public CirclePane() {
        getChildren().add(circle);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.BLUE);
    }

    public void enlarge() {
        circle.setRadius(circle.getRadius() + 5);
    }

    public void shrink() {
        circle.setRadius(circle.getRadius() > 5 ? circle.getRadius() - 5 : circle.getRadius());
    }
}