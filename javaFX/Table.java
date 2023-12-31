package javaFX;

import javafx.application.Application;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Table extends Application {

    @Override
    public void start(Stage arg0) throws Exception {

        try {
            TableView<Country> table = new TableView<>();
            ObservableList<Country> data = FXCollections.observableArrayList(
                    new Country("USA", "Washington DC", 280, true),
                    new Country("Canada", "Ottawa", 32, true),
                    new Country("United Kingdom", "London", 60, true),
                    new Country("Germany", "Berlin", 83, true),
                    new Country("France", "Paris", 60, true));
            table.setItems(data);

            TableColumn<Country, String> countryColumn = new TableColumn<>("Country");
            countryColumn.setMinWidth(100);
            countryColumn.setCellValueFactory(new PropertyValueFactory<>("country"));

            TableColumn<Country, String> capitalColumn = new TableColumn<>("Capital");
            capitalColumn.setMinWidth(100);
            capitalColumn.setCellValueFactory(new PropertyValueFactory<>("capital"));

            TableColumn<Country, Integer> populationColumn = new TableColumn<>("Population");
            populationColumn.setMinWidth(100);
            populationColumn.setCellValueFactory(new PropertyValueFactory<>("population"));

            TableColumn<Country, Boolean> democraticColumn = new TableColumn<>("Democratic");
            democraticColumn.setMinWidth(100);
            democraticColumn.setCellValueFactory(new PropertyValueFactory<>("democratic"));

            table.getColumns().addAll(countryColumn, capitalColumn, populationColumn, democraticColumn);

            FlowPane flowPane = new FlowPane(3, 3);
            TextField tfCountry = new TextField();
            TextField tfCapital = new TextField();
            TextField tfPopulation = new TextField();
            TextField tfDemocratic = new TextField();
            CheckBox chkDemocratic = new CheckBox("Democratic");
            Button btnAdd = new Button("Add new row");
            tfCountry.setPrefColumnCount(5);
            tfCapital.setPrefColumnCount(5);
            tfPopulation.setPrefColumnCount(5);
            tfDemocratic.setPrefColumnCount(5);
            flowPane.getChildren().addAll(new Label("Country"), tfCountry, new Label("Capital"), tfCapital,
                    new Label("Population"), tfPopulation, chkDemocratic, btnAdd);

            btnAdd.setOnAction(e -> {
                data.add(new Country(tfCountry.getText(), tfCapital.getText(),
                        Double.parseDouble(tfPopulation.getText()),
                        chkDemocratic.isSelected()));
                tfCountry.clear();
                tfCapital.clear();
                tfPopulation.clear();
            });

            BorderPane borderPane = new BorderPane();
            borderPane.setCenter(table);
            borderPane.setBottom(flowPane);

            Scene scene = new Scene(borderPane, 400, 400);
            arg0.setScene(scene);
            arg0.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        launch(args);
    }

    public static class Country {
        private final SimpleStringProperty country;
        private final SimpleStringProperty capital;
        private final SimpleDoubleProperty population;
        private final SimpleBooleanProperty democratic;

        private Country(String country, String capital,
                double population, boolean democratic) {
            this.country = new SimpleStringProperty(country);
            this.capital = new SimpleStringProperty(capital);
            this.population = new SimpleDoubleProperty(population);
            this.democratic = new SimpleBooleanProperty(democratic);
        }

        public String getCountry() {
            return country.get();
        }

        public void setCountry(String country) {
            this.country.set(country);
        }

        public String getCapital() {
            return capital.get();
        }

        public void setCapital(String capital) {
            this.capital.set(capital);
        }

        public double getPopulation() {
            return population.get();
        }

        public void setPopulation(double population) {
            this.population.set(population);
        }

        public boolean isDemocratic() {
            return democratic.get();
        }

        public void setDemocratic(boolean democratic) {
            this.democratic.set(democratic);
        }
    }

}
