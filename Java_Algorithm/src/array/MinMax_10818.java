package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MinMax_10818 {

	public static void main(String[] args) throws IOException {

		// 라인 단위로 읽어들임
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());

		/*
		 * 콤마 혹은 공백 기준 문자열 분리, 특정 문자에 따라 문자열 분리하고 싶을때 사용
		 *
		 * 1. StringTokenizer st = new StringTokenizer(문자열); 2. StringTokenizer st = new
		 * StringTokenizer(문자열, 구분자); 3. 구분자를 기준으로 문자열 분리할 때 구분자도 토큰으로 넣는다(True) / 구분자의
		 * 역할만 충족하고 토큰에 넣지 않는다(False) - 디폴트
		 */
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
//		int a[] = new int[N];

		int min = N;
		int max = N;

		for (int i = 0; i < a - 1; i++) {
//			a[i] = Integer.parseInt(br.readLine());
			int M = Integer.parseInt(st.nextToken());

			if (min > M)
				min = M;
			if (max < M)
				max = M;
		}
		System.out.println(min + " " + max);

//		System.out.println(Arrays.toString(a));
	}

}
