package homework1.task;

import java.util.Scanner;

public class Task3 {
    public static void calc() {
       double num1;
       double num2;
       String operation;
       Scanner scanner = new Scanner(System.in);
       System.out.println("Введите первое число");
       num1 = scanner.nextDouble();
       System.out.println("Введите второе число");
       num2 = scanner.nextDouble();
       System.out.println("Введите операцию : +, -, *, /");
       operation = scanner.next();
       if (operation.equals("+")) System.out.println("Ответ " + (num1 + num2));
       else if (operation.equals("-")) System.out.println("Ответ " + (num1 - num2));
       else if (operation.equals("/")) System.out.println("Ответ " +  (num1 / num2));
       else if (operation.equals("*")) System.out.println("Ответ " + (num1 * num2));
    }
    }