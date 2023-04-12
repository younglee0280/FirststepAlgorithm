package insertionsort;

import java.util.Arrays;

public class SortMethod {

	public static void main(String[] args) {

		/*
		 * int 배열 정렬 Arrays.sort()의 인자로 배열을 전달하면 오름차순으로 정렬 sort() 함수 내부에서 변수 a의 순서를
		 * 변경해주기 때문에 따로 a에 할당해 줄 필요가 없다.
		 */
		int a[] = { 90, 34, 78, 12, 56 };
		Arrays.sort(a);
		System.out.println("Sorted a[] : " + Arrays.toString(a));
	}

}
