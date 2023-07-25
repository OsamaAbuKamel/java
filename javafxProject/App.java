package javafxProject;

import java.beans.EventHandler;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {
    private BorderPane borderPane = new BorderPane();
    private HBox hbBottom = new HBox(10);
    private VBox vbLeft = new VBox(10);
    private VBox vbRight = new VBox(10);
    private Pane paneFromText = new Pane();

    private MenuBar mbTop = new MenuBar();
    private Menu fileMenu = new Menu("FILE");
    private MenuItem mIClearText = new MenuItem("Clear Text");

    private RadioButton rbBlue = new RadioButton("blue");
    private RadioButton rbRed = new RadioButton("red");
    private RadioButton rbGreen = new RadioButton("green");
    private ToggleGroup group = new ToggleGroup();

    private CheckBox chItalic = new CheckBox("Italic");
    private CheckBox chBold = new CheckBox("Bold");

    private Button btLeft = new Button("Left");
    private Button btRight = new Button("Right");
    private Button btGetText = new Button("Get Text");

    private TextField textField = new TextField();

    private ComboBox<String> comboBox = new ComboBox<>();

    private Text text = new Text(50, 100, "Hello");

    private Font boldItalicFont = Font.font("Times NewRoman", FontWeight.BOLD, FontPosture.ITALIC, 20);
    private Font boldFont = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 20);
    private Font italicFont = Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.ITALIC, 20);
    private Font normalFont = Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR, 20);

    @Override
    public void start(Stage arg0) throws Exception {
        fileMenu.getItems().addAll(mIClearText);
        mbTop.getMenus().add(fileMenu);

        comboBox.getItems().addAll("print Hi", "print Hello");
        hbBottom.getChildren().addAll(btLeft, btRight, textField, btGetText, comboBox);
        hbBottom.setAlignment(Pos.CENTER);

        paneFromText.getChildren().addAll(text);
        paneFromText.setPadding(new Insets(10, 10, 10, 10));

        rbBlue.setToggleGroup(group);
        rbGreen.setToggleGroup(group);
        rbRed.setToggleGroup(group);
        vbLeft.getChildren().addAll(rbRed, rbBlue, rbGreen);
        vbLeft.setPadding(new Insets(50, 10, 10, 10));
        // vbLeft.setAlignment(Pos.CENTER);

        vbRight.getChildren().addAll(chBold, chItalic);
        vbRight.setPadding(new Insets(50, 10, 10, 10));

        btLeft.setOnAction(e -> {
            if (text.getX() > 30) {
                text.setX(text.getX() - 10);
            }
        });
        btRight.setOnAction(e -> {
            if (text.getX() < 300) {
                text.setX(text.getX() + 10);

            }
        });

        rbRed.setOnAction(e -> {
            text.setFill(Color.RED);
        });
        rbBlue.setOnAction(e -> {
            text.setFill(Color.BLUE);
        });
        rbGreen.setOnAction(e -> {
            text.setFill(Color.GREEN);
        });

        btGetText.setOnAction(e -> {
            text.setText(textField.getText());
        });
        mIClearText.setOnAction(e -> {
            text.setText("");

        });

        comboBox.setOnAction(e -> {
            if (comboBox.getSelectionModel().getSelectedIndex() == 0) {
                text.setText("Hi");
            } else {
                text.setText("Hello");
            }
        });
        chBold.setOnAction(e -> {
            if (chBold.isSelected()) {

            }
        });

        borderPane.setTop(mbTop);
        borderPane.setLeft(vbLeft);
        borderPane.setRight(vbRight);
        borderPane.setBottom(hbBottom);
        borderPane.setCenter(paneFromText);

        Scene scene = new Scene(borderPane, 500, 300);
        arg0.setScene(scene);
        arg0.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
