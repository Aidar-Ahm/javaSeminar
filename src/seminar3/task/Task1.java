package seminar3.task;
        //Заполнить список десятью случайными числами.
        //Отсортировать список методом sort() и вывести его на экран.

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(random.nextInt(1,11));
        }
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
    }
}
