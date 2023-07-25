package TestTwo;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CheckPoint extends Application {
    public static void main(String[] args) {

    }

    @Override
    public void start(Stage arg0) throws Exception {
        Parent s = FXMLLoader.load(getClass().getResource("gg.fxml"));

        Scene scene = new Scene(s);
        arg0.setScene(scene);
        arg0.show();

    }
}
