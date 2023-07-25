package javaFX;

import javafx.application.Application;
import javafx.geometry.Side;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Tabe extends Application {

    @Override
    public void start(Stage arg0) throws Exception {
        GridPane pane = new GridPane();
        TabPane root = new TabPane();
        root.autosize();
        root.setRotateGraphic(true);
        root.setTabMaxHeight(50);
        root.setTabMinHeight(50);
        root.setTabMaxWidth(50);
        root.setTabMinWidth(50);

        root.setSide(Side.LEFT);
        Tab tab1 = new Tab("Tab 1");
        Tab tab2 = new Tab("Tab 2");
        tab1.setClosable(false);
        tab2.setClosable(false);
        tab1.setStyle(
                "-fx-background-color: red; -fx-rotate:90;");
        tab2.setStyle(
                "-fx-background-color: blue; -fx-rotate:90;");
        tab1.setContent(new Button("Click me"));
        root.getTabs().addAll(tab1, tab2);
        HBox vbox = new HBox();
        vbox.getChildren().add(new Button("Click me"));
        // pane.add(root, 1, 0);
        // pane.add(vbox, 0, 0);
        pane.setHgap(20);
        pane.setVgap(20);
        arg0.setTitle("Hello @FontFace");
        arg0.setScene(new javafx.scene.Scene(root, 400, 300));
        arg0.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
