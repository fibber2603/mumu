package level21.talk9.task5;

public class Solution {
    public static void main(String[] args) {

    }

    //add public interfaces and a public class here - добавь public интерфейсы и public класс тут
    abstract class Human implements CanRun,CanSwim{

    }

    public interface CanRun {
        void run();
    }

    public interface CanSwim {
        void swim();
    }
}