package seminar6.task;

import java.util.Arrays;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        Integer [] arr = new Integer[1000];
        arr = fillArray(arr);
        var integerSet = fillSetArray(arr);
        System.out.println("set : " + integerSet);
        double percent = integerSet.size() * 100 / arr.length;
        System.out.println("Процент " + percent);

    }
    public static Integer[] fillArray(Integer[] arr) {
        Random random = new Random();
        var arr2 = arr.clone();
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = random.nextInt(100);
        }
        return arr2;
    }
    public static void printArray(Integer[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static Set<Integer> fillSetArray(Integer[] array) {
        return Arrays.stream(array).collect(Collectors.toSet());
    }
}

