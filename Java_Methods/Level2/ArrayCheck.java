package Java_Methods.Level2;

import java.util.*;

public class ArrayCheck {
    public static boolean isPos(int n) { return n > 0; }
    public static boolean isEven(int n) { return n % 2 == 0; }
    public static int compare(int a, int b) { return a > b ? 1 : (a == b ? 0 : -1); }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) arr[i] = sc.nextInt();
        for (int x : arr) {
            if (isPos(x)) System.out.println(isEven(x));
            else System.out.println("neg");
        }
        System.out.println(compare(arr[0], arr[4]));
    }
}
