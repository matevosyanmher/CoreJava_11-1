package Chepter_06;

import java.util.Arrays;

public class EmployeeSortTest {
    public static void main(String[] args) {
        var staff = new Employee[5];

        staff[0] = new Employee(5000, "Vardan", 2021, 2, 15);
        staff[1] = new Employee(2000, "Hakob", 2021, 7, 9);
        staff[2] = new Employee(3000, "Karen", 2020, 9, 12);
        staff[3] = new Employee(4000, "Gugush", 2022, 3, 6);
        staff[4] = new Employee(1000, "Karen", 2020, 9, 12);

        Arrays.sort(staff);
        for (Employee employee : staff) {
            System.out.println("name: " + employee.getName() + " salary: " + employee.getSalary() );
        }
        if (staff[0] instanceof Employee) {
            System.out.println("yes");
        }
    }
}
