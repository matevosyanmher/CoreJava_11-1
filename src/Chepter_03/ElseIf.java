package Chepter_03;

public class ElseIf {
    public static void main(String[] args) {
        int goal = 100;
        int yourSales = 255;
        String performance = null;
        int bonus = 0;

        if (yourSales >= goal * 2.5) {
            performance = "Excellent";
            bonus = 150;
        } else if (yourSales >= goal * 1.5) {
            performance = "Fine";
            bonus = 100;
        } else if (yourSales >= goal) {
            performance = "Satisfactory";
            bonus = 0;
        } else {
            System.out.println("You are Fired");
        }
        System.out.println(performance);
        System.out.println(bonus);
    }
}
