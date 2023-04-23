package multiplicationtable;

import java.util.Scanner;

public class MultiplicationStar_2439_2 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);	
		int N = scn.nextInt();
	
		for(int i = 0; i <= N; i++) {
			for(int j = 1; j <= N-i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++){
				System.out.print("*");
			}
			System.out.println();
	}

}
}
