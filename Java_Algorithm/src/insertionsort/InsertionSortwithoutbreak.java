package insertionsort;

public class InsertionSortwithoutbreak {

		public static void printArray(int[] a){
			for(int i =0; i<a.length; i++) {
				System.out.printf("[" + a[i] + "]");
			}
			System.out.printf("\n");
		} // printArray : �迭 ��� Ŭ����
		
		public static void main(String[] args) {
			int a[] = { 90, 34, 78, 12, 56 };
			int ins, cmp, temp;

		//���� �� �迭 ���� ǥ��
		System.out.printf("���� �� �迭\n");
		printArray(a);
		System.out.printf("\n");
			
		for (ins = 1; ins < a.length; ins++) {
			temp = a[ins];
			for (cmp = ins - 1; cmp >= 0 && a[cmp] > temp; cmp--) {
//				if (a[cmp] > temp) {
//					a[cmp + 1] = a[cmp];
//				} else {
//					break;
				a[cmp + 1] = a[cmp];
			}
			a[cmp + 1] = temp;
			}
		
		//���� �� �迭 ���� ǥ��
		System.out.printf("���� �� �迭\n");
		printArray(a);
		
	}
}