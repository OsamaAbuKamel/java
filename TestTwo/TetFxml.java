package TestTwo;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class TetFxml extends Application {

    @Override
    public void start(Stage arg0) throws Exception {
        try {
            Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("gg.fxml"));
            javafx.scene.Scene scene = new javafx.scene.Scene(root);
            scene.getStylesheets().add(getClass().getResource("TestCss.css").toExternalForm());
            arg0.setScene(scene);
            arg0.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
