package Arrays.Level2;

import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];   // [student][subjects]
        double[] percentage = new double[n];
        char[] grade = new char[n];
        String[] gradeStr = new String[n];

        // Input marks
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1 ? "Chemistry" : "Maths");
                System.out.print(subject + ": ");
                int m = sc.nextInt();
                if (m < 0) {  // invalid input
                    System.out.println("Marks cannot be negative. Re-enter.");
                    j--; // repeat same subject
                    continue;
                }
                marks[i][j] = m;
            }

            // Calculate percentage
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            // Determine grade
            if (percentage[i] >= 80) {
                gradeStr[i] = "A";
            } else if (percentage[i] >= 70) {
                gradeStr[i] = "B";
            } else if (percentage[i] >= 60) {
                gradeStr[i] = "C";
            } else if (percentage[i] >= 50) {
                gradeStr[i] = "D";
            } else if (percentage[i] >= 40) {
                gradeStr[i] = "E";
            } else {
                gradeStr[i] = "R";
            }
        }

        // Display results
        System.out.println("\n--- Student Report ---");
        System.out.printf("%-10s %-10s %-10s %-12s %-10s\n", "Physics", "Chemistry", "Maths", "Percentage", "Grade");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-10d %-10d %-12.2f %-10s\n",
                    marks[i][0], marks[i][1], marks[i][2], percentage[i], gradeStr[i]);
        }
    }
}
