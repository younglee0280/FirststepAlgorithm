package multiplicationtable;

import java.util.Scanner;

public class MultiplicationSum_11022_Array {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int i;
		int n = scn.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		int array[] = new int[n];
		
		for(i = 0; i < a.length; i++) {
			a[i] = scn.nextInt();
			b[i] = scn.nextInt();
			array[i] = a[i] + b[i];
		}
		
		for(i=0; i< n; i++) {
			System.out.print("Case #");
			System.out.print((i+1)+": ");
			System.out.println(a[i]+" + "+b[i]+" = "+array[i]);
		}

	}
}