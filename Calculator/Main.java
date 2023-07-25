package Calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage arg0) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Calculator.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        arg0.setScene(scene);
        arg0.setTitle("Calculator");
        arg0.show();
    }
}