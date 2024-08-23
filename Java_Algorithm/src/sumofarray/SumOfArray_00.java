package sumofarray;

public class SumOfArray_00 {

	public static void main(String[] args) {
		int[] a = {72, 68, 92, 88, 41, 53, 97, 84, 39, 55};
		int sum = 0;
		
		for(int i=0; i<a.length; i++) { //a.length = 10
			sum += a[i]; //반복을 마친 시점(12단계)에 i값은 10인 것
		}
		System.out.printf("sum = %d\n", sum);
	}

}
