package Chepter_03;



import java.util.Arrays;

public class Message {
    public static void main(String  [] args) {
        args = new String[]{"-g", "bad","world"};
        if (args[0].equals("-q")) {
            System.out.print("Hallo");
        } else if (args[0].equals("-g")) {
            System.out.print("Goodbye");
        }
        for (int i = 1; i < args.length; i++) {
            System.out.print(" " + args[i]);
        }
        System.out.println("!");

        String[] name =new String[4];
        System.out.println(Arrays.toString(name));
    }
}
