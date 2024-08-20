import java.time.LocalTime;

public class Solution8 {

    public static void main(String[] args) {

        LocalTime time = LocalTime.of(12,10);
        LocalTime time1 = LocalTime.now();
        LocalTime time2 = LocalTime.ofSecondOfDay(10000);

        System.out.println(time);
        System.out.println(time1);
        System.out.println(time2);
    }
}
