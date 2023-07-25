package javafxProject;

import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;

public class Left extends VBox {
    private RadioButton rbBlue = new RadioButton("blue");
    private RadioButton rbRed = new RadioButton("red");
    private RadioButton rbGreen = new RadioButton("green");
    private ToggleGroup group = new ToggleGroup();

    public Left() {
        rbBlue.setToggleGroup(group);
        rbGreen.setToggleGroup(group);
        rbRed.setToggleGroup(group);
        getChildren().addAll(rbRed, rbBlue, rbGreen);
    }

}
