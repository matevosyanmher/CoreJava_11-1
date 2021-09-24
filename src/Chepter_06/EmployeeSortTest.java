package Chepter_06;

import java.util.Arrays;

public class EmployeeSortTest {
    public static void main(String[] args) {
        var staff = new Employee[4];

        staff[0] = new Employee("Harry Hacker", 35000);
        staff[1] = new Employee("Carl Cracker", 75000);
        staff[2] = new Employee("Топу Tester", 38000);
        staff[3] = new Manager("Топу Manager", 8000);

        Manager manager = new Manager("Tony Blinkin", 25000);
        Employee employee = new Employee("Vardan Mamikonyan", 40000);


        if (employee.getClass()==manager.getClass()) {
            System.out.println("Everything is OK");
        }else System.out.println("Not OK");

        Arrays.sort(staff);

        for (Employee e : staff) {
            System.out.println("name:= " + e.getName()+ ", salary: = " + e.getSalary());
        }
    }
}
