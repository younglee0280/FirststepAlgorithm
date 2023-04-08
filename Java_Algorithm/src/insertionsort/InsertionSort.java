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

		// 정렬 전 배열 내용 표시
		System.out.printf("정렬 전 배열\n");
		printArray(a);
		System.out.printf("\n");

		for (ins = 1; ins < 5; ins++) { // 외부 루프 카운터
			temp = a[ins];
			for (cmp = ins - 1; cmp >= 0; cmp--) { // 내부 루프 카운터
				if (a[cmp] > temp) { // 내림차순은 a[cmp] > temp
					a[cmp + 1] = a[cmp]; // 조건 만족시 a[cmp] 값 하나 뒤로 이동, 삽입 위치 비움
				} else {
					break; // 불만족시 종료
				}

			}
			a[cmp + 1] = temp; // 삽입 위치에 temp 값 저장

			// 정렬 후 배열 내용 표시
			System.out.printf("정렬 후 배열\n");
			printArray(a);
		}

	}

}
