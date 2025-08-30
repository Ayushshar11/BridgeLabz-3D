package ControlFlows.Level1;

import java.util.Scanner;

public class SumNaturalWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n >= 0) {
            int formulaSum = n * (n + 1) / 2;
            int sum = 0, i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }
            System.out.println("Sum using formula = " + formulaSum);
            System.out.println("Sum using while = " + sum);
        } else {
            System.out.println("Not a natural number");
        }
    }
}

