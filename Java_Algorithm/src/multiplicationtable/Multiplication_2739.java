package multiplicationtable;

import java.util.Scanner;

public class Multiplication_2739 {

	public static void main(String[] args) {

		int m, n, x;
		Scanner scn = new Scanner(System.in);
		System.out.print("입력값 = ");
		x = scn.nextInt();

		for (m = x; m <= x; m++) {
//			System.out.printf("%d단", x);
			for (n = 1; n <= 9; n++) {
			System.out.println(m + " x " + n + " = " + (m * n));
		}
//		System.out.printf("\n");
	}
	}
}
