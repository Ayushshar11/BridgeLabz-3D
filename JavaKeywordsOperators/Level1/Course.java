package Level1;

public class Course {
    static String platform;
    private final String code;
    private String title, teacher;

    public Course(String code, String title, String teacher) {
        this.code = code;
        this.title = title;
        this.teacher = teacher;
    }

    public static void setPlatform(String p) {
        platform = p;
    }

    public void showCourse() {
        if (this instanceof Course) {
            System.out.println(code + " - " + title + " by " + teacher + " @ " + platform);
        }
    }

    public static void main(String[] args) {
        Course.setPlatform("Coursera");
        Course c1 = new Course("CS101", "Java", "Mr. Sharma");
        Course c2 = new Course("CS102", "Python", "Ms. Gupta");

        c1.showCourse();
        c2.showCourse();
    }
}
