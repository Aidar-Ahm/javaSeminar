//Вывести все простые числа от 1 до 1000 простое число - то число которое 
//делится без остатка только на 1 и на само себя (1 - это не простое число);

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
                break;
            }
        }
    }
}

