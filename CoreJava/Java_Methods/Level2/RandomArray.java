package Java_Methods.Level2;

import java.util.*;

public class RandomArray {
    public static int[] generate(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = (int)(1000 + Math.random() * 9000);
        return a;
    }
    public static double[] stats(int[] a) {
        int min = a[0], max = a[0], sum = 0;
        for (int x : a) {
            if (x < min) min = x;
            if (x > max) max = x;
            sum += x;
        }
        return new double[]{(double)sum / a.length, min, max};
    }
    public static void main(String[] args) {
        int[] arr = generate(5);
        double[] s = stats(arr);
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
        System.out.println(s[0] + " " + s[1] + " " + s[2]);
    }
}
