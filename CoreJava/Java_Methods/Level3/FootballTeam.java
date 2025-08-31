package Java_Methods.Level3;

import java.util.*;

public class FootballTeam {

    public static int sum(int[] heights) {
        int total = 0;
        for (int height : heights) total += height;
        return total;
    }

    public static double mean(int[] heights) {
        return (double) sum(heights) / heights.length;
    }

    public static int min(int[] heights) {
        int smallest = heights[0];
        for (int height : heights) if (height < smallest) smallest = height;
        return smallest;
    }

    public static int max(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) if (height > tallest) tallest = height;
        return tallest;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) heights[i] = 150 + (int) (Math.random() * 101);

        System.out.println(min(heights));
        System.out.println(max(heights));
        System.out.println(mean(heights));
    }
}
