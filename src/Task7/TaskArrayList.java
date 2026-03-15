package Task7;

import java.util.ArrayList;
import java.util.List;

public class TaskArrayList {
    public static void main(String[] args) {
        int n = 10; // Количество человек
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();
        int currentIndex = 0;
        while (list.size() > 1) {
            currentIndex = (currentIndex + 1) % list.size();
            list.remove(currentIndex);
        }
        long end = System.currentTimeMillis();

        System.out.println(list.get(0));
    }
}
