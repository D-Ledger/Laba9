package Task1;

public class Example4 {
    public static int fibonacci(int n) {
        int result;
        if (n == 1) return 1;
        else {
            result  = fibonacci(n - 1) * n;
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
}
