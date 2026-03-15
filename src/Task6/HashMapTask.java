package Task6;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class HashMapTask {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(0, "Ноль");
        map.put(1, "Один");
        map.put(2, "Два");
        map.put(3, "Три");
        map.put(4, "Четыре");
        map.put(5, "Пять");
        map.put(6, "Шесть");
        map.put(7, "Семь");
        map.put(8, "Восемь");
        map.put(9, "Девять");

        StringJoiner zeroKeyStrings = new StringJoiner(", ");
        long productOfKeys = 1;
        boolean hasLongStrings = false;

        System.out.println("Ключ > 5:");

        for (java.util.Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();

            if (key > 5) {
                System.out.println("Ключ " + key + ": " + value);
            }

            if (key == 0) {
                zeroKeyStrings.add(value);
            }

            if (value.length() > 5) {
                productOfKeys *= key;
                hasLongStrings = true;
            }
        }

        if (zeroKeyStrings.length() > 0) {
            System.out.println("\nСтроки с ключом 0: " + zeroKeyStrings.toString());
        }

        if (hasLongStrings) {
            System.out.println("Длина строки > 5: " + productOfKeys);
        } else {
            System.out.println("Строк с длиной > 5 не найдено");
        }
    }
}
