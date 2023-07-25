package com.example.phase3gui;


import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class Update extends GridPane {
    private TextField tfTitle = new TextField();
    private Label laTitle = new Label("new Title");
    private Label laItemId = new Label("new Item ID");
    private TextField tfItemId = new TextField();
    private Label laNumberOfCopies = new Label("new Number of Copies");
    private TextField tfNumberOfCopies = new TextField();
    private Label laAuthor = new Label("new Author");
    private TextField tfAuthor = new TextField();
    private Label laISBN = new Label("ISBN");
    private TextField tfISBN = new TextField();
    private Button btUpdate = new Button("Update");
    private HBox hbox = new HBox(10);
    private Button btCancel = new Button("Cancel");

    private Library library;

    public Update(Library library) {
        this.library = library;
        setPadding(new Insets(25));
        setVgap(20);
        setHgap(20);
        add(laISBN, 0, 0);
        add(tfISBN, 1, 0);
        add(laItemId, 0, 1);
        add(tfItemId, 1, 1);
        add(laNumberOfCopies, 0, 2);
        add(tfNumberOfCopies, 1, 2);
        add(laAuthor, 0, 3);
        add(tfAuthor, 1, 3);
        add(laTitle, 0, 4);
        add(tfTitle, 1, 4);
        hbox.getChildren().addAll(btUpdate, btCancel);
        add(hbox, 1, 5);

        handle();
    }

    //clear textFields
    private void clear() {
        tfTitle.clear();
        tfItemId.clear();
        tfNumberOfCopies.clear();
        tfAuthor.clear();
        tfISBN.clear();
    }

    private void handle() {
        btUpdate.setOnAction(e -> {
            if (tfTitle == null) {
                showAlert(Alert.AlertType.ERROR, "Update", "Update", "Please enter a title");
                return;
            } else if (tfItemId == null) {
                showAlert(Alert.AlertType.ERROR, "Update", "Update", "Please enter a title");
                return;
            } else if (tfNumberOfCopies == null) {
                return;
            } else if (tfAuthor == null) {
                showAlert(Alert.AlertType.ERROR, "Update", "Update", "Please enter a title");
                return;
            } else if (tfISBN == null) {
                showAlert(Alert.AlertType.ERROR, "Update", "Update", "Please enter a title");
                return;
            } else {
                try {
                    library.updateLibraryItem(tfISBN.getText(), tfTitle.getText(),
                            Integer.parseInt(tfItemId.getText()), Integer.parseInt(tfNumberOfCopies.getText()),
                            new Name(tfAuthor.getText()));
                    clear();

                } catch (Exception e1) {
                    showAlert(Alert.AlertType.ERROR, "Update", "Update", e1.getMessage());
                }
            }
        });
        btCancel.setOnAction(e -> {
            clear();
        });
    }

    //display alert
    private void showAlert(Alert.AlertType alert, String title, String header, String content) {
        Alert alert1 = new Alert(alert);
        alert1.setTitle(title);
        alert1.setHeaderText(header);
        alert1.setContentText(content);
        alert1.showAndWait();
    }
}
