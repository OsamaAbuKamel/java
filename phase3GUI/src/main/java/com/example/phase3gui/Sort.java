package com.example.phase3gui;

import java.io.File;
import java.io.IOException;


import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Sort extends BorderPane {
    private ObservableList<LibraryItem> libraryItems;
    private Button btSort = new Button("Sort");
    private Button btExport = new Button("Export");
    private Button btClear = new Button("Clear");
    private TableView tableView = new TableView<>();
    private FileChooser chooser = new FileChooser();

    private Library library;
    private HBox hBox = new HBox();

    public Sort(ObservableList<LibraryItem> libraryItems, Library library, Stage stage) {
        this.libraryItems = libraryItems;
        this.library = library;
        btSort.setId("sort");
        btExport.setId("sort");
        btClear.setId("sort");


        tableView.setItems(libraryItems);

        TableColumn<LibraryItem, String> colTitle = new TableColumn<>("Title");
        colTitle.setMinWidth(118);
        colTitle.setCellValueFactory(new PropertyValueFactory<>("Title"));

        TableColumn<LibraryItem, Integer> colItem = new TableColumn<>("Item ID");
        colItem.setMinWidth(118);
        colItem.setCellValueFactory(new PropertyValueFactory<>("itemId"));

        TableColumn<LibraryItem, Integer> colNumber = new TableColumn<>("Number Of Copies");
        colNumber.setMinWidth(118);
        colNumber.setCellValueFactory(new PropertyValueFactory<>("numberOfCopies"));

        TableColumn<LibraryItem, Name> colAuthor = new TableColumn<>("Author");
        colAuthor.setMinWidth(118);
        colAuthor.setCellValueFactory(new PropertyValueFactory<>("author"));

        TableColumn<LibraryItem, String> colISBN = new TableColumn<>("ISBN");
        colISBN.setMinWidth(118);
        colISBN.setCellValueFactory(new PropertyValueFactory<>("ISBN"));

        tableView.getColumns().addAll(colTitle, colItem, colNumber, colAuthor,
                colISBN);
        setCenter(tableView);

        hBox.getChildren().addAll(btSort, btExport,btClear);
        handle(stage);
        setBottom(hBox);
    }
    public void handle(Stage stage) {
        // Event handler for the "Sort" button
        btSort.setOnAction(e -> {
            library.sortLibrary();
        });
        // Event handler for the "Export" button
        btExport.setOnAction(e -> {
            File selectedFile = chooser.showOpenDialog(stage);
            if (selectedFile != null) {
                String fileName = selectedFile.getName();
                try {
                    library.readFromFile(fileName);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                tableView.setItems(library.getListItems());
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR, "File not found");
                alert.showAndWait();
            }
        });
        // Event handler for the "Clear" button
        btClear.setOnAction(e -> {
            libraryItems.clear();
        });
    }

}
