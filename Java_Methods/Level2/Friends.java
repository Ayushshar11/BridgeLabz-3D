package Java_Methods.Level2;

import java.util.*;

public class Friends {
    public static int youngest(int[] ages) {
        int i = 0; for (int j = 1; j < 3; j++) if (ages[j] < ages[i]) i = j; return i;
    }
    public static int tallest(int[] h) {
        int i = 0; for (int j = 1; j < 3; j++) if (h[j] > h[i]) i = j; return i;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3], h = new int[3];
        for (int i = 0; i < 3; i++) ages[i] = sc.nextInt();
        for (int i = 0; i < 3; i++) h[i] = sc.nextInt();
        System.out.println(youngest(ages));
        System.out.println(tallest(h));
    }
}
