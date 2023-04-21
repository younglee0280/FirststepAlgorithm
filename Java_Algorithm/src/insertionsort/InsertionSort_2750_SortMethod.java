package insertionsort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort_2750_SortMethod {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int N = scn.nextInt();
		int[] a = new int[N];
		
		for(int i = 0; i < N; i++) {
			a[i] = scn.nextInt();
		}
		
		Arrays.sort(a);
		
		
		for(int val : a) {
			System.out.println(val);
		}
		
	}
}