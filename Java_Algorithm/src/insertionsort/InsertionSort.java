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

		// ���� �� �迭 ���� ǥ��
		System.out.printf("���� �� �迭\n");
		printArray(a);
		System.out.printf("\n");

		for (ins = 1; ins < 5; ins++) { // �ܺ� ���� ī����
			temp = a[ins];
			for (cmp = ins - 1; cmp >= 0; cmp--) { // ���� ���� ī����
				if (a[cmp] > temp) { // ���������� a[cmp] > temp
					a[cmp + 1] = a[cmp]; // ���� ������ a[cmp] �� �ϳ� �ڷ� �̵�, ���� ��ġ ���
				} else {
					break; // �Ҹ����� ����
				}

			}
			a[cmp + 1] = temp; // ���� ��ġ�� temp �� ����

			// ���� �� �迭 ���� ǥ��
			System.out.printf("���� �� �迭\n");
			printArray(a);
		}

	}

}
