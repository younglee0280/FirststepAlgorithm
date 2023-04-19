package multiplicationtable;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class MultiplicationSum_11022_Buffer {
public static void main(String[] args) throws IOException{
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 

	int n = Integer.parseInt(br.readLine());
	
		for(int i=0; i<n; i++) {
			String s = br.readLine();
			int a = Integer.parseInt(s.split(" ")[0]);
			int b = Integer.parseInt(s.split(" ")[1]);
			
			bw.write("Case #" + (i+1) + ": " + a + " + " + b + " = " + (a+b) + "\n");
		}
		br.close();
		//Flushes the stream ; BufferedWriter가 버퍼를 잡아놓았기 때문에 반드시 flush()를 호출해 남아있는 데이터를 모두 출력
		bw.flush();
		bw.close();
}
}
