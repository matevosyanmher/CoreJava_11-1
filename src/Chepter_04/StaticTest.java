package Chepter_04;

public class StaticTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Tom",40000);
        staff[1] = new Employee("Dick",60000);
        staff[2] = new Employee("Harry", 65000);

        for (Employee e : staff) {
            e.setID();
            System.out.println("name: " + e.getName() + " ID:" + e.getID() +" salary: " + e.getSalary() );
        }
    }
}
