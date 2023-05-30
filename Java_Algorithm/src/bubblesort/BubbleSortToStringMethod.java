package bubblesort;

import java.util.Arrays;

public class BubbleSortToStringMethod {

	public static void main(String[] args) {
		int a[] = {6, 4, 2, 1, 3, 5};
		
		int temp = 0;
		
		for(int i = a.length - 1; i > -1; i--) {
			for(int j = 0; j < 1; j++) {
				if(a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j +1];
					a[j+1] = temp;
				}
			}
		}
		System.out.printf(Arrays.toString(a));
	}
	
	/*
	 * 그냥 배열을 출력하면 원하는 형태로 출력되는 걸 볼 수 없음,
	 * java.util.Arrays의 toString 메서드를 사용하여 배열을 출력
	 */
}
