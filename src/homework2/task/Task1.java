package homework2.task;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

//1.Реализуйте алгоритм сортировки пузырьком числового массива, результат после
//каждой итерации запишите в лог-файл.(через FileWriter).
public class Task1 {
    public static void write(int[] arg) {
        StringBuilder sb = new StringBuilder();
        int temp = 0;
        int n = arg.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (arg[j] < arg[j - 1]) {
                    temp = arg[j];
                    arg[j] = arg[j - 1];
                    arg[j - 1] = temp;
                }
                sb.append(Arrays.toString(arg)).append("\n");
            }
        }
        try (FileWriter in = new FileWriter("log-file.txt")) {
            in.append(sb);
            System.out.println("Записано");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
