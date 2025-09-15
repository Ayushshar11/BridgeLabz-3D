
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayRole() {
        System.out.println("Generic Person");
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    void displayRole() {
        System.out.println("Teacher of " + subject);
    }
}

class Student extends Person {
    int grade;

    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    void displayRole() {
        System.out.println("Student in Grade " + grade);
    }
}

class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    void displayRole() {
        System.out.println("Staff working in " + department + " department");
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        Person t = new Teacher("Mr. Sharma", 40, "Mathematics");
        Person s = new Student("Ayush", 20, 12);
        Person st = new Staff("Rahul", 35, "Administration");

        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}
