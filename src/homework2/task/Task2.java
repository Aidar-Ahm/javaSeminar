package homework2.task;
//2. Дана строка json:
//[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//Написать метод, который распарсит этот текст и, используя StringBuilder, создаст строки вида:
//Студент [фамилия] получил [оценка] по предмету [предмет]. Например:
//Студент Иванов получил 5 по предмету Математика.
//Студент Петрова получил 4 по предмету Информатика.
//Студент Краснов получил 5 по предмету Физика.

import java.util.Arrays;

public class Task2 {
    public static String stringParsing(String argument) {
        argument = argument.replace("фамилия:","Студент ");
        argument = argument.replace("оценка:","получил ");
        argument = argument.replace("предмет:","по предмету ");
        argument = argument.replace(","," ");
        argument = argument.replace("{","\n");
        String [] array = argument.split("}");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
        }
        return result.toString();
    }
}
