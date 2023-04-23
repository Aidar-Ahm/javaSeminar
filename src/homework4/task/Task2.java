package homework4.task;
//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("1qwer");
        list.add("2asdf");
        list.add("3zxcv");
        String element = "4tyui";
        enqueue(list,element);
        System.out.println(dequeue(list));
        System.out.println(list);
        System.out.println(first(list));
        System.out.println(list);
    }
    private static void enqueue(LinkedList<String> list, String element){
        list.addLast(element);
        System.out.println(list);
    }
    private static String dequeue(LinkedList<String> list){
        String element = list.get(0);
        list.remove(0);
        return element;
    }
    private static String first(LinkedList<String> list){
        String element = list.get(0);
        return element;
    }
}

