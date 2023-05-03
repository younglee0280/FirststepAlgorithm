package quicksort;

public class QuickSort {
	public static void printArray(int[] a) {
	
	for(int i = 0; i < a.length; i++) {
		System.out.printf("[" + a[i] + "]");
	}
	System.out.printf("\n");
	}
	
	public static int divideArray(int[] a, int head, int tail) {
		int left, right, temp;
		left = head + 1;
		right = tail;
		
		while(true) {
			while(left < tail && a[head] > a[left]) {
				left++;
			}
		while(a[head] < a[right]) {
			right--;
		}
		}
		
	}
	public static void main(String[] args) {

	}

}
