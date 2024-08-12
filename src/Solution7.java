import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Locale;

public class Solution7 {
//    public static void main(String[] args) {
//        System.out.println(nowExample());
//        System.out.println(ofExample());
//        System.out.println(ofYearDayExample());
//        System.out.println(ofEpochDayExample());
//    }
//
//    static LocalDate nowExample() {
//        LocalDate date = LocalDate.now();
//        return date;
//    }
//
//    static LocalDate ofExample() {
//        LocalDate date1 = LocalDate.of(2020,Month.SEPTEMBER,12);
//        return date1;
//    }
//
//    static LocalDate ofYearDayExample() {
//        LocalDate date2 =LocalDate.ofYearDay(2020,256);
//        return date2;
//    }
//
//    static LocalDate ofEpochDayExample() {
//        LocalDate date3 = LocalDate.ofEpochDay(18517);
//        return date3;
//    }

    /*
    вывести на русском языке день недели
     */
        static LocalDate birthDate = LocalDate.of(2020, 3, 12);

        public static void main(String[] args) {
            System.out.println(getDayOfWeek(birthDate));
        }

        static String getDayOfWeek(LocalDate date) {
            return date.getDayOfWeek().getDisplayName(TextStyle.FULL,Locale.forLanguageTag("ru"));
        }
}
