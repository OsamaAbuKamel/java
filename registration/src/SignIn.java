import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;
import javafx.stage.Window;

public class SignIn extends Application {
    private Button button = new Button("Sign Up");

    @Override
    public void start(Stage arg0) throws Exception {
        GridPane gridPane = pane();
        addUI(gridPane);
        button.setOnAction(e -> {
            SianUp up = new SianUp();
            try {
                up.start(arg0);
            } catch (Exception ex) {
                ex.getStackTrace();
            }
        });

        Scene scene = new Scene(gridPane, 600, 400);
        arg0.setTitle("Registration Form JavaFX Application");
        arg0.setScene(scene);
        arg0.show();
    }

    public GridPane pane() {

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(40, 40, 40, 40));
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setAlignment(Pos.CENTER);
        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200, 200, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);

        gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);
        return gridPane;
    }

    public void addUI(GridPane gridPane) {
        PasswordField ftPass = new PasswordField();
        Button btSub = new Button("Submit");
        Label lRF = new Label("Sign in to ...");
        Label laEID = new Label(" Email:");
        Label laPas = new Label(" Password :");

        TextField tfEmail = new TextField();
        GridPane.setHalignment(lRF, HPos.CENTER);
        gridPane.add(lRF, 0, 0, 2, 1);
        gridPane.add(laEID, 0, 1);
        gridPane.add(tfEmail, 1, 1);
        gridPane.add(laPas, 0, 2);
        gridPane.add(ftPass, 1, 2);
        // gridPane.add(btSub, 1, 4);
        gridPane.add(btSub, 0, 3, 2, 1);
        GridPane.setHalignment(btSub, HPos.CENTER);
        GridPane.setMargin(btSub, new Insets(20, 0, 20, 0));
        GridPane.setHalignment(btSub, HPos.CENTER);
        gridPane.add(button, 2, 2);
        button.setStyle("-fx-background-color: transparent; -fx-border-color: black; -fx-border-width: 0.9px;");

        lRF.setStyle("-fx-font-weight: bold;-fx-font-size:16");
        btSub.setStyle("-fx-background-color:#9ecde3");
        btSub.setOnAction(e -> {
            SaveData save = new SaveData();
            if (tfEmail.getText().isEmpty()) {
                showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(),
                        "Form Error!", "Please enter your email id");
                return;
            }
            if (save.isDataAlreadyExists(tfEmail.getText()) == false) {
                showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(),
                        "Form Error!", "Email not exist");
                return;
            }
            if (ftPass.getText().isEmpty()) {
                showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(),
                        "Form Error!", "Please enter a password");
                return;
            } else if (ftPass.getText().length() < 8) {
                showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(),
                        "Form Error!", "Password must be 8 characters");
                return;
            }
            if (save.isDataAlreadyExists(ftPass.getText()) == false) {
                showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(),
                        "Form Error!", "Password not exist");
                return;
            }
            showAlert(Alert.AlertType.CONFIRMATION, gridPane.getScene().getWindow(),
                    "Registration Successful!", "Welcome ");
        });
    }

    private void showAlert(Alert.AlertType type, Window window, String title, String massage) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(massage);
        alert.initOwner(window);
        alert.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}