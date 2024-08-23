package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Arrays;
import java.util.StringTokenizer;

public class ATM_11399_Right {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int[] result = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		result[0] = arr[0];
		
		for(int i = 1; i < N; i++) {
			result[i] = result[i - 1] + arr[i];
		}
		
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			sum += result[i];
		}
		System.out.println(sum);
	}

}