package com.example.phase3gui;

import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadButton extends GridPane {
    private Button next = new Button("Next");
    private Button pre = new Button("Previous");
    private List<String> bookList;
    private int currentIndex;
    private Button btRead = new Button("Select File");
    private FileChooser fileChooser = new FileChooser();
    private TextField textField = new TextField();
    private Button btClear = new Button("Clear");

    public ReadButton(Stage stage) {
        bookList = new ArrayList<>();
        currentIndex = 0;
        textField.setId("text");
        textField.setEditable(false);
        setPadding(new Insets(10));
        setVgap(10);
        setHgap(10);
        //call method handle
        handle(stage);
        add(btRead, 0, 0);
        add(textField, 0, 1);
        add(pre, 0, 2);
        add(next, 1, 2);
        add(btClear, 1, 0);

    }

    private void handle(Stage stage) {
        // Event handler for the "Select File" button
        btRead.setOnAction(e -> {
            File selectedFile = fileChooser.showOpenDialog(stage);
            if (selectedFile != null) {
                String fileName = selectedFile.getName();
                read(fileName);
            } else {
                showAlert("No file selected.");
            }
        });
        // Event handler for the "Next" button
        next.setOnAction(e -> {
            if (currentIndex < bookList.size() - 1) {
                currentIndex++;
                information();
            }
        });
        // Event handler for the "Previous" button
        pre.setOnAction(e -> {
            if (currentIndex > 0) {
                currentIndex--;
                information();
            }
        });
        // Event handler for the "Clear" button
        btClear.setOnAction(e -> {
            bookList.clear();
            textField.clear();
        });

    }
    // Display the information of the current book
    private void information() {
        String bookInfo = bookList.get(currentIndex);
        textField.setText(bookInfo);

        if (currentIndex == 0) {
            pre.setDisable(true);
        } else {
            pre.setDisable(false);
        }

        if (currentIndex == bookList.size() - 1) {
            next.setDisable(true);
        } else {
            next.setDisable(false);
        }
    }
    // Read book data from a file and populate the book list
    private void read(String fileName) {
        try {
            Scanner scanner = new Scanner(new File(fileName));
            bookList.clear();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                bookList.add(line);
            }
            scanner.close();

            if (!bookList.isEmpty()) {
                currentIndex = 0;
                information();
            } else {
                showAlert("Empty file. No book data found.");
            }
        } catch (FileNotFoundException e) {
            showAlert("File not found: " + fileName);
        }
    }
    // Display an alert dialog with an error message
    private void showAlert(String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("Error");
        alert.setContentText(message);
        alert.showAndWait();
    }
}