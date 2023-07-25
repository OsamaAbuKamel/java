import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui extends Application {
    private TextField celsiusTF = new TextField();
    private Button convertBtn = new Button("Convert");
    private TextField fahrenheitTF = new TextField();
    private TextField result = new TextField();
    private Label c = new Label("CELSIUS");
    private Label f = new Label("FAHRENHEIT");
    private GridPane pane = new GridPane();
    private RadioButton button = new RadioButton("CEL TO FAH");
    private RadioButton button2 = new RadioButton("FAH TO CEL");
    private Label resultL = new Label("RESULT");

    @Override
    public void start(Stage arg0) throws Exception {
        ToggleGroup toggleGroup = new ToggleGroup();
        button.setToggleGroup(toggleGroup);
        button2.setToggleGroup(toggleGroup);
        pane.setPadding(new Insets(20, 10, 10, 10));
        pane.setHgap(15);
        pane.setVgap(15);
        pane.setAlignment(Pos.TOP_CENTER);
        pane.add(button, 0, 0);
        pane.add(button2, 1, 0);
        pane.add(c, 0, 1);
        pane.add(celsiusTF, 1, 1);
        pane.add(f, 0, 1);
        pane.add(fahrenheitTF, 1, 1);
        pane.add(resultL, 0, 3);
        pane.add(result, 1, 3);
        pane.add(convertBtn, 0, 2);
        f.setVisible(false);
        fahrenheitTF.setVisible(false);
        button.setSelected(true);
        button.setOnAction(e -> {
            if (button.isSelected()) {
                c.setVisible(true);
                celsiusTF.setVisible(true);
                f.setVisible(false);
                fahrenheitTF.setVisible(false);
            }
            result.clear();
            fahrenheitTF.clear();
        });
        button2.setOnAction(e -> {
            if (button2.isSelected()) {
                f.setVisible(true);
                fahrenheitTF.setVisible(true);
                c.setVisible(false);
                celsiusTF.setVisible(false);
            }
            result.clear();
            celsiusTF.clear();
        });
        fahrenheitTF.setMaxWidth(120);
        celsiusTF.setMaxWidth(120);
        result.setMaxWidth(120);
        styles();
        convertBtn.setOnAction(e -> converter());
        Scene scene = new Scene(pane, 350, 250);
        arg0.setResizable(false);
        arg0.setTitle("Temperature Converter");
        arg0.setScene(scene);
        arg0.show();
    }

    private void styles() {
        pane.setStyle("-fx-background-color: #627BB6;");
        c.setStyle("-fx-font-size: 14px; -fx-text-fill: white;");
        f.setStyle("-fx-font-size: 14px; -fx-text-fill: white;");
        button.setStyle("-fx-font-size: 14px; -fx-text-fill: white;");
        button2.setStyle("-fx-font-size: 14px; -fx-text-fill: white;");
        resultL.setStyle("-fx-font-size: 14px; -fx-text-fill: white;");
        convertBtn.setStyle("-fx-color:#AED6F1;-fx-font-weight: bold;-fx-text-fill:#515A5A");
    }

    private void converter() {
        if (celsiusTF.getText() != null && !celsiusTF.getText().isEmpty()) {
            double celsius = Double.parseDouble(celsiusTF.getText());
            TemperatureConverter temperatureConverter = new TemperatureConverter();
            result.setText(String.format("%.2f\u00B0F", temperatureConverter.convertCelsiusToFahrenheit(celsius)));
        }
        if (fahrenheitTF.getText() != null && !fahrenheitTF.getText().isEmpty()) {
            double fahrenheit = Double.parseDouble(fahrenheitTF.getText());
            TemperatureConverter temperatureConverter = new TemperatureConverter();
            result.setText(String.format("%.2f\u00B0C", temperatureConverter.convertFahrenheitToCelsius(fahrenheit)));
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
