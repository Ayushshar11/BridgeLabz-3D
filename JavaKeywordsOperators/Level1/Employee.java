package Level1;
public class Employee {
    static String company;
    static int count = 0;

    private final int id;
    private String name, role;

    public Employee(String name, int id, String role) {
        this.name = name;
        this.id = id;
        this.role = role;
        count++;
    }

    public static void setCompany(String comp) {
        company = comp;
    }

    public static void showCount() {
        System.out.println("Total Employees: " + count);
    }

    public void showDetails() {
        if (this instanceof Employee) {
            System.out.println("[" + id + "] " + name + " - " + role + " @ " + company);
        }
    }

    public static void main(String[] args) {
        Employee.setCompany("Tech Solutions");
        Employee e1 = new Employee("Raj", 101, "Developer");
        Employee e2 = new Employee("Priya", 102, "Manager");

        Employee.showCount();
        e1.showDetails();
        e2.showDetails();
    }
}
