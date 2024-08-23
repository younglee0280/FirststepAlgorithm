package multiplicationtable;

import java.util.Scanner;

public class Multiplication_2739 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("x = ");
		int x = input.nextInt();

		for (int i = 1; i <= 9; i++) {
			System.out.println(x + " * " + i + " = " + x * i);
		}
	}
}
