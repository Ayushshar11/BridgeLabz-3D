package Arrays.Level2;

import java.util.Scanner;

public class BMIProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of persons
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[] height = new double[n];  // in meters
        double[] weight = new double[n];  // in kg
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Input height and weight
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.print("Enter height (in meters): ");
            height[i] = sc.nextDouble();
            System.out.print("Enter weight (in kg): ");
            weight[i] = sc.nextDouble();

            // Calculate BMI
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determine weight status
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height", "Weight", "BMI", "Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f m   %.2f kg   %.2f   %s\n", height[i], weight[i], bmi[i], status[i]);
        }
    }
}
