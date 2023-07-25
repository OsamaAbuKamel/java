package javaFX;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ListViewDemo extends Application {
    private String[] flagTitles = { "Canada", "China", "Denmark", "France", "Germany", "India", "Norway",
            "United Kingdom",
            "United States of America" };

    @Override
    public void start(Stage arg0) throws Exception {
        ListView<String> listView = new ListView<>(
                FXCollections.observableArrayList(flagTitles));
        listView.setPrefSize(400, 400);
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        BorderPane pane = new BorderPane();
        Scene scene = new Scene(pane, 250, 200);
        arg0.setScene(scene);
        arg0.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
