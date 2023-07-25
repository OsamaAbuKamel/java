package HelloSceneBulider;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller {
    @FXML
    private Circle circle;
    private double x;
    private double y;

    public void up(ActionEvent e) {
        // System.out.println("UP");
        circle.setCenterY(y -= 10);
    }

    public void down(ActionEvent e) {
        // System.out.println("DOWN");
        circle.setCenterY(y += 10);

    }

    public void right(ActionEvent e) {
        // System.out.println("RIGHT");
        circle.setCenterX(x += 10);

    }

    public void left(ActionEvent e) {
        // System.out.println("LEFT");
        circle.setCenterX(x -= 10);

    }

}
