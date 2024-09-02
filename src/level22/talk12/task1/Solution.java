package level22.talk12.task1;


public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {
            return ((Animal) o).setName();
    }


    public static class Cat extends Animal   //<--Классы наследуются!!
    {
        public String setName(){
            return "Кот";
        }
    }

    public static class Tiger extends Cat {
        public String setName(){
            return "Тигр";
        }
    }

    public static class Lion extends Cat {
        public String setName(){
            return "Лев";
        }
    }

    public static class Bull extends Animal {
        public String setName(){
            return "Бык";
        }
    }

    public static class Cow extends Animal implements CanRun{
        public String setName(){
            return "Корова";
        }

        @Override
        public void run() {
            System.out.println(" fly fly");
        }
    }

    public static class Animal {
        public String setName(){
            return "Животное";
        }
    }
    public interface CanRun{
        void run();
    }
}
