package com.example.phase3gui;


import javafx.geometry.Side;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

public class TabPanes extends TabPane {
    private Library library;
    private Tab tMain = new Tab("Main");
    private Tab tAdd = new Tab("Add");
    private Tab tRemove = new Tab("Remove");
    private Tab tSearch = new Tab("Search");
    private Tab tRead = new Tab("Read");
    private Tab tUpdate = new Tab("Update");
    private Tab tSort = new Tab("Sort");
    private Main main = new Main();
    private AddBook addBook;
    private Remove removeBook;
    private Search search;
    private Update update;
    private Sort sort;

    public TabPanes(Library library, Stage stage) {
        this.library = library;
        addBook = new AddBook(library);
        search = new Search(library);
        removeBook = new Remove(library);
        update = new Update(library);
        sort = new Sort(library.getListItems(), library, stage);
        // Add tabs to the TabPane
        getTabs().addAll(tMain, tAdd, tRemove, tSearch, tUpdate, tRead, tSort);
        // Set TabPane properties
        setRotateGraphic(true);
        setSide(Side.LEFT);
        setTabMaxHeight(55);
        setTabMinHeight(50);
        setTabMaxWidth(55);
        setTabMinWidth(35);
        // call method style and component
        styles();
        component(stage);

    }

    private void styles() {
        setId("tabPane");
        tMain.setClosable(false);
        tAdd.setClosable(false);
        tRead.setClosable(false);
        tRemove.setClosable(false);
        tUpdate.setClosable(false);
        tSearch.setClosable(false);
        tSort.setClosable(false);
    }

    private void component(Stage stage) {
        tMain.setContent(main);
        tAdd.setContent(addBook);
        tRemove.setContent(removeBook);
        tSearch.setContent(search);
        tSort.setContent(sort);
        tUpdate.setContent(update);
        tRead.setContent(new ReadButton(stage));
    }

}
