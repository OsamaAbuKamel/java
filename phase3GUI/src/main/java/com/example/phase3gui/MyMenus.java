package com.example.phase3gui;


import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class MyMenus extends MenuBar {
  private Menu fileMenu = new Menu("FILE");
  private Menu HelpMenu = new Menu("Help");
  private MenuItem miSave = new MenuItem("Save");
  private MenuItem miClos = new MenuItem("Exit");
  private MenuItem miWelcome = new MenuItem("Welcome");
  private MenuItem miAbout = new MenuItem("About");
  private Library library;

  public MyMenus(Stage stage, Library library) {
    this.library = library;
    // Create the file menu and add menu items
    fileMenu.getItems().addAll(miSave, miClos);
    // Create the help menu and add menu items
    HelpMenu.getItems().addAll(miWelcome, miAbout);
    // Add menus to the menu bar
    getMenus().addAll(fileMenu, HelpMenu);
    //call method handle
    handle(stage);
  }

  private void handle(Stage stage) {
    // Event handler for the "Exit" menu item
    miClos.setOnAction(e -> {
      stage.close();
    });

    miSave.setOnAction(e -> {
      // Event handler for the "Save" menu item
      library.save();
      library.getListItems().clear();
    });
  }
}
