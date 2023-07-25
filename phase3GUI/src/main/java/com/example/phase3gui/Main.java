package com.example.phase3gui;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class Main extends VBox {
    private Label label = new Label();
    private String path = "imageLibrary.png";
    private ImageView imageView = new ImageView(path);

    public Main() {
        label.setText("Welcome To The Library");
        label.setId("labelMain");
        setAlignment(Pos.CENTER);
        imageView.setFitWidth(400);
        imageView.setFitHeight(400);
        getChildren().addAll(label, imageView);

    }

}
