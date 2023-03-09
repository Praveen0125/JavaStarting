package Praveen;

public class Employee extends Manager {         // Inheritance
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.salary = 12000;
        System.out.println("Salary of employee: "+emp.salary);
        Manager mang = new Manager();
        mang.salary = 180000;
        System.out.println("Salary of manager: "+mang.salary);
    }
}
