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
	 * �׳� �迭�� ����ϸ� ���ϴ� ���·� ��µǴ� �� �� �� ����,
	 * java.util.Arrays�� toString �޼��带 ����Ͽ� �迭�� ���
	 */
}
