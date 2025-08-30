package Arrays.Level2;

import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String numStr = String.valueOf(num);
        int[] digits = new int[numStr.length()];
        int[] reversed = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }

        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }

        System.out.print("Reversed number: ");
        for (int d : reversed) {
            System.out.print(d);
        }
    }
}
