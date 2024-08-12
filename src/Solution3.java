import java.util.Calendar;
import java.util.GregorianCalendar;

public class Solution3 {

    static Calendar birthDate = new GregorianCalendar(1991, Calendar.MARCH, 26);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        String result = String.valueOf(Calendar.DAY_OF_WEEK);
        switch (calendar.get(Calendar.DAY_OF_WEEK)){
            case 1 -> result = "Воскресенье";
            case 2 -> result = "Понедельник";
            case 3 -> result = "Вторник";
            case 4 -> result = "Среда";
            case 5 -> result = "Четверг";
            case 6 -> result = "Пятница";
            case 7 -> result = "Суббота";

        }
        return result;
    }
}
