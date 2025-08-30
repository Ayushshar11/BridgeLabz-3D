package ControlFlows.Level2;

import java.util.Scanner;

public class MultiplesFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n > 0 && n < 100) {
            System.out.print("Multiples: ");
            for (int i = 100; i >= 1; i--) {
                if (i % n == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}
