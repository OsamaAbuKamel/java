package javaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AnonymousHandlerDemo extends Application {
    private Button btUp = new Button("UP");
    private Button btDown = new Button("DOWN");
    private Button btLeft = new Button("LEFT");
    private Button btRight = new Button("RIGHT");
    private Text text = new Text(40, 40, "PROGRAMMING IS FUN ");

    @Override
    public void start(Stage arg0) throws Exception {
        Pane pane = new Pane();
        HBox hBox2 = new HBox(10);
        pane.getChildren().addAll(text);
        btUp.setOnAction(new UpHandler());
        btDown.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                text.setY(text.getY() < pane.getHeight() ? text.getY() + 5 : pane.getHeight());
            }
        });
        btLeft.setOnAction(e -> {
            text.setX(text.getX() > 0 ? text.getX() - 5 : 0);
        });
        btRight.setOnAction(e -> {
            text.setX(text.getX() < pane.getWidth() - 100 ? text.getX() + 5 : pane.getWidth() - 100);

        });
        hBox2.setAlignment(Pos.CENTER);
        hBox2.getChildren().addAll(btUp, btDown, btLeft, btRight);
        BorderPane borderPane = new BorderPane(pane);
        borderPane.setBottom(hBox2);
        Scene scene = new Scene(borderPane, 400, 300);
        arg0.setScene(scene);
        arg0.show();
        ;
    }

    public static void main(String[] args) {
        launch(args);
    }

    class UpHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent arg0) {
            text.setY(text.getY() > 10 ? text.getY() - 5 : 10);
        }
    }
}