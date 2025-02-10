package Day6.Api.DateTimeOperatorEx;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeOperator {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.toString());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        System.out.println("현재시간 : "+now.format(dtf));

        LocalDateTime result = now.plusMinutes(4);
        System.out.println("4분후 : "+result.format(dtf));
        LocalDateTime result1 = now.plusMonths(4);
        System.out.println("4달후 : "+result1.format(dtf));
        LocalDateTime result2 = now.minusYears(4);
        System.out.println("4년전 : "+result2.format(dtf));
        LocalDateTime result3 = now.minusDays(7);
        System.out.println("7일전 : "+result3.format(dtf));


        LocalDateTime start = LocalDateTime.of(2025,2,10,3,50,0);
        System.out.println("시작일 :"+start.format(dtf) );
        LocalDateTime end = LocalDateTime.of(2025,2,11,3,50,0);
        System.out.println("시작일 :"+end.format(dtf) );

        if(start.isBefore(end)){
            System.out.println(" 진행중");
        } else if (start.isAfter(end)) System.out.println("완료되었습니다.");

    }
}
