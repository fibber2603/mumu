package level23.talk11.task8;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


/*
Сортировка четных чисел из файла

В этой задаче тебе нужно:
Ввести имя файла с консоли.
Прочитать из него набор чисел.
Вывести в консоли только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10

Пример вывода:
-2
2
8
10

Требования:
•	Программа должна считывать данные с консоли.
•	Программа должна создавать FileInputStream для введенной с консоли строки.
•	Программа должна выводить данные на экран.
•	Программа должна вывести на экран все четные числа, считанные из файла, отсортированные по возрастанию.
•	Программа должна закрывать поток чтения из файла — FileInputStream.
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));//создаю буфер для чтения данных с файла
        String source = buffer.readLine();
        buffer.close();
        BufferedReader buf = new BufferedReader(new InputStreamReader(new FileInputStream(source)));
        ArrayList<Integer> list = new ArrayList<>();

        int i;
        while (buf.ready()) {
            i = Integer.parseInt(buf.readLine());
            if (i % 2 == 0){
                list.add(i);
            }
        }
        buf.close();
        Collections.sort(list);
        for (Integer in: list) {
            System.out.println(in);
        }
    }
}