package Java_Methods.Level2;

import java.util.*;

public class SumRecursion {
    public static int recur(int n) {
        if (n == 0) return 0;
        return n + recur(n - 1);
    }
    public static int formula(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = recur(n), f = formula(n);
        System.out.println(r);
        System.out.println(f);
        System.out.println(r == f);
    }
}
