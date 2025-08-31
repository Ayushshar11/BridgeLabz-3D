package Java_Methods.Level3;

import java.util.*;

public class CalendarDisplay {

    public static String getMonthName(int month) {
        String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        return months[month - 1];
    }

    public static int getDaysInMonth(int month, int year) {
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (month == 2 && isLeap(year)) return 29;
        return days[month - 1];
    }

    public static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static int firstDay(int month, int year) {
        int y = year - (month < 3 ? 1 : 0);
        int m = month + (month < 3 ? 12 : 0);
        int k = y % 100;
        int j = y / 100;
        return (1 + 13 * (m + 1) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();
        int days = getDaysInMonth(month, year);
        int start = firstDay(month, year);

        for (int i = 0; i < start; i++) System.out.print("   ");
        for (int d = 1; d <= days; d++) {
            System.out.printf("%3d", d);
            if ((d + start) % 7 == 0) System.out.println();
        }
    }
}
