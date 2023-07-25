package Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestCalender {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        GregorianCalendar calendar2 = new GregorianCalendar();
calendar2.get(Calendar.DATE);
System.out.println(calendar2);
    }
}
