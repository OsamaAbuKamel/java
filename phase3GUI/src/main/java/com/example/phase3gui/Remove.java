package com.example.phase3gui;


import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class Remove extends GridPane {
    private Label laISBN = new Label("ISBN");
    private TextField tfISBN = new TextField();
    Button btRemove = new Button("Remove");
    private Library library;

    public Remove(Library library) {
        this.library = library;
        setPadding(new Insets(25));
        setHgap(10);
        setVgap(10);
        add(laISBN, 0, 0);
        add(tfISBN, 1, 0);
        add(btRemove, 2, 0);
        //call method handle;
        handle();
    }

    private void handle() {
        // Event handler for the "Remove" button
        btRemove.setOnAction(e -> {
            if (tfISBN == null) {
                showAlert(Alert.AlertType.ERROR, "Remove", "Remove", "Please Enter ISBN ");
                return;
            } else {
                try {
                    library.removeItem(tfISBN.getText());
                    tfISBN.clear();
                } catch (IllegalArgumentException e1) {
                    showAlert(Alert.AlertType.ERROR, "Remove", "Remove", e1.getMessage());
                    return;
                } catch (Exception e2) {
                    showAlert(Alert.AlertType.ERROR, "Remove", "Remove", e2.getMessage());
                    return;
                }
            }
        });
    }
    //Display Alert
    private void showAlert(Alert.AlertType alert, String title, String header, String content) {
        Alert alert1 = new Alert(alert);
        alert1.setTitle(title);
        alert1.setHeaderText(header);
        alert1.setContentText(content);
        alert1.showAndWait();
    }
}
