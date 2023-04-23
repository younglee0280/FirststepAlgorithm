package multiplicationtable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplicationStar_2439_2_StringBuilder {

	public static void main(String[] args) throws IOException {

		int i, j, k;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		br.close();

		StringBuilder sb = new StringBuilder();

		for (i = 1; i <= N; i++) {
			for (j = 1; j <= N - i; j++) {
				System.out.printf(" ");
			}
			for (k = 1; k <= i; k++) {
				System.out.printf("*");
			}
			System.out.println();
		}

	}

}
