package sumofarray;

public class SumOfArrayTrace_01 {

	public static void main(String[] args) {
		int[] a = {72, 68, 92, 88, 41, 53, 97, 84, 39, 55};
		int i, sum = 0;
		System.out.printf("�ݺ� ���� �� : sum = %d", sum);
		
			for(i=0; i < a.length; i++) {
			sum += a[i];
			System.out.printf("�ݺ� ���� �� : sum = %d, i = %d\n", sum, i);
			}
			
		System.out.printf("sum = %d\n", sum);
		System.out.printf("�ݺ� ���� �� : sum = %d, i = %d\n", sum, i);
	}

}
