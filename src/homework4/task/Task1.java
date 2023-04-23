package homework4.task;
//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
import java.util.Iterator;
import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("qwer");
        list.add("asdf");
        list.add("zxcv");
        System.out.println("Исходный список: " +list);
        Iterator<String> iterator = list.descendingIterator();
        LinkedList<String> list2 = new LinkedList<>();
        while (iterator.hasNext())
        {
            list2.add(iterator.next());
        }
        System.out.println("Перевернутый список: " +list2);
    }
}