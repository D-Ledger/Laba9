package Task7;

import java.util.LinkedList;
import java.util.List;

public class TaskLinkedList {
    public static void main(String[] args) {
        int n = 10;
        List<Integer> list = new LinkedList<>();
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
