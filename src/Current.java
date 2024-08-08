import javax.xml.crypto.Data;

public class Current {
    public static void main(String[] args) {
        Data current = new Data() {
            @Override
            public String toString() {
                return super.toString();
            }
        };
        System.out.println(current);
    }
}
