package seminar3.task;
//        Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//        Вывести название каждой планеты и количество его повторений в списке.


import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> planets = new ArrayList<>();
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Venera");
        planets.add("Venera");
        planets.add("Venera");
        planets.add("Pluto");
        planets.add("Pluto");
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        List<String> res = new ArrayList<>();
        for (int i = 0; i < planets.size(); i++) {
            if (!res.contains(planets.get(i))){
                res.add(planets.get(i));
                int count = 0;
                for (String planet : planets) {
                    if (planet.equals(planets.get(i))) count++;
                }
            sb.append(planets.get(i)).append(":").append(count).append("\n");
            }
        }
        System.out.println(sb);
        System.out.println(System.currentTimeMillis()-startTime);
    }
}
