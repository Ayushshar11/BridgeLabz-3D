package employee;

public class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(int id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }

    @Override
    public double calculateSalary() { return getBaseSalary(); }

    @Override
    public void assignDepartment(String dept) { this.department = dept; }

    @Override
    public String getDepartmentDetails() { return department; }
}