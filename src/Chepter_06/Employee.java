package Chepter_06;

<<<<<<< HEAD
import java.time.LocalDate;

public class Employee implements Comparable<Employee> {
    private double salary;
    private String name;
    private LocalDate hireDate;

    public Employee(double salary, String name, int year, int month, int day) {
        this.salary = salary;
        this.name = name;
=======
import org.jetbrains.annotations.NotNull;

public class Employee implements Comparable<Employee> {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
>>>>>>> origin/master
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void raiseSalary(double byPercent) {
<<<<<<< HEAD
        double rise =salary*byPercent/100;
=======
        double rise = salary * byPercent / 100;
>>>>>>> origin/master
        salary += rise;
    }

    @Override
<<<<<<< HEAD
    public int compareTo(Employee o) {
        return Double.compare(salary, o.salary);
=======
    public int compareTo(@NotNull Employee other) {
        return Double.compare(salary, other.salary);
>>>>>>> origin/master
    }
}
