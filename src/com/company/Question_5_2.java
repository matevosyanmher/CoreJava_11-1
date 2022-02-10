package com.company;

public class Question_5_2 {
    public static void main(String[] args) {
        Question_5_1 instance1 = new Question_5_1();
        Question_5_1 instance2 = new Question_5_1();

        instance1.setNumber(0);
        instance2.setNumber(0);

        if (instance1.getNumber() == instance2.getNumber()) {
            System.out.print("true");

            if (instance1.equals(instance2)) {
                System.out.print(" " + "true");

            } else {

                System.out.println(" " + "false");
            }
        }
    }
}
