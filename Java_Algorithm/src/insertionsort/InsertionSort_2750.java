package insertionsort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort_2750 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int N = scn.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
		}
		
		Arrays.sort(arr);
		
		
		for(int val : arr) {
			System.out.println(val);
		}
		
	}
}