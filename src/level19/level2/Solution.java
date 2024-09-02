package level19.level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {

    public static void main(String[] args) {
        var strings = new ArrayList<String>();

        Collections.addAll(strings, "JavaRush", "Amigo", "Java Developer", "CodeGym");

        sortStringsByLength(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static void sortStringsByLength(ArrayList<String> strings) {
        Comparator<String> comparator = new StringComparator();
        Collections.sort(strings, comparator);
    }
}