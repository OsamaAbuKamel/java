import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class F2 extends Application {
    private Button button = new Button("Add");
    private GridPane gridPane = new GridPane();

    @Override
    public void start(Stage arg0) throws Exception {
        Label label = new Label("STYLESHEET_CASPIAN");
        Label label1 = new Label("STYLESHEET_CASPIAN");
        TextField field = new TextField();
        TextField field1 = new TextField();
        BorderPane borderPane = new BorderPane();
        // borderPane.setCenter(button);
        // borderPane.setLeft(label);
        // borderPane.setTop(label1);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10));
        gridPane.add(label, 0, 0);
        gridPane.add(field, 1, 0);
        gridPane.add(label1, 0, 1);
        gridPane.add(field1, 1, 1);
        gridPane.add(button, 0, 2);
        gridPane.setHalignment(button, HPos.RIGHT);
        gridPane.setAlignment(Pos.CENTER);
        // HBox box = new HBox(10);
        // box.getChildren().addAll(label, label1);
        // button.setOnAction(new EventHandler<ActionEvent>() {
        // @Override
        // public void handle(ActionEvent arg0) {
        // System.out.println("ADD3");
        // }
        // });
        Font font = Font.font(STYLESHEET_CASPIAN, null, null, 0);
        Font font1 = new Font(STYLESHEET_CASPIAN, 0);
        button.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case ENTER:
                    System.out.println("ADD$");
                    break;
                default:
                    break;
            }
        });
        gridPane.requestFocus();
        button.setOnAction(e -> {
            System.out.println("ADD4");
        });
        Scene scene = new Scene(gridPane, 400, 300);
        arg0.setScene(scene);
        arg0.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    class AddHandel1 implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent arg0) {
            System.out.println("ADD1");
        }
    }

}

class AddHandel implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent arg0) {
        System.out.println("ADD");
    }

}
