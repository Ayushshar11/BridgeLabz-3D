package Java_Methods.Level1;

import java.util.*;

public class QuotientRemainder {
    public static int[] calc(int n, int d) {
        return new int[]{n % d, n / d};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), d = sc.nextInt();
        int[] r = calc(n, d);
        System.out.println(r[1] + " " + r[0]);
    }
}
