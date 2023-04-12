package bubblesort;

public class BubbleSort {
	// �迭 ����� printArray ����
	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("[" + a[i] + "]");
		}
		System.out.printf("\n");
	}

	public static void main(String[] args) {

		int a[] = { 90, 34, 78, 12, 56 };
		int ins, cmp, temp;

		// ���� �� �迭 ������ ǥ��
		System.out.printf("���� �� �迭 ���� ���\n");
		printArray(a);
		System.out.printf("\n"); // �� ���� ����

		// ���� ���ķ� �������� ����
		for (ins = 0; ins < 5 - 1; ins++) {
			for (cmp = 0; cmp < 5 - ins - 1; cmp++) {
				if (a[cmp] > a[cmp + 1]) {
					temp = a[cmp];
					a[cmp] = a[cmp + 1];
					a[cmp + 1] = temp;
				}
			}
		}
		// ���� �� �迭 ������ ǥ��
		System.out.printf("���� �� �迭 ���� ���\n");
		printArray(a);
		System.out.printf("\n");
	}

}
