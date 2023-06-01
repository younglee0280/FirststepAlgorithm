package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MinMax_10818 {

	public static void main(String[] args) throws IOException {

		// ���� ������ �о����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());

		/*
		 * �޸� Ȥ�� ���� ���� ���ڿ� �и�, Ư�� ���ڿ� ���� ���ڿ� �и��ϰ� ������ ���
		 *
		 * 1. StringTokenizer st = new StringTokenizer(���ڿ�); 2. StringTokenizer st = new
		 * StringTokenizer(���ڿ�, ������); 3. �����ڸ� �������� ���ڿ� �и��� �� �����ڵ� ��ū���� �ִ´�(True) / ��������
		 * ���Ҹ� �����ϰ� ��ū�� ���� �ʴ´�(False) - ����Ʈ
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
