package Java_Methods.Level1;

import java.util.*;

public class MaximumHandshakes {
    public static int calculate(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(calculate(n));
    }
}
