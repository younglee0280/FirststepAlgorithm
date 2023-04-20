package multiplicationtable;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Multiplication_10951 {

	public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//	int a = Integer.parseInt(br.readLine());
	
		for(int i = 0; i < 5; i++) {
			String s = br.readLine();
			int A = Integer.parseInt(s.split(" ")[0]);
			int B = Integer.parseInt(s.split(" ")[1]);
			
			bw.write((A + B) + "\n");
		}
	
		br.close();
		bw.flush();
		bw.close();
	}
}
