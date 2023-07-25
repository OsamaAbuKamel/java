import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class F1 extends Application {

    @Override
    public void start(Stage arg0) throws Exception {
        FlowPane flowPane = new FlowPane();
        flowPane.getChildren().addAll(new Label("Label1"), new Button("Button1"),
                new Label("Label2"), new Button("Button2"), new Label("Label3"),
                new Button("Button3"));

        flowPane.setOrientation(Orientation.VERTICAL);
        Scene scene = new Scene(flowPane, 400, 300);
        arg0.setScene(scene);
        arg0.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
