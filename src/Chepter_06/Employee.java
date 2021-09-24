package Chepter_06;

import org.jetbrains.annotations.NotNull;

public class Employee implements Comparable<Employee> {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void raiseSalary(double byPercent) {
        double rise = salary * byPercent / 100;
        salary += rise;
    }

    @Override
    public int compareTo(@NotNull Employee other) {
        return Double.compare(salary, other.salary);
    }
}
