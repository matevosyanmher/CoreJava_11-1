package com.company;

public class Question_1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        if (a + b == c) {
            System.out.println();
        }
    }

    private static String [] method1() {
        String[] array = new String[1];
        StringBuilder sb = new StringBuilder();

        sb.append("Be a ");
        sb.append("Java ");
        sb.append("Programmer");
        array[0] = sb.toString();
        return array;
    }
}
