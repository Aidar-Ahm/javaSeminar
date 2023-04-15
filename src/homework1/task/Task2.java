package homework1.task;

public class Task2 {
    public static void simple() {
        for (int i = 1; i <= 1000; i++) {
            for (int j = 2; j < i; j++)
            {
                if (i % j == 0) {
                    break;
                }
                else System.out.println(i);
                break;}
            }
        }
}

