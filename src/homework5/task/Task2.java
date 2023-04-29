package homework5.task;
//Пусть дан список сотрудников:Иван Иванов ( и остальные, полный текст дз будет на платформе)
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.

import java.util.*;


public class Task2 {
  public static void main(String[] args) {
      List employees = new ArrayList<>();
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
      employees.add("Иван Ежов");

    }
    static Map<String, Integer> nameCount = new HashMap<>();

    public static void outPutPrint(String[] args) {

    }
