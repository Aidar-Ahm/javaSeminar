package Seminar5.task;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class Task1 {
    public static void main(String[] args) {
        Map<Integer, String> db = new LinkedHashMap<>();
        db.put(123456, "Иванов");
        db.put(321456, "Васильев");
        db.put(234561, "Петрова");
        db.put(234432, "Иванов");
        db.put(654321, "Петрова");
        db.put(345678, "Иванов");
        for (var item : db.entrySet()) {
            if (item.getValue().equals("Иванов")) {
                System.out.println(item);
            }
        }
    }
}
