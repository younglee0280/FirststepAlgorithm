package minmaxsearch;

public class MinMaxSearch {

	public static void main(String[] args) {
		int a[] = {72, 68, 92, 88, 41, 53, 97, 84, 39, 55};
		int max, min, i;
		max = a[0];
		min = a[0];
		
		for(i=1; i<10; i++) {
			if(a[i] > max) {
				max = a[i];
			}
			if(a[i] < min) {
				min = a[i];
			}
		}
		System.out.printf("max = %d\n", max);
		System.out.printf("min = %d", min);
	}

}
