package Level1;

public class Student {
    static String school = "GL Bajaj Public School";
    private final int roll;
    private String name;
    private double marks;

    public Student(int roll, String name, double marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public void showResult() {
        if (this instanceof Student) {
            System.out.println(roll + " - " + name + " | Marks: " + marks + " | " + school);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Amit", 85.5);
        Student s2 = new Student(2, "Riya", 92.0);

        s1.showResult();
        s2.showResult();
    }
}
