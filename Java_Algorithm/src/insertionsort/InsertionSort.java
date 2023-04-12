package insertionsort;

public class InsertionSort {

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("[" + a[i] + "]");
		}
		System.out.printf("\n");
	}

	public static void main(String[] args) {
		int a[] = { 90, 34, 78, 12, 56 };
		int ins, cmp, temp;

		System.out.printf("���� �� �迭\n");
		printArray(a);
		System.out.printf("\n");

		for (ins = 1; ins < 5; ins++) { // �ܺ� ���� ī����
			System.out.printf("�ܺ� �ݺ���: temp <- a[%d] = %d\n", ins, a[ins]);
			temp = a[ins];
			for (cmp = ins - 1; cmp >= 0; cmp--) { // ���� ���� ī����
				System.out.printf("���� �ݺ���: ins = %d, cmp = %d, temp = %d\n", 
						ins, cmp, temp);
				if (a[cmp] > temp) { // ���������� a[cmp] > temp
					a[cmp + 1] = a[cmp]; // ���� ������ a[cmp] �� �ϳ� �ڷ� �̵�, ���� ��ġ ���
				} else {
					System.out.printf("break�� �ߴ�\n");
					break; // �Ҹ��� �� ����
				}
				
				//���� �ݺ��� 1ȸ ���� �� ���� �߰� ��� ���� ǥ��
				printArray(a);
			}
			System.out.printf("�ܺ� �ݺ���: ins = %d, cmp = %d, temp = %d\n", 
					ins, cmp, temp);
			System.out.printf("�ܺ� �ݺ���: Ȯ���� ���� ��ġ = a[%d] <- temp\n\n", cmp+1);
			a[cmp + 1] = temp; // ���� ��ġ�� temp �� ����

			//���� ��ġ Ȯ�� �� ���� �߰� ��� ���� ǥ��
			System.out.printf("���� ��ġ Ȯ�� �� ���� �߰� ���\n");
			printArray(a);
			System.out.printf("\n");
		}
		
		System.out.printf("���� �� �迭\n");
		printArray(a);

	}

}
