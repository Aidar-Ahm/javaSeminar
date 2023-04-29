package homework5.task;
//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Task1 {
    public static void main (String[]args){
        addNumber("Иванов", "+123456");
        addNumber("Васильев", "+321456");
        addNumber("Петрова", "+234561");
        addNumber("Петрова", "+7834561");
        outPutBook();
    }
    static Map<String, ArrayList> contacts = new HashMap<>();
    public static void addNumber(String name, String number) {
        if (contacts.containsKey(name)) {
            contacts.get(name).add(number);
        } else {
            ArrayList<String> list = new ArrayList<>();
            list.add(number);
            contacts.put(name, list);
        }
    }
    public static void outPutBook(){
        for (var item : contacts.entrySet()) {
            String phones = "";
            for(Object el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
}

