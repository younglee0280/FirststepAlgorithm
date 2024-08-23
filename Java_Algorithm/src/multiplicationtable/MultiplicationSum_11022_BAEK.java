package multiplicationtable;

import java.util.Scanner;

public class MultiplicationSum_11022_BAEK {
	
//	public class Main{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		int array[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = input.nextInt();
			b[i] = input.nextInt();
			array[i] = a[i] + b[i];
		}
		
		for(int i=0; i< n; i++) {
			System.out.print("Case #");
			System.out.print((i+1)+": ");
			System.out.println(a[i]+" + "+b[i]+" = "+array[i]);
		}

	}
}
//}