package homework1.task;
//Вычислить n-ое треугольного число (сумма чисел от 1 до n),
//        n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Task1 {
    public static void triangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        int sum = 0;
        int factorial = 1;
        for(int i = 1; i <= number; i++){
            sum +=i;
            factorial *=i;
        }
        System.out.printf("Треугольное число: %d ", sum);
        System.out.printf("Факториал: %d", factorial);

    }
}
