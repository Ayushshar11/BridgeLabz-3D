package Level_2;

import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int largest = a;
        if (b > largest) largest = b;
        if (c > largest) largest = c;
        System.out.println("The largest number is " + largest);
    }
}
