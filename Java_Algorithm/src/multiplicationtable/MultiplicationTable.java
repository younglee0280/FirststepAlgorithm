package multiplicationtable;

public class MultiplicationTable {

	public static void main(String[] args) {
		int step, num;

		for (step = 1; step <= 9; step++) {
			System.out.printf("%d��", step);
			for (num = 1; num <= 9; num++) {
				System.out.printf("\t%2d", step * num);
				/*
				 * %2d : 2�ڸ����� ������ ������ �߰��ؼ� 2�ڸ� Ȯ�� ex)_1 (_�� 0x20, �����̽�, ������ �ǹ�) 2�ڸ����� ũ�� �״��
				 * ��µ� ex) "12345"
				 * 
				 * %02d : 2�ڸ����� ������ '0'�� �߰��ؼ� 2�ڸ��� Ȯ�� ex) 01 2�ڸ����� ũ�� �״�� ��µ˴ϴ�. ex) "12345"
				 * 
				 * %-2d : (���� ����) 2�ڸ����� ������ ������ �߰��ؼ� 2�ڸ��� Ȯ�� ex) 1_ (_�� 0x20, �����̽�, ������ �ǹ�)
				 * 2�ڸ����� ũ�� �״�� ��µ˴ϴ�. ex) "12345"
				 *
				 * %+2d : ����� ��� '+'�� �ٿ���
				 * 
				 */

			}
			System.out.printf("\n");
		}

	}

}
