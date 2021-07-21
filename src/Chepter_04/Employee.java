package Chepter_04;

public class Employee {
    private static int nextID = 1;

    private final String name;
    private double salary;
    private int ID;

    public Employee(String n, double s) {
        this.name = n;
        this.salary = s;
        ID = 0;

    }

    public static int getNextID() {
        return nextID;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getID() {
        return ID;
    }

    public void setID() {
        this.ID = nextID;
        nextID++;
    }

    public static void main(String[] args) {
        var e = new Employee("Henry", 5000);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}