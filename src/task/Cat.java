package task;

public class Cat extends Pet {
    public static final String CAT = "Я не люблю людей.";
    public void printInfo(){
        super.printInfo();
        System.out.println(CAT);
    }
}

