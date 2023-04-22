package homework3.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Task2 {
    public static void removeEven() {
        Random random = new Random();
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(random.nextInt(1, 11));
        }
        System.out.println((list1));
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) % 2 == 0) {
                list1.remove(i);
            }
        }
        System.out.println(list1);
    }
}


