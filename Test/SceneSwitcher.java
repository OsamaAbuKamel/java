package Test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SceneSwitcher extends Application {

    private Stage primaryStage;
    private Scene defaultScene;
    private Scene loginScene;
    private Scene dashboardScene;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;

        // Create scenes
        defaultScene = createDefaultScene();
        loginScene = createLoginScene();
        dashboardScene = createDashboardScene();

        // Set the initial scene
        switchScene(SceneType.DEFAULT);

        primaryStage.setTitle("Scene Switcher");
        primaryStage.show();
    }

    private Scene createDefaultScene() {
        Button loginButton = new Button("Go to Login");
        loginButton.setOnAction(event -> switchScene(SceneType.LOGIN));

        StackPane root = new StackPane(loginButton);
        return new Scene(root, 400, 300);
    }

    private Scene createLoginScene() {
        Button dashboardButton = new Button("Go to Dashboard");
        dashboardButton.setOnAction(event -> switchScene(SceneType.DASHBOARD));

        StackPane root = new StackPane(dashboardButton);
        return new Scene(root, 400, 300);
    }

    private Scene createDashboardScene() {
        Button backButton = new Button("Go Back");
        backButton.setOnAction(event -> switchScene(SceneType.DEFAULT));

        StackPane root = new StackPane(backButton);
        return new Scene(root, 400, 300);
    }

    private void switchScene(SceneType sceneType) {
        switch (sceneType) {
            case DEFAULT:
                primaryStage.setScene(defaultScene);
                break;
            case LOGIN:
                primaryStage.setScene(loginScene);
                break;
            case DASHBOARD:
                primaryStage.setScene(dashboardScene);
                break;
            default:
                throw new IllegalArgumentException("Invalid scene type: " + sceneType);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

enum SceneType {
    DEFAULT, LOGIN, DASHBOARD
}
