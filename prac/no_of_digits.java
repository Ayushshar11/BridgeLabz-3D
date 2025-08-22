package practise;

import java.util.Scanner;

public class no_of_digits {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println((int)Math.floor(Math.log10(x))+1);
	}

}
