package level23.talk11.task3;

import java.io.*;

/*
Писатель в файл с консоли

В этой задаче тебе нужно:
Прочесть с консоли имя файла.
Считывать строки с консоли, пока пользователь не введет строку "exit".
Записать абсолютно все введенные в п.2 строки в файл: каждую строчку — с новой строки.
Требования:
•	Программа должна считывать c консоли имя файла.
•	Создай и используй объект типа BufferedWriter.
•	Программа не должна ничего считывать из файловой системы.
•	Программа должна считывать строки с консоли, пока пользователь не введет строку "exit".
•	Программа должна записать все введенные строки (включая "exit", но не включая имя файла) в файл: каждую строчку — с новой строки.
•	Метод main должен закрывать объект типа BufferedWriter после использования.
•	Метод main не должен выводить данные на экран.
*/

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new FileWriter(br.readLine()));

            String line;
            do {
                line = br.readLine();
                bw.write(line + "\n");
            }
            while (!(line.equals("exit")));

            br.close();
            bw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
