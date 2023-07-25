package com.example.phase3gui;

import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class AddBook extends GridPane {

    private TextField tfTitle = new TextField();
    private Label laTitle = new Label("Title");
    private Label laItemId = new Label("Item ID");
    private TextField tfItemId = new TextField();
    private Label laNumberOfCopies = new Label("Number of Copies");
    private TextField tfNumberOfCopies = new TextField();
    private Label laAuthor = new Label("Author");
    private TextField tfAuthor = new TextField();
    private Label laISBN = new Label("ISBN");
    private TextField tfISBN = new TextField();
    private Button btAdd = new Button("Add");
    private Button btCancel = new Button("Cancel");
    private HBox hbox = new HBox(10);
    private Library library;

    public AddBook(Library library) {
        this.library = library;
        setId("addBook");
        // setAlignment(Pos.CENTER);
        setPadding(new Insets(25));
        setVgap(20);
        setHgap(20);
        add(laTitle, 0, 0);
        add(tfTitle, 1, 0);
        add(laItemId, 0, 1);
        add(tfItemId, 1, 1);
        add(laNumberOfCopies, 0, 2);
        add(tfNumberOfCopies, 1, 2);
        add(laAuthor, 0, 3);
        add(tfAuthor, 1, 3);
        add(laISBN, 0, 4);
        add(tfISBN, 1, 4);
        // add(btAdd, 1, 5, 1, 2);
        hbox.getChildren().addAll(btAdd, btCancel);
        add(hbox, 1, 5);

        handle();
    }

    private void clear() {
        tfTitle.clear();
        tfItemId.clear();
        tfNumberOfCopies.clear();
        tfAuthor.clear();
        tfISBN.clear();
    }

    private void handle() {
        btAdd.setOnAction(e -> {
            if (tfTitle == null) {
                showAlert(Alert.AlertType.ERROR, "Add", "Add", "Please enter a title");
                return;
            } else if (tfItemId == null) {
                showAlert(Alert.AlertType.ERROR, "Add", "Add", "Please enter a item id");
                return;
            } else if (tfNumberOfCopies == null) {
                showAlert(Alert.AlertType.ERROR, "Add", "Add", "Please enter a number of copies");

                return;
            } else if (tfAuthor == null) {
                showAlert(Alert.AlertType.ERROR, "Add", "Add", "Please enter a author name");
                return;
            } else if (tfISBN == null) {
                showAlert(Alert.AlertType.ERROR, "Add", "Add", "Please enter a isbn");
                return;
            } else {
                try {
                    library.addLibraryItem(tfTitle.getText(), Integer.parseInt(tfItemId.getText()),
                            Integer.parseInt(tfNumberOfCopies.getText()), new Name(tfAuthor.getText()),
                            tfISBN.getText());
                    clear();

                } catch (IllegalArgumentException e1) {
                    showAlert(Alert.AlertType.ERROR, "Add", "Add", e1.getMessage());
                    return;
                }
            }
        });
        btCancel.setOnAction(e -> {
            clear();
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
