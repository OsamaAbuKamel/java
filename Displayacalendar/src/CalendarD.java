import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarD {
    private int year;
    private int month;

    public void printCalender() {
        Calendar calendar = new GregorianCalendar();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH) + 1;
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

    public String getMonthName(int month) {
        String[] monthNames = { "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December" };
        return monthNames[month];
    }
}
