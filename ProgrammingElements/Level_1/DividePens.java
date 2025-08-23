package Level_1;
import java.util.Scanner;

public class DividePens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of pens: ");
        int pens = sc.nextInt();

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int pensPerStudent = pens / students;
        int remaining = pens % students;

        System.out.println("The Pen Per Student is " + pensPerStudent +
                " and the remaining pen not distributed is " + remaining);
    }
}
