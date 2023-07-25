package ProgrammingExercisesCH13;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

//! PrintCalendar
public class Exe13_4 {

    public static void main(String[] args) {
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
