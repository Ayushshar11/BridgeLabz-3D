package Java_Methods.Level2;

import java.util.*;

public class Quadratic {
    public static double[] roots(double a, double b, double c) {
        double d = b * b - 4 * a * c;
        if (d < 0) return new double[]{};
        if (d == 0) return new double[]{-b / (2 * a)};
        double s = Math.sqrt(d);
        return new double[]{(-b + s) / (2 * a), (-b - s) / (2 * a)};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        double[] r = roots(a, b, c);
        for (double x : r) System.out.println(x);
    }
}
