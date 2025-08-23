package ControlFlows.Level2;

import java.util.Scanner;

public class FactorsWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.print("Factors: ");
            int i = 1;
            while (i <= n) {
                if (n % i == 0) {
                    System.out.print(i + " ");
                }
                i++;
            }
        } else {
            System.out.println("Not a positive integer");
        }
    }
}
