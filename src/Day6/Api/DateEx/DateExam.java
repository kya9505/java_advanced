package Day6.Api.DateEx;

import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {
    public static void main(String[] args) {

        Date now = new Date();
        String strNow1 = now.toString();
        System.out.println(strNow1);
        System.out.println("==================");

        SimpleDateFormat now1 = new SimpleDateFormat("yyyy.MM.dd HH:mm:s");
        String strNow2 = now1.format(now);
        System.out.println(strNow2);


    }
}
