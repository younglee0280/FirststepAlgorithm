package selectionsort;

public class SelectionSort {
	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("[" + a[i] + "]");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		int a[] = { 90, 34, 78, 12, 56 };
		int ins, cmp, min, temp;

		// ���� �� �迭 ���� ǥ��
		System.out.printf("���� �� �迭\n");
		printArray(a);
		System.out.println("\n");

		for (ins = 0; ins < 5 - 1; ins++) {
			min = ins;
		}
		for (cmp = ins + 1; cmp < 5; cmp++) {
			if (a[cmp] < a[ins]) {
				min = cmp;
				temp = a[ins];
				a[ins] = a[min];
				a[min] = temp;
			}
		}
		// ���� �� �迭 ���� ǥ��
		System.out.printf("���� �� �迭\n");
		printArray(a);
}
}