package bubblesort;

public class BubbleSortToStringMethod {

	public static void main(long n) {
		/*
		 * 그냥 배열을 출력하면 원하는 형태로 출력되는 걸 볼 수 없음,
		 * java.util.Arrays의 toString 메서드를 사용하여 배열을 출력
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
