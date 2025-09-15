package employee;

import java.util.*;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee e1 = new FullTimeEmployee(101, "Alice", 50000);
        e1.assignDepartment("HR");

        PartTimeEmployee e2 = new PartTimeEmployee(102, "Bob", 500, 40);
        e2.assignDepartment("Support");

        employees.add(e1);
        employees.add(e2);

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Department: " + ((Department) emp).getDepartmentDetails());
            System.out.println("Calculated Salary: " + emp.calculateSalary());
            System.out.println("-----------------------------------");
        }
    }
}