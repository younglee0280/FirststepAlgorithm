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
		* �����Ͱ� string���� ������, ������ ���� �ʿ�
		* ��Ƽ ������ ȯ�濡�� ����
		* �Է��� readLine �޼���
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		//nextToken() �Լ� ���: readLine�� ���� ��������� �����Ͽ� ������� ȣ�� ����
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
			for(int i = 0; i < N; i++) {
				System.out.println();
		}
	}
	}

