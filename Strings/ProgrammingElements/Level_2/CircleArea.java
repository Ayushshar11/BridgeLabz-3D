package Level_2;

import java.util.Scanner;
public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("The area of circle is " + area);
    }
}

