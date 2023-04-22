package homework3.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task3 {
    public static void minMax() {
        Random random = new Random();
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(random.nextInt(1, 11));
        }
        System.out.println(list1);
        System.out.println(Collections.max(list1));
        System.out.println((Collections.min(list1)));

    }
}
