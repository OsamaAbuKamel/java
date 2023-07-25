package CH13;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar13_6 {
    public static void main(String[] args) {
        Calendar calender = new GregorianCalendar();
        System.out.println("Current time is "+new Date());
        System.out.println("YEAR: " + calender.get(Calendar.YEAR));
        System.out.println("MONTH: " + calender.get(Calendar.MONTH));
        System.out.println("DATE: " + calender.get(Calendar.DATE));
        System.out.println("HOUR: " + calender.get(Calendar.HOUR_OF_DAY));
        System.out.println("MINUTE: " + calender.get(Calendar.MINUTE));
        System.out.println("SECOND: " + calender.get(Calendar.SECOND));
        System.out.println("DAY_OF_WEEK: " + calender.get(Calendar.DAY_OF_WEEK));
        System.out.println("DAY_OF_MONTH: " + calender.get(Calendar.DAY_OF_MONTH));
        System.out.println("DAY_OF_YEAR: " + calender.get(Calendar.DAY_OF_YEAR));
        System.out.println("WEEK_OF_YEAR: " + calender.get(Calendar.WEEK_OF_YEAR));
        System.out.println("HOUR AM/PM: " + calender.get(Calendar.AM_PM));  
        Calendar calendar1 = new GregorianCalendar();
        String[] dayNameOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday",
         "Thursday", "Friday", "Saturday"};   
         System.out.println("December 25, 1997 is a "+dayNameOfWeek[calendar1.get(Calendar.DAY_OF_WEEK)-1]); 
        
    }
    
}
