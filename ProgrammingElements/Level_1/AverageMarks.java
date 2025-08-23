package Level_1;
import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Maths marks: ");
        int maths = sc.nextInt();

        System.out.print("Enter Physics marks: ");
        int physics = sc.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chemistry = sc.nextInt();

        double avg = (maths + physics + chemistry) / 3.0;
        System.out.println("Sam’s average mark in PCM is " + avg);
    }
}

