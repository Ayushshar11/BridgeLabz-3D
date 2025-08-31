package Java_Methods.Level3;

import java.util.*;

public class StudentScorecard {

    public static int[][] generateScores(int students) {
        Random rand = new Random();
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++) {
            scores[i][0] = rand.nextInt(101); // physics
            scores[i][1] = rand.nextInt(101); // chemistry
            scores[i][2] = rand.nextInt(101); // math
        }
        return scores;
    }

    public static double[][] calculateTotals(int[][] scores) {
        double[][] result = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percent = total / 3.0;
            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percent;
        }
        return result;
    }

    public static void displayScorecard(int[][] scores, double[][] result) {
        System.out.printf("%10s %10s %10s %10s %10s %10s\n","P","C","M","Total","Avg","%"); 
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%10d %10d %10d %10.0f %10.2f %10.2f\n", 
                              scores[i][0], scores[i][1], scores[i][2],
                              result[i][0], result[i][1], result[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of students: ");
        int n = sc.nextInt();
        int[][] scores = generateScores(n);
        double[][] result = calculateTotals(scores);
        displayScorecard(scores, result);
    }
}
