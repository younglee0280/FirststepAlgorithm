package bubblesort;

public class BubbleSortToStringMethod {

	public static void main(long n) {
		/*
		 * �׳� �迭�� ����ϸ� ���ϴ� ���·� ��µǴ� �� �� �� ����,
		 * java.util.Arrays�� toString �޼��带 ����Ͽ� �迭�� ���
		 */
		
		char a[] = String.valueOf(n).toCharArray();
		
		char temp = 'a';
		for(int i = a.length - 1; i > -1; i--) {
			for(int j = 0; j < i; j++) {
				if(a[j] < a[j + 1]) {
					temp = a[j];
				}
			}
		}
		
	}

}
