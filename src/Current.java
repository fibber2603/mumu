import javax.xml.crypto.Data;

public class Current {
    public static void main(String[] args) {
        Data current = new Data() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
        System.out.println(current);
    }
}
