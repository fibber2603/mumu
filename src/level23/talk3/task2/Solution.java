package level23.talk3.task2;
/*

Реализуй интерфейс Drink в классах Beer и Cola.

Требования:
Класс Beer должен реализовывать (implements) интерфейс Drink.
Класс Cola должен реализовывать (implements) интерфейс Drink.
В классе Beer должны быть реализованы все методы интерфейса Drink.
В классе Cola должны быть реализованы все методы интерфейса Drink.
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        print(new Beer());
        print(new Cola());
    }

    private static void print(Drink drink) {
        System.out.println(drink.getClass().getSimpleName());
    }

    public interface Drink {
        boolean isAlcoholic();
    }

    public static class Beer implements Drink  {
        public boolean isAlcoholic(){
            return true;
        }
    }

    public static class Cola implements Drink {
        public boolean isAlcoholic(){ // обратить внимание на модификатор доступа
            return true;
        }
    }
}
