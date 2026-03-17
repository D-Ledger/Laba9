package Task8;

import java.util.Scanner;

public class Project {
    private Nod head = null;

    // Ввод с головы
    public void createHead() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество элементов:");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Значение: ");
            int val = in.nextInt();
            head = new Nod(val, head);
        }
    }

    // Ввод с хвоста (порядок сохраняется)
    public void createTail() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество элементов:");
        int n = in.nextInt();
        if (n <= 0) return;

        System.out.print("Значение 1: ");
        head = new Nod(in.nextInt(), null);
        Nod ref = head;
        for (int i = 1; i < n; i++) {
            System.out.print("Значение " + (i + 1) + ": ");
            ref.next = new Nod(in.nextInt(), null);
            ref = ref.next;
        }
    }

    // Вывод в строку
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Nod ref = head;
        while (ref != null) {
            sb.append(ref.value).append(" ");
            ref = ref.next;
        }
        return sb.toString().trim();
    }

    // Добавление в начало
    public void AddFirst(int value) {
        head = new Nod(value, head);
    }

    // Добавление в конец
    public void AddLast(int value) {
        Nod newNode = new Nod(value, null);
        if (head == null) {
            head = newNode;
            return;
        }
        Nod ref = head;
        while (ref.next != null) {
            ref = ref.next;
        }
        ref.next = newNode;
    }

    // Вставка по номеру
    public void Insert(int value, int index) {
        if (index == 0) {
            AddFirst(value);
            return;
        }
        Nod ref = head;
        for (int i = 0; i < index - 1 && ref != null; i++) {
            ref = ref.next;
        }
        if (ref != null) {
            ref.next = new Nod(value, ref.next);
        }
    }

    // Удаление с головы
    public void RemoveFirst() {
        if (head != null) head = head.next;
    }

    // Удаление с хвоста
    public void RemoveLast() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Nod ref = head;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next = null;
    }

    // Удаление по номеру
    public void Remove(int index) {
        if (index == 0) {
            RemoveFirst();
            return;
        }
        Nod ref = head;
        for (int i = 0; i < index - 1 && ref != null; i++) {
            ref = ref.next;
        }
        if (ref != null && ref.next != null) {
            ref.next = ref.next.next;
        }
    }

    // Рекурсивный ввод с головы
    public void createHeadRec(int n) {
        if (n == 0) return;
        Scanner sc = new Scanner(System.in);
        System.out.print("Значение: ");
        head = new Nod(sc.nextInt(), head);
        createHeadRec(n - 1);
    }

    // Рекурсивный ввод с хвоста
    public void createTailRec(int n) {
        Scanner sc = new Scanner(System.in);
        head = createTailRecHelper(n, sc);
    }

    private Nod createTailRecHelper(int n, Scanner sc) {
        if (n == 0) return null;
        System.out.print("Значение: ");
        Nod newNode = new Nod(sc.nextInt(), null);
        newNode.next = createTailRecHelper(n - 1, sc);
        return newNode;
    }

    // Рекурсивный вывод в строку
    public String toStringRec() {
        return toStringRecHelper(head).trim();
    }

    private String toStringRecHelper(Nod ref) {
        if (ref == null) return "";
        return ref.value + " " + toStringRecHelper(ref.next);
    }
}
