package task19.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
    public static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Collections.addAll(students,
                new Student("Иванов", 22),
                new Student("Петров", 18),
                new Student("Сидоров", 19)
        );

        //Анонимный класс (после фигурных скобок "}" обязательно ставить ";"

        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // Происходит сравнение, в данном случае в обратном порялке от самого старшего к младшему
                return o2.getAge() - o1.getAge();
            }
        };

        // Сортировка коллекции

        Collections.sort(students, comparator);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
