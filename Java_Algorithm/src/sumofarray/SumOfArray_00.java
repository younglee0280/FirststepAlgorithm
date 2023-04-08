package sumofarray;

public class SumOfArray_00 {

	public static void main(String[] args) {
		int[] a = {72, 68, 92, 88, 41, 53, 97, 84, 39, 55};
		int sum, i;
		sum = 0;
		
		for(i=0; i<a.length; i++) { //a.length = 10
			sum += a[i]; // sum = sum + a[i]라고 작성해도 되긴하나 이렇게 쓰는 것이 일반적임
		}				//i가 10이 되어 i < 10이라는 조건이 거짓인 상황까지 확인해야 반복을 멈춘다. 반복을 마친 시점(12단계)에 i값은 10인 것
		System.out.printf("sum = %d\n", sum);
	}

}
