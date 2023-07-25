package com.example.phase3gui;



import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Search extends GridPane {
    private Label laISBN = new Label("ISBN");
    private TextField tfISBN = new TextField();
    private Button btSearch = new Button("Search");
    private Library library;

    public Search(Library library) {
        this.library = library;
        setHgap(10);
        setVgap(10);
        setPadding(new Insets(25));
        add(laISBN, 0, 0);
        add(tfISBN, 1, 0);
        add(btSearch, 2, 0);
        handle();
    }

    private void handle() {
        // Event handler for the "Search" button
        btSearch.setOnAction(e -> {
            // searchItem();
            if (tfISBN == null) {
                showAlert(Alert.AlertType.WARNING, "Search", "Search", "Please Enter Title");
                return;
            } else {
                LibraryItem item = library.searchForItem(tfISBN.getText());
                if (item != null) {
                    showAlert(Alert.AlertType.INFORMATION, "Search Result", "Book Found",
                            item.toString());
                } else {
                    showAlert(Alert.AlertType.INFORMATION, "Search Result", "Book Found",
                            "The requested book could not be found.");
                }
            }
            tfISBN.clear();
        });
    }

    private void showAlert(Alert.AlertType alert, String title, String header, String content) {
        Alert alert1 = new Alert(alert);
        alert1.setTitle(title);
        alert1.setHeaderText(header);
        alert1.setContentText(content);
        alert1.showAndWait();
    }
}
