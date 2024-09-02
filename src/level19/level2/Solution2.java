package level19.level2;

import java.util.ArrayList;
import java.util.Collections;

/*
Преобразование списка в массив
*/


public class Solution2 {

    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        Collections.addAll(strings, "Ты", "ж", "программист");

        var integers = new ArrayList<Integer>();
        Collections.addAll(integers, 1000, 2000, 3000);


        String[] stringArray = toStringArray(strings);
        for (String string : stringArray) {
            System.out.println(string);
        }

        Integer[] integerArray = toIntegerArray(integers);
        for (Integer integer : integerArray) {
            System.out.println(integer);
        }
    }

    public static String[] toStringArray(ArrayList<String> strings) {
        strings.toArray(String[]::new);
        return new String[]{};
    }

    public static Integer[] toIntegerArray(ArrayList<Integer> integers) {
        integers.toArray( Integer[]::new );
        return new Integer[]{};
    }
}