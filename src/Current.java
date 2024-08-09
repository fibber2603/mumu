import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.time.*;

public class Current {
    public static void main(String[] args) {
//        Data current = new Data() {
//            @Override
//            public int hashCode() {
//                return super.hashCode();
//            }
//        };
//        System.out.println(current);
        LocalTime currentLocalDateTime = LocalTime.now();
        System.out.println(currentLocalDateTime);
    }
}
