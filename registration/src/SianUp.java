import java.util.ArrayList;
import java.util.Arrays;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class SianUp extends Application {
    private HBox boxName = new HBox(10);
    private TextField tfName = new TextField();
    private TextField tfLastName = new TextField();
    private TextField tfEmail = new TextField();
    private TextField tfDay = new TextField();
    private TextField tfMonth = new TextField();
    private TextField tfYear = new TextField();
    private HBox boxDateOfBirth = new HBox(5);
    private PasswordField passwordField = new PasswordField();
    private ComboBox<String> comboBox = new ComboBox<>();
    // private DatePicker datePicker = new DatePicker();
    private Label laCou = new Label("Country");
    private RadioButton btMale = new RadioButton();
    private RadioButton btFemale = new RadioButton();
    private ToggleGroup group = new ToggleGroup();
    private HBox boxGender = new HBox(10);
    private Button btSignUp = new Button("Sign Up");
    private Label laDateOFBirth = new Label("Date Of Birth");
    private Line line = new Line();
    private Button btGoogle = new Button();
    private Button btFace = new Button();
    private HBox boxButton = new HBox(15);
    private Image googleIcon = new Image("C:\\Users\\XPRISTO\\Downloads\\icons8-google-48.png");
    private ImageView googleImageView = new ImageView(googleIcon);
    private Image imFace = new Image("C:\\Users\\XPRISTO\\Downloads\\icons8-facebook-48.png");
    private ImageView ivFace = new ImageView(imFace);
    private Label laEnd = new Label("Already a user?");
    private Button btLogIn = new Button("LOGIN");
    private HBox boxLog = new HBox(0);
    private SaveData data = new SaveData();
    private Label label = new Label();

    @Override
    public void start(Stage arg0) throws Exception {
        GridPane gridPane = pane();
        addUIControls(gridPane);
        btLogIn.setOnAction(e -> {
            SignIn in = new SignIn();
            try {
                in.start(arg0);
            } catch (Exception ex) {
                ex.getStackTrace();
            }
        });

        Scene scene = new Scene(gridPane, 550, 450);
        scene.getRoot();
        arg0.setTitle("Sign Up");
        arg0.setScene(scene);
        arg0.show();
    }

    private GridPane pane() {
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(40, 40, 40, 40));
        gridPane.setVgap(15);
        gridPane.setHgap(15);
        gridPane.setAlignment(Pos.CENTER);

        gridPane.setStyle("-fx-background-color: #FFFFFF");
        return gridPane;
    }

    public void addUIControls(GridPane gridPane) {
        tfName.setPromptText("FIRST NAME");
        tfLastName.setPromptText("LAST NAME");
        boxName.getChildren().addAll(tfName, tfLastName);
        tfEmail.setPromptText("EMAIL ADDRESS");
        passwordField.setPromptText("NEW PASSWORD");
        // add the nodes to the gridPane
        gridPane.add(boxName, 0, 0);
        gridPane.add(tfEmail, 0, 1);
        gridPane.add(passwordField, 0, 2);
        // initialize the comboBox
        comboBox.getItems().addAll(getNameCountry());
        gridPane.add(comboBox, 0, 3);
        gridPane.add(laCou, 0, 2, 1, 2);

        // the date of birth
        boxDateOfBirth.getChildren().addAll(tfDay, tfMonth, tfYear);
        tfDay.setPromptText("DAY");
        tfMonth.setPromptText("MONTH");
        tfYear.setPromptText("YEAR");
        gridPane.add(boxDateOfBirth, 0, 4);
        // the radio button
        boxGender.getChildren().addAll(btMale, btFemale);
        btFemale.setToggleGroup(group);
        btMale.setToggleGroup(group);
        btMale.setText("Male");
        btFemale.setText("Female");
        // boxGender.setAlignment(Pos.CENTER);
        gridPane.add(boxGender, 0, 5);
        gridPane.add(laDateOFBirth, 0, 3, 1, 2);

        // event for the button
        // gridPane.setMargin(btSignUp, new Insets(0, 100, 0, 100));
        gridPane.add(btSignUp, 0, 6);
        // line
        line.setEndX(310);
        line.setStartX(0);
        gridPane.add(line, 0, 7);
        // add icons in buttons
        btGoogle.setGraphic(googleImageView);
        btFace.setGraphic(ivFace);
        boxButton.setAlignment(Pos.CENTER);
        boxButton.getChildren().addAll(btGoogle, btFace);
        //
        boxLog.getChildren().addAll(laEnd, btLogIn);
        boxLog.setAlignment(Pos.CENTER);
        gridPane.add(boxLog, 0, 9);
        // boxButton.

        gridPane.add(boxButton, 0, 8);
        // event for the button
        btSignUp.setOnAction(e -> {
            if (tfName.getText().isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Form Error!", "Please enter your first name");
                return;
            } else if (data.isDataAlreadyExists(tfName.getText())) {
                showAlert(Alert.AlertType.ERROR, "Form Error!", "Name already exists");
                return;
            } else if (tfName.getText().length() < 3) {
                showAlert(Alert.AlertType.ERROR, "Form Error!", "Last name must be at least 3 characters");
                return;
            }
            if (tfLastName.getText().isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Form Error!", "Please enter your last name");
                return;
            } else if (data.isDataAlreadyExists(tfLastName.getText())) {
                showAlert(Alert.AlertType.ERROR, "Form Error!", "Last name already exists");
                return;
            } else if (tfLastName.getText().length() < 3) {
                showAlert(Alert.AlertType.ERROR, "Form Error!", "Last name must be at least 3 characters");
                return;
            }
            if (tfEmail.getText().isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Form Error!", "Please enter your email");
                return;
            } else if (data.isDataAlreadyExists(tfEmail.getText())) {
                showAlert(Alert.AlertType.ERROR, "Form Error!", "Email already exists");
                return;
            }
            if (passwordField.getText().isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Form Error!", "Please enter your Password");
                return;
            } else if (passwordField.getText().length() < 8) {
                showAlert(Alert.AlertType.ERROR, "Form Error!", "Password must be at least 8 characters");
                return;
            }
            if (comboBox.getSelectionModel().isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Form Error!", "Please select the country");
                return;
            }

            if (tfDay.getText().isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Form Error!", "Please enter the day");
                return;
            }

            if (tfMonth.getText().isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Form Error!", "Please enter the month");
                return;
            }
            if (tfYear.getText().isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Form Error!", "Please enter the year");
                return;
            }
            if (group.getSelectedToggle() == null) {
                showAlert(Alert.AlertType.ERROR, "from error", "please ");
                return;
            }
            String s = "";
            if (btFemale.isSelected()) {
                s = btFemale.getText();
            }
            if (btMale.isSelected()) {
                s = btMale.getText();
            }

            // data.addData(tfName.getText(), tfLastName.getText(), tfEmail.getText(),
            // passwordField.getText(), s,
            // comboBox.getSelectionModel().getSelectedItem().toString(),
            // new NewDate();
            data.printDataInFile();

            showAlert(Alert.AlertType.CONFIRMATION, "Registration Successful!",
                    "Welcome " + tfName.getText());
            tfName.clear();
            tfLastName.clear();
            tfEmail.clear();
            passwordField.clear();
            comboBox.getSelectionModel().clearSelection();
            tfDay.clear();
            tfMonth.clear();
            tfYear.clear();
            group.getSelectedToggle().setSelected(false);
        });

        btGoogle.setOnAction(e -> {
            // Open the Google link in the default browser
            String googleLink = "https://www.google.com";
            getHostServices().showDocument(googleLink);
        });
        btFace.setOnAction(e -> {
            String faceLink = "https://www.facebook.com";
            getHostServices().showDocument(faceLink);
        });

        getStyles();
    }

    private void getStyles() {
        tfName.setStyle("-fx-background-radius: 50px;");
        tfLastName.setStyle("-fx-background-radius: 50px;");
        tfEmail.setStyle("-fx-background-radius: 50px;-fx-max-width:310px;");
        passwordField.setStyle("-fx-background-radius: 50px;-fx-max-width:310px;");
        comboBox.setStyle(
                "-fx-background-radius: 50px;-fx-max-width:310px;-fx-color:#FFFFFF;");
        laCou.setStyle("-fx-font-size:10px;-fx-opacity:0.7;");
        tfDay.setStyle("-fx-background-radius: 50px;-fx-max-width:100px;");
        tfMonth.setStyle("-fx-background-radius: 50px;-fx-max-width:100px;");
        tfYear.setStyle("-fx-background-radius: 50px;-fx-max-width:100px;");
        btSignUp.setStyle(
                "-fx-color:#FFFFFF;-fx-background-radius: 50px;-fx-pref-width:310px;-fx-font-size:14px;-fx-font-style: italic");
        laDateOFBirth.setStyle("-fx-font-size:10px;-fx-opacity: 0.7;");
        btFace.setStyle("-fx-background-color: transparent;");
        btGoogle.setStyle("-fx-background-color: transparent;");
        btLogIn.setStyle("-fx-background-color: transparent;-fx-underline: true ;-fx-opacity: 0.4;-fx-text-fill:black");
        laEnd.setStyle("-fx-opacity: 0.4;-fx-text-fill:black");
        line.setStyle("-fx-opacity: 0.25;");
        // datePicker.setStyle("-fx-background-radius: 70px;");

    }

    private void showAlert(Alert.AlertType type, String title, String massage) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText("");
        alert.setContentText(massage);
        alert.show();
    }

    private ArrayList<String> getNameCountry() {
        String[] countries = new String[] { "Afghanistan", "Albania", "Algeria", "American Samoa",
                "Andorra", "Angola",
                "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Australia",
                "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize",
                "Benin", "Bermuda", "Bhutan", "Bolivia", "Bosnia and Herzegowina", "Botswana", "Bouvet Island",
                "Brazil", "British Indian Ocean Territory", "Brunei Darussalam", "Bulgaria", "Burkina Faso", "Burundi",
                "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands", "Central African Republic", "Chad",
                "Chile", "China", "Christmas Island", "Cocos (Keeling) Islands", "Colombia", "Comoros", "Congo",
                "Congo, the Democratic Republic of the", "Cook Islands", "Costa Rica", "Cote d'Ivoire",
                "Croatia (Hrvatska)", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica",
                "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea",
                "Estonia", "Ethiopia", "Falkland Islands (Malvinas)", "Faroe Islands", "Fiji", "Finland", "France",
                "France Metropolitan", "French Guiana", "French Polynesia", "French Southern Territories", "Gabon",
                "Gambia", "Georgia", "Germany", "Ghana", "Gibraltar", "Greece", "Greenland", "Grenada", "Guadeloupe",
                "Guam", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Heard and Mc Donald Islands",
                "Holy See (Vatican City State)", "Honduras", "Hong Kong", "Hungary", "Iceland", "India", "Indonesia",
                "Iran (Islamic Republic of)", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan",
                "Kazakhstan", "Kenya", "Kiribati", "Korea, Democratic People's Republic of", "Korea, Republic of",
                "Kuwait", "Kyrgyzstan", "Lao, People's Democratic Republic", "Latvia", "Lebanon", "Lesotho", "Liberia",
                "Libyan Arab Jamahiriya", "Liechtenstein", "Lithuania", "Luxembourg", "Macau",
                "Macedonia, The Former Yugoslav Republic of", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali",
                "Malta", "Marshall Islands", "Martinique", "Mauritania", "Mauritius", "Mayotte", "Mexico",
                "Micronesia, Federated States of", "Moldova, Republic of", "Monaco", "Mongolia", "Montserrat",
                "Morocco", "Mozambique", "Myanmar", "Namibia", "Nauru", "Nepal", "Netherlands", "Netherlands Antilles",
                "New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Niue", "Norfolk Island",
                "Northern Mariana Islands", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea",
                "Paraguay", "Peru", "Philippines", "Pitcairn", "Palestine", "Poland", "Portugal", "Puerto Rico",
                "Qatar", "Reunion",
                "Romania", "Russian Federation", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia",
                "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia",
                "Senegal", "Seychelles", "Sierra Leone", "Singapore", "Slovakia (Slovak Republic)", "Slovenia",
                "Solomon Islands", "Somalia", "South Africa", "South Georgia and the South Sandwich Islands", "Spain",
                "Sri Lanka", "St. Helena", "St. Pierre and Miquelon", "Sudan", "Suriname",
                "Svalbard and Jan Mayen Islands", "Swaziland", "Sweden", "Switzerland", "Syrian Arab Republic",
                "Taiwan, Province of China", "Tajikistan", "Tanzania, United Republic of", "Thailand", "Togo",
                "Tokelau", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan",
                "Turks and Caicos Islands", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom",
                "United States", "United States Minor Outlying Islands", "Uruguay", "Uzbekistan", "Vanuatu",
                "Venezuela", "Vietnam", "Virgin Islands (British)", "Virgin Islands (U.S.)",
                "Wallis and Futuna Islands", "Western Sahara", "Yemen", "Yugoslavia", "Zambia", "Zimbabwe" };
        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));
        return list;
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
