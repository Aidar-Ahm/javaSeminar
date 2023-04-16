package seminar2.task;
//Напишите метод, который составит строку, состоящую из 100 повторений слова
//TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.


import java.io.FileWriter;
import java.io.IOException;

public class task3 {
    private static String createTestString(String argument) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append(argument);
        }
    return sb.toString();
    }
    public static void stringWrite(String argument) {
        String str = createTestString(argument);
        try(FileWriter in = new FileWriter("test.txt")) {
            in.append(str);
            System.out.println("Записано");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}


