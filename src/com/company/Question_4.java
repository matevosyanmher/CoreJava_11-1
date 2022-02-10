package com.company;

import java.util.LinkedHashMap;

public class Question_4 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
        map.put("1", "J");
        map.put("2", "A");
        map.put("3", "V");
        map.put("4", "A");

        boolean flg = false;
        if (flg) {
            map.entrySet().stream().forEach(e ->System.out.print(e.getKey()));

        }else
            map.entrySet().stream().forEach(e-> System.out.print(e.getValue()));

    }
}
