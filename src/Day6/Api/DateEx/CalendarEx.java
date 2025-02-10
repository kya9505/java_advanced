package Day6.Api.DateEx;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarEx {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH);
        int day = now.get(Calendar.DAY_OF_MONTH);
        int week = now.get(Calendar.DAY_OF_WEEK);
        int ampm = now.get(Calendar.AM_PM);
        int hour= now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        int secound = now.get(Calendar.SECOND);

        String[] availabIDs = TimeZone.getAvailableIDs();
                for(String id : availabIDs) System.out.println(id);
    }
}
