package Task1;

public class Example5 {
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            System.out.println((n - 2));
            int result1 = fibonacci(n - 2);

            // Рекурсивный вызов для n-1
            System.out.println(n - 1);
            int result2 = fibonacci(n - 1);

            int result = result1 + result2;
            System.out.println(n + " <- " + result1 + " + " + result2 + " = " + result);
            return result;
        }
    }
}
