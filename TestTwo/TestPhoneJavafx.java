package TestTwo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TestPhoneJavafx extends Application {

    @Override
    public void start(Stage arg0) throws Exception {
        Pane pane = new Pane();
        pane.setStyle("-fx-background-color:red;");
        Scene scene = new Scene(pane, 360, 800);
        arg0.setScene(scene);
        arg0.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
