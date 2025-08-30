package ControlFlows.Level2;

import java.util.Scanner;

public class MultiplesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n > 0 && n < 100) {
            int counter = 100;
            System.out.print("Multiples: ");
            while (counter >= 1) {
                if (counter % n == 0) {
                    System.out.print(counter + " ");
                }
                counter--;
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}
