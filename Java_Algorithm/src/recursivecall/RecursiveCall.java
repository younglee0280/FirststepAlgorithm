package recursivecall;

public class RecursiveCall {
	
	/*
	 * ��� ȣ���� �ݺ� �۾��� �����ϴ� ���̱� ������ �ð� ���⵵�� �������� ����
	 * ��� ȣ�� ���� �� �󸶳� ����Ǵ���, �� �� ȣ�� �� � �۾��� �ϴ��� �� ������ ��
	 * 
	 * ��� ȣ���� ����(��� ȣ���� �󸶳� ���������� �Ͼ����)�� 10,000 ���Ϸ� ����(���Ƶ� 20,000 ����)
	 * 	ȣ��� �޼��忡�� ����� �������� �޸𸮿� �߰� �Ҵ�ǰ�, ���̻� �������� ���� �� �ڵ����� �޸𸮿��� �Ҵ��� ����
	 * 	�߰��� ������� �ʴ´ٸ� �������� �޸𸮸� ��� �Ҵ�, StackOverflowError �߻�
	 * 
	 */
	
	public static int factorial(int n) {
		if(n == 0) {
			return 1;
		} else {
			return n * factorial(n-1);
		}
	}
	
	public static void main(String[] args) {
		int ans;
		
		ans = factorial(5);
		System.out.printf("%d\n", ans);
	}
}
