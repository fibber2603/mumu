import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            System.out.println(line.toUpperCase());

        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        } finally {
            if (scanner != null){
                scanner.close();
            }
        }
    }
}