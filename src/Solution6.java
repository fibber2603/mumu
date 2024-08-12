import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Calendar;

public class Solution6 {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        LocalDate localDateTime = LocalDate.now(zoneId);
        System.out.println("Сегодня " + localDateTime);

        LocalDate localDate = LocalDate.of(2024, Month.MARCH,22);
        System.out.println(localDate);

        LocalDate date = LocalDate.ofYearDay(1991,157);
        System.out.println(date);
    }
}
