package com.company;

import Chepter_04.Employee;
import org.jetbrains.annotations.NotNull;

import java.util.Date;
import java.util.Random;

public class Reflect implements Comparable<Employee>{

        public static void main(String[] args) throws ReflectiveOperationException {
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

            Double.compare(454.3, 45458.565);
            byte a = 1;
            byte b = 1;

            int c = a + b;
            c = a++;

            float f = 1.36f;
            double d = 1.36;
            int i = 15;
            short sh = 12;
            double sum = f + d + i + sh;
        }

        @Override
        public int compareTo(@NotNull Employee o) {
                return 0;
        }
}

