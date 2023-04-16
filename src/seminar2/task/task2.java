package seminar2.task;
//Напишите метод, который сжимает строку.
//        Пример: aaaabbbcdd → a4b3cd2


public class task2 {
    public static String stringCompress (String argument) {
        int count = 1;
        String [] array = argument.split(""); //regex: "" по символьно
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                result.append(array[i]);
                continue;
            }
            if (array[i].equals(array[i - 1])){
                count++;
            }
            else {
                result.append(count);
                count = 1;
                result.append(array[i]);
            }
        }
        if (count != 1 ) result.append(count);
        return result.toString();
    }
}
