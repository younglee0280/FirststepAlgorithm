package bubblesort;

public class BubbleSortToStringMethod {

	public static void main() {
		int[] array = {6, 4, 2, 1, 3, 5};
		
		int temp = 0;
		
		for(int i = array.length - 1; i > -1; i--) {
			for(int j = 0; j < 1; j++) {
				if(array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j +1];
					array[j+1] = temp;
				}
			}
		}
	}
	
	//	System.out.println(Arrays.toString(array));
	/*
	 * �׳� �迭�� ����ϸ� ���ϴ� ���·� ��µǴ� �� �� �� ����,
	 * java.util.Arrays�� toString �޼��带 ����Ͽ� �迭�� ���
	 */
}
