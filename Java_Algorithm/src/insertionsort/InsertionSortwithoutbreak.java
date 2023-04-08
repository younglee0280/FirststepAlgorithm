package insertionsort;

public class InsertionSortwithoutbreak {

	public static void main(String[] args) {
		int a[] = { 90, 34, 78, 12, 56 };
		int ins, cmp, temp;

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
	}
}