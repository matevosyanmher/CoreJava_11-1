package com.company;

import Chepter_04.Employee;

import java.util.Date;
import java.util.Random;

public class Reflect {

    Double aDouble = Double.parseDouble("20.3");

    public static void main(String[] args) throws ReflectiveOperationException{

        var random = new Random();
        Class cl = random.getClass();
        String name = cl.getName();
        System.out.println(name);

        String className = "java.lang.String";
        var aClass = Class.forName(className);
        System.out.println("class " + aClass.getName());
        System.out.println(" ");

        Employee employee = new Employee("Mher Matevosyan", 50000);
        String employeeClassName = employee.getClass().getName() + " " + employee.getName();
        System.out.println(employeeClassName);
        System.out.println(" ");

        Class cl1 = Date.class;
        Class cl2 = int.class;
        Class cl3 = Date[].class;

        System.out.println(cl1.getName());
        System.out.println(cl2);
        System.out.println(cl3);


        if (employee.getClass() == Manager.class) System.out.println(true);
        else System.out.println(false);




    }
}
