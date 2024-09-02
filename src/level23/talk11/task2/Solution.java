package level23.talk11.task2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/*

В этой задаче тебе нужно:
Считать с консоли путь к файлу.
Вывести в консоли (на экран) содержимое файла.
Освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
Требования:
•	Программа должна считывать c консоли путь к файлу.
•	Программа должна выводить на экран содержимое файла.
•	Поток чтения из файла (FileInputStream) должен быть закрыт.
•	BufferedReader также должен быть закрыт.
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String file = scanner.nextLine();

        FileInputStream inputStream = new FileInputStream(file);
        BufferedReader buffer = new BufferedReader(new InputStreamReader(inputStream));
        while (buffer.ready()){
            System.out.println(buffer.readLine());
        }



        inputStream.close();
        buffer.close();


        /*
        Scanner scanner = new Scanner(System.in);
        String file = scanner.nextLine();

        FileInputStream inputStream = null;
        BufferedReader buffer = null;

        try {

            inputStream = new FileInputStream("D:/Users/UserName/someFile.txt");

            buffer = new BufferedReader(new InputStreamReader(inputStream));

            while(buffer.available()>0) {

                char c = (char)buffer.read();

                System.out.println("Был прочитан символ " + c);
            }
        } catch(Exception e) {

            e.printStackTrace();

        } finally {

            assert inputStream != null;
            inputStream.close();
            assert buffer != null;
            buffer.close();
        }
    }
}

         */




//        Scanner scanner = new Scanner(System.in);
//        InputStream inputStream = null;
//        BufferedReader buffer = null;
//        String str = scanner.nextLine();
//
//        try {
//            inputStream = new FileInputStream(str);
//            buffer = new BufferedReader(str);
//
//            while (buffer.available() > 0) {
//                char ch = (char) buffer.read();
//                System.out.println(ch);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            inputStream.close();
//            buffer.close();
//        }
    }
}
