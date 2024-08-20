import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class Solution7 {
    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        LocalDate date = LocalDate.now();
        return date;
    }

    static LocalDate ofExample() {
        LocalDate date1 = LocalDate.of(2020,Month.SEPTEMBER,12);
        return date1;
    }

    static LocalDate ofYearDayExample() {
        LocalDate date2 =LocalDate.ofYearDay(2020,256);
        return date2;
    }

    static LocalDate ofEpochDayExample() {
        LocalDate date3 = LocalDate.ofEpochDay(18517);
        return date3;
    }
}
