package multiplicationtable;

import java.util.Scanner;

public class multiplication_own_25304 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		Integer total = scn.nextInt();
		Integer totalCount = scn.nextInt();
		
		int sum = 0;
		for(int i = 0; i< totalCount; i++) {
			Integer price = scn.nextInt();
			Integer count = scn.nextInt();
			
			sum += (price * count);
		} if (sum == total) {
			System.out.println("Y");
		} else {
			System.out.println("N");
		}
	}

}
