package multiplicationtable;

import java.util.Scanner;

public class MultiplicationSum_11022 {

	public static void main(String[] args) {

		int T, A, B;
//		System.out.println("T = ");
		Scanner scn = new Scanner(System.in);
		T = scn.nextInt();

//		scn.close();

		for (int x = 1; x < T; x++) {
			A = scn.nextInt();
			B = scn.nextInt();

			System.out.println("Case #" + x + ": " + A + " + " + B + "=" + (A + B));
		}

		scn.close();
	}
}