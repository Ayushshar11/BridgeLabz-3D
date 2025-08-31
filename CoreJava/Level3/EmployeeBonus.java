package Java_Methods.Level3;

import java.util.*;

public class EmployeeBonus {

    public static double[][] generateSalaryYears(int n) {
        double[][] data = new double[n][2];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            data[i][0] = 10000 + rand.nextInt(90000); // salary
            data[i][1] = rand.nextInt(10) + 1; // years of service
        }
        return data;
    }

    public static double[][] calculateBonus(double[][] data) {
        double[][] result = new double[data.length][3];
        for (int i = 0; i < data.length; i++) {
            double salary = data[i][0];
            double years = data[i][1];
            double bonus = years > 5 ? salary * 0.05 : salary * 0.02;
            result[i][0] = salary;
            result[i][1] = bonus;
            result[i][2] = salary + bonus;
        }
        return result;
    }

    public static void displaySummary(double[][] result) {
        double oldTotal = 0, newTotal = 0, bonusTotal = 0;
        System.out.printf("%10s %10s %10s\n","Old","Bonus","New");
        for (double[] row : result) {
            System.out.printf("%10.2f %10.2f %10.2f\n", row[0], row[1], row[2]);
            oldTotal += row[0];
            bonusTotal += row[1];
            newTotal += row[2];
        }
        System.out.println("Total Old: " + oldTotal + " Total Bonus: " + bonusTotal + " Total New: " + newTotal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of employees: ");
        int n = sc.nextInt();
        double[][] data = generateSalaryYears(n);
        double[][] result = calculateBonus(data);
        displaySummary(result);
    }
}

