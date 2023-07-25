import java.util.Calendar;
import java.util.GregorianCalendar;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class DisplayCalendar extends Application {

    @Override
    public void start(Stage arg0) throws Exception {
        Pane pane = new Pane();
        Button btn = new Button("Display Calendar");
        btn.setOnAction(e -> printCalender());

        pane.getChildren().addAll(btn);
        Scene scene = new Scene(pane, 600, 400);
        arg0.setTitle("Display Calendar");
        arg0.setScene(scene);
        arg0.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static void printCalender() {
        Calendar calendar = new GregorianCalendar();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        System.out.println("\t\t\t" + getMonthName(month) + "  " + year);
        System.out.println("\t-----------------------------------------------------");
        System.out.println("\tSun \t Mon \t Tue \t Wed \t Thu \t Fri \t Sat");
        for (int i = 1; i < calendar.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
            System.out.printf("\t%3d", i);
            if (i % 7 == 0) {
                System.out.println();
            }

        }
    }

    public static String getMonthName(int month) {
        String[] monthNames = { "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December" };
        return monthNames[month];
    }
}
