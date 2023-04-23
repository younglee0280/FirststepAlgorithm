package multiplicationtable;

import java.util.Scanner;

public class MultiplicationStar_2439_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int N = sc.nextInt();
	
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N - i; j++) {
				System.out.printf(" ");
			}
			for(int k = 0; k < i; k++){
				System.out.printf("*");
			}
			System.out.println();
	}

}
}
