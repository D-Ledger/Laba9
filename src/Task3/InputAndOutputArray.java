package Task3;
import java.util.Scanner;

public class InputAndOutputArray {
    private static int[] array;
    private static int size;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите массив: ");
        size = in.nextInt();
        array = new int[size];

        System.out.println("Введите элементы массива");
        Array(0);

        System.out.println("Содержимое массива");
        printArray(0);
    }

    private static void Array(int index) {
        Scanner in = new Scanner(System.in);

        if (index >= size) {
            return;
        }

        System.out.print("Элемент " + index + ": ");
        array[index] = in.nextInt();
        Array(index + 1);
    }

    private static void printArray(int index) {
        if (index >= size) {
            return;
        }

        System.out.println("Элемент " + index + ": " + array[index]);
        printArray(index + 1);
    }
}
