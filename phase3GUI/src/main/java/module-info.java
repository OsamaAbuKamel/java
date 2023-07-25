module com.example.phase3gui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.phase3gui to javafx.fxml;
    exports com.example.phase3gui;
}