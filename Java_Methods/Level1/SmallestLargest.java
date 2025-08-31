package Java_Methods.Level1;

import java.util.*;

public class SmallestLargest {
    public static int[] find(int a, int b, int c) {
        return new int[]{Math.min(a, Math.min(b, c)), Math.max(a, Math.max(b, c))};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int[] r = find(a, b, c);
        System.out.println(r[0] + " " + r[1]);
    }
}
