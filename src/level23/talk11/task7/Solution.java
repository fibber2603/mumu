package level23.talk11.task7;

/*
Один метод в классе
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
//        Color getColor();

        Integer getAge();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }
}
