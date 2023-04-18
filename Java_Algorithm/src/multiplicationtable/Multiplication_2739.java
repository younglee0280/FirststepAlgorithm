package multiplicationtable;

import java.util.Scanner;

public class Multiplication_2739 {

	public static void main(String[] args) {

		System.out.print("x = ");
		int m, n, x;
		Scanner scn = new Scanner(System.in);
		scn.close();
		x = scn.nextInt();

		for (m = x; m <= x; m++) {
			for (n = 1; n <= 9; n++) {
				System.out.println(m + " * " + n + " = " + (m * n));
			}
//		System.out.printf("\n");
		}
	}
}
