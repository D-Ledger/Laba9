package Task2;

import java.util.Scanner;

public class BinaryNumberingSystem {
    public static String binary(int number) {

        if (number == 0) {
            return "0";
        }

        if (number == 1) {
            return "1";
        }

        return binary(number / 2) + (number % 2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Число для перевода: ");
        int number = in.nextInt();

        if (number < 0) {
            System.out.println("Двоичное представление числа " + number + ": -" + binary(-number));
        } else {
            System.out.println("Двоичное представление числа " + number + ": " + binary(number));
        }
    }
}
