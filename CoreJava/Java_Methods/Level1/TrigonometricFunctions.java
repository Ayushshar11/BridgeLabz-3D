package Java_Methods.Level1;

import java.util.*;

public class TrigonometricFunctions {
    public static double[] calc(double a) {
        double r = Math.toRadians(a);
        return new double[]{Math.sin(r), Math.cos(r), Math.tan(r)};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double[] r = calc(a);
        System.out.println(r[0] + " " + r[1] + " " + r[2]);
    }
}
