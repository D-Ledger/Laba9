package Task8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Project list = new Project();
        Scanner in = new Scanner(System.in);

        System.out.println("CreateHead (ввод 3 элементов)");
        list.createHead();
        System.out.println("Список после createHead: " + list.toString());

        System.out.println("СreateTail (ввод элементов в конец списка):");
        list.createTail();
        System.out.println("Список после createTail: " + list.toString());

        System.out.println("\nAddFirst:");
        list.AddFirst(100);
        System.out.println("Результат: " + list.toString());

        System.out.println("\nAddLast:");
        list.AddLast(200);
        System.out.println("Результат: " + list.toString());

        System.out.println("\nInsert:");
        list.Insert(555, 2);
        System.out.println("Результат: " + list.toString());

        System.out.println("\nУдаления:");
        list.RemoveFirst();
        list.RemoveLast();
        list.Remove(1);
        System.out.println("Итоговый список после удалений: " + list.toString());

        System.out.println("\nРекурсии");
        Project recList = new Project();

        System.out.print("Сколько элементов добавить через createHeadRec: ");
        int countHead = in.nextInt();
        recList.createHeadRec(countHead);
        System.out.println("Список (createHeadRec): " + recList.toStringRec());

        System.out.println("CreateTailRec (введите количество и значения для 3 элементов)");
        System.out.println("Сколько элементов создать рекурсивно: ");
        int count = in.nextInt();
        recList.createTailRec(count);

        System.out.print("Вывод через toStringRec: ");
        System.out.println(recList.toStringRec());
    }
}
