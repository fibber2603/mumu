package task;

public class Dog extends Pet {
    public static final String DOG = "Я люблю людей.";

    public void printInfo(){
        super.printInfo();
        System.out.println(DOG);
    }
}
