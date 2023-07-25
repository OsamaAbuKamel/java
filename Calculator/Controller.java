package Calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField text_result;
    String operator = "";
    long num1;
    long num2;

    public void Number(ActionEvent e) {
        String no = ((Button) e.getSource()).getText();
        text_result.setText(text_result.getText() + no);

    }

    public void operation(ActionEvent e) {
        String operation = ((Button) e.getSource()).getText();
        if (!operation.equals("=")) {
            if (!operator.equals("")) {
                return;
            }
            operator = operation;
            num1 = Long.parseLong(text_result.getText());
            text_result.setText("");
        } else {
            if (operator.equals("")) {
                return;
            }
            num2 = Long.parseLong(text_result.getText());
            calculate(num1, num2, operator);
            operator = "";
        }

    }

    public void calculate(Long num1, Long num2, String operator) {
        switch (operator) {
            case "+":
                text_result.setText(String.valueOf(num1 + num2));
                break;
            case "-":
                text_result.setText(String.valueOf(num1 - num2));
                break;
            case "*":

                text_result.setText(String.valueOf(num1 * num2));
                break;
            case "/":
                if (num2 == 0) {
                    text_result.setText("0");
                    return;
                }
                text_result.setText(String.valueOf(num1 / num2));
                break;
        }
    }
}
