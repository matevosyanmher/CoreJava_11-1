package com.company;

import java.time.LocalDateTime;

public class Question_3 {
    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = ldt1.plusDays(0);

        if (!isLocalDateTime(ldt1)) {
            return;
        }
        if (ldt2.isAfter(ldt1) || ldt2.isBefore(ldt1)) {
            System.out.println("ldt1 and ldt2 aren't the same");

        }
        System.out.println("ldt1 and ldt2 are the same");
    }

    private static boolean isLocalDateTime(LocalDateTime ldt) {
        boolean flg = ldt instanceof LocalDateTime;
        return flg;
    }
}
