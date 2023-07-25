package Quiz;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Quiz3 extends Application {

    @Override
    public void start(Stage arg0) throws Exception {
        BorderPane borderPane = new BorderPane();
        Circle circle = new Circle(50);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        borderPane.setCenter(circle);
        borderPane.setPadding(new Insets(10));
        HBox box = new HBox(10);
        box.setAlignment(Pos.CENTER);
        Button button = new Button("Cal");
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        Label label = new Label();
        box.getChildren().addAll(button, tf1, tf2, label);
        borderPane.setBottom(box);
        button.setOnAction(e -> {
            double x = Double.parseDouble(tf1.getText());
            double y = Double.parseDouble(tf2.getText());
            label.setText(String.valueOf(x + y));
        });
        Scene scene = new Scene(borderPane, 500, 300);
        arg0.setScene(scene);
        arg0.setTitle("Quiz3");
        arg0.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
