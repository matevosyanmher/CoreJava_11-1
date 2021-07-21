package Chepter_03;

public class Main {
    public static void main(String[] args) {
        int result = sum(5);
        System.out.println(result);
    }

    private static int sum(int i) {
        if (i > 0) {
            return i = i * sum(i - 1);
        } else return 0;
    }
}