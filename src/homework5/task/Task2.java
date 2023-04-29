package homework5.task;
//Пусть дан список сотрудников:Иван Иванов ( и остальные, полный текст дз будет на платформе)
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.

import java.util.*;
import java.util.stream.Collectors;


public class Task2 {
    public static void main(String[] args) {

        employees.add("Иван Иванов");
        employees.add("Светлана Петрова");
        employees.add("Кристина Белова");
        employees.add("Анна Мусина");
        employees.add("Иван Юрин");
        employees.add("Петр Лыков");
        employees.add("Павел Чернов");
        employees.add("Иван Иванов");
        employees.add("Петр Чернышов");
        employees.add("Мария Федорова");
        employees.add("Марина Светлова");
        employees.add("Мария Савина");
        employees.add("Иван Иванов");
        employees.add("Мария Рыкова");
        employees.add("Анна Крутова");
        employees.add("Марина Лугова");
        employees.add("Анна Владимирова");
        employees.add("Петр Лыков");
        employees.add("Иван Мечников");
        employees.add("Петр Лыков");
        employees.add("Марина Светлова");

        countEmploeeys();
        outPut(sort());
    }

    static Map<String, Integer> nameCount = new LinkedHashMap<>();
    static List employees = new ArrayList<>();

    public static void countEmploeeys() {
        for (Object item : employees) {
            if (nameCount.containsKey(item)) {
                nameCount.put((String) item, nameCount.get(item) + 1);
            } else {
                nameCount.put((String) item, 1);
            }
        }

    }
   public static Map<String, Integer> sort(){
       Map<String, Integer> sortedNameCount = nameCount.entrySet().stream()
               .sorted(Comparator.comparingInt(e -> -e.getValue()))
               .collect(Collectors.toMap(
                       Map.Entry::getKey,
                       Map.Entry::getValue,
                       (a, b) -> { throw new AssertionError(); },
                       LinkedHashMap::new));
       return sortedNameCount;
   }
    public static void outPut(Map<String, Integer> map) {
        for (var item : map.entrySet()) {
            System.out.printf("%s: %s \n", item.getKey(), item.getValue() + "раз(а)");
        }
    }
}
