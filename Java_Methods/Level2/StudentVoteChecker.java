package Java_Methods.Level2;

import java.util.*;

public class StudentVoteChecker {
    public static boolean canVote(int a) {
        if (a < 0) return false;
        return a >= 18;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        for (int i = 0; i < 10; i++) ages[i] = sc.nextInt();
        for (int a : ages) System.out.println(canVote(a));
    }
}
