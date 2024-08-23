package multiplicationtable;

import java.util.Scanner;

public class MultiplicationStar_2439_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		
		System.out.print("N = ");
		int N = input.nextInt();
	
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N - i; j++) {
				System.out.printf(" ");
			}
			for(int k = 0; k < i; k++){
				System.out.println("*");
			}
			System.out.println();
	}

}
}
