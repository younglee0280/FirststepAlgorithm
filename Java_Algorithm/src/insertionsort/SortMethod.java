package insertionsort;

import java.util.Arrays;

public class SortMethod {

	public static void main(String[] args) {

		/*
		 * int �迭 ���� Arrays.sort()�� ���ڷ� �迭�� �����ϸ� ������������ ���� sort() �Լ� ���ο��� ���� a�� ������
		 * �������ֱ� ������ ���� a�� �Ҵ��� �� �ʿ䰡 ����.
		 */
		int a[] = { 90, 34, 78, 12, 56 };
		Arrays.sort(a);
		System.out.println("Sorted a[] : " + Arrays.toString(a));
	}

}
