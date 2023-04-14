package multiplicationtable;

import java.util.Scanner;

public class MultiplicationStar_2438 {

	public static void main(String[] args) {

		System.out.println("x = ");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
