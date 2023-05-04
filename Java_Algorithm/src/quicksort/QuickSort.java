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
		if(left <= right) {
			break;
		}
		temp = a[left];
		a[left] = a[right];
		a[right] = temp;
		
		left++;
		right--;
		}
		
		temp = a[head];
		a[head] = a[right];
		a[right] = temp;
		
		return right;
	}
	
	public static void sortArray(int[] a, int start, int end){
		int pivot;
		
		if(start < end) {
			pivot = divideArray(a, start, end);
			
			sortArray(a, start, end);
			
			sortArray(a, pivot + 1, end);
		}
	}
	
	public static void main(String[] args) {
		int[] a = {4, 7, 1, 6, 2, 5, 3};
		
		printArray(a);
		
		sortArray(a, 0, a.length-1);
		
		printArray(a);
	}
}
