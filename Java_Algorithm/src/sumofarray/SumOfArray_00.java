package sumofarray;

public class SumOfArray_00 {

	public static void main(String[] args) {
		int[] a = {72, 68, 92, 88, 41, 53, 97, 84, 39, 55};
		int sum, i;
		sum = 0;
		
		for(i=0; i<a.length; i++) { //a.length = 10
			sum += a[i]; // sum = sum + a[i]��� �ۼ��ص� �Ǳ��ϳ� �̷��� ���� ���� �Ϲ�����
		}				//i�� 10�� �Ǿ� i < 10�̶�� ������ ������ ��Ȳ���� Ȯ���ؾ� �ݺ��� �����. �ݺ��� ��ģ ����(12�ܰ�)�� i���� 10�� ��
		System.out.printf("sum = %d\n", sum);
	}

}
