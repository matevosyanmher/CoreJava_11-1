import org.jetbrains.annotations.NotNull;

public class fib {
    public static void main(String @NotNull [] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(fib(n));
    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2); // fib(n) = fib(n - 1) + fib(n - 2)
    }
}
