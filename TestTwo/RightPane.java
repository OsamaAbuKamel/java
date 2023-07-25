package TestTwo;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class RightPane extends HBox {
    private Label contentLabel;
    private TextField textField;

    public RightPane() {
        super();
        contentLabel = new Label("Content:");
        textField = new TextField();
        textField.setVisible(false);
        getChildren().addAll(contentLabel, textField);
    }

    public void showContent(String content) {
        textField.setText(content);
        textField.setVisible(true);
        contentLabel.setVisible(true);
    }

    public void hideContent() {
        textField.setVisible(false);
        contentLabel.setVisible(false);
    }
}
