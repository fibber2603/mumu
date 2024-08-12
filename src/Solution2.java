import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Solution2 {

    public static void main(String[] args) {
//        Date date = new Date("6 January 2010");
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//        System.out.println(formatter.format(date));
//        Calendar calendar = new GregorianCalendar(1991, Calendar.MARCH,26);
//        System.out.println(calendar.getTime());
        Calendar calendar = new GregorianCalendar(1991,Calendar.MARCH,26);

        if (Calendar.DAY_OF_WEEK == Calendar.MONDAY){
            System.out.println("Это понедельник");
        }

//        calendar.set(calendar.YEAR, 2024);
//        calendar.set(calendar.MONTH, 3);
//        calendar.set(calendar.DAY_OF_MONTH, 26);
//        calendar.set(calendar.HOUR_OF_DAY, 13);
//        calendar.set(calendar.MINUTE, 35);
//
//        System.out.println(calendar.getTime());

    }
}
