package seminar1;

import seminar1.task.Task1;
import seminar1.task.Task2;
import seminar1.task.Task3;

public class Main {
    public static void main(String[] args){
//        Task1 task1 = new Task1();
//        Task1.hello();
//        Task2.hello();
        int[] array = new int[] {1,1,0,1,1,1};
        System.out.println(Task3.getMaxOneCount(array));
    }
}
