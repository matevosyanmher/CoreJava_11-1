package Chepter_06;

import java.time.LocalDate;

public class Employee implements Comparable<Employee> {
    private double salary;
    private String name;
    private LocalDate hireDate;

    public Employee(double salary, String name, int year, int month, int day) {
        this.salary = salary;
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void raiseSalary(double byPercent) {
        double rise =salary*byPercent/100;
        salary += rise;
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(salary, o.salary);
    }
}
