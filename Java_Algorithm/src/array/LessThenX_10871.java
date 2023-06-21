package array;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LessThenX_10871 {

	public static void main(String[] args) throws IOException {
		
		/*BufferedReader :
		* 데이터가 string으로 고정됨, 데이터 가공 필요
		* 멀티 스레드 환경에서 안전
		* 입력은 readLine 메서드
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		//nextToken() 함수 사용: readLine을 통해 공백단위로 구분하여 순서대로 호출 가능
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
			for(int i = 0; i < N; i++) {
				System.out.println();
		}
	}
	}

