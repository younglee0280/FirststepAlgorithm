//package mergesort;
//
//public class mergesort_24060 {
//
//	// int A [];
//	// int p, r;
////	static int[] tmp;
//
//	public static void merge_sort(int A[], int p, int r) {
//		if (p < r) {
//			int q = (p + r);
//			merge_sort(A, p, q); // 전반부 정렬
//			merge_sort(A, q + 1, r); // 후반부 정렬
//			merge(A, p, q, r);
//		}
//	}
//
//	// 병합
//	public static void merge(int A[], int p, int q, int r) {
//		int tmp[] = new tmp [];
//		int i =  p;
//		int j = q + 1;
//		int t = 0;
//		
//		while(i <= q && j <= r) {
//			if (A[i] <= A[j])
//				tmp[t++] = A[i++];
//			else 
//				tmp[t++] = A[j++];
//		}
//		
//		while(i <= q) { // 왼쪽 배열 부분이 남았을 때
//			tmp[t] = A[i];
//			t++;
//			i++;
//		}
//		
//		while(j<= r) {
//			tmp[t++] = A[j++];
//		}
//		
//		i = p;
//		t = 0;
//		int cnt = 0;
//		int k;
//		int result = -1;
//		while(i <= r) {
//			cnt = cnt + 1;
//			
//			if(cnt == k) {
//				result = tmp[t];
//				break;
//			}
//			
//			A[i++] = tmp[t++];
//		}
//		
//	}
//	
//}
