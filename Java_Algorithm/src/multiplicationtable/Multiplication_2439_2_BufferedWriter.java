package multiplicationtable;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Multiplication_2439_2_BufferedWriter {

	public static void main(String[] args) throws IOException {

		int i, j, k;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		br.close();

		for (i = 1; i <= N; i++) {
			for (j = 1; j <= N - i; j++) {
				bw.write(' ');
			}
			for (k = 1; k <= i; k++) {
				bw.write('*');
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}

}
