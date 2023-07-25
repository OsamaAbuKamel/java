package com.example.phase3gui;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainGUI extends Application {
    private VBox box = new VBox();
    private MyMenus menu;
    private TabPanes tabPanes;
    private Scene scene;
    private Image icon = new Image(getClass().getResourceAsStream("library.png"));
    private String css = this.getClass().getResource("style.css").toExternalForm();
    private Library library = new Library();

    @Override
    public void start(Stage primaryStage) throws Exception {
        tabPanes = new TabPanes(library, primaryStage);
        // box.setStyle("-fx-background-color: #ffffff");
        menu = new MyMenus(primaryStage, library);
        tabPanes.prefHeightProperty().bind(primaryStage.heightProperty());
        box.getChildren().addAll(menu, tabPanes);
        scene = new Scene(box,750,550);
//        primaryStage.setMaximized(true);
        scene.getStylesheets().add(css);
        primaryStage.setTitle("Library");
        primaryStage.setScene(scene);
        primaryStage.getIcons().add(icon);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
