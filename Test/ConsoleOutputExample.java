package Test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class ConsoleOutputExample extends Application {

    private TextArea consoleOutput;

    @Override
    public void start(Stage primaryStage) {
        consoleOutput = new TextArea();
        consoleOutput.setEditable(false);

        PrintStream printStream = new PrintStream(new TextAreaOutputStream(consoleOutput));

        System.setOut(printStream);
        System.setErr(printStream);

        System.out.println("Hello, world!");

        Scene scene = new Scene(consoleOutput, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Console Output Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

class TextAreaOutputStream extends OutputStream {
    private TextArea textArea;

    public TextAreaOutputStream(TextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void write(int b) throws IOException {
        textArea.appendText(String.valueOf((char) b));
    }
}
