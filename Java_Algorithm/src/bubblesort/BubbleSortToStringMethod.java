package bubblesort;

public class BubbleSortToStringMethod {

	//Type mismatch: cannot convert from long to
	public long solution(long n) {
		
		char a[] = String.valueOf(n).toCharArray();
		
		char temp = 'a';
		for(int i = a.length - 1; i > -1; i--) {
			for(int j = 0; j < i; j++) {
				if(a[j] < a[j + 1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		String str = "";
		for(char i : a) {
			str += i;
		}
		
		return Long.parseLong(str);
	}
	/*
	 * �׳� �迭�� ����ϸ� ���ϴ� ���·� ��µǴ� �� �� �� ����,
	 * java.util.Arrays�� toString �޼��带 ����Ͽ� �迭�� ���
	 */
}
