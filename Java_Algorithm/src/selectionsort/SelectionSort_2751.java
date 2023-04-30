package selectionsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SelectionSort_2751 {
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
	
		int N = in.nextInt();
		//ArrayList : 배열 기반, 데이터 추가와 삭제에 불리,
		//ArrayList <E> Class
		ArrayList<Integer> arrList = new ArrayList<>();

		for(int i = 0; i < N; i++) {
			arrList.add(in.nextInt());
		}
		
		//검색, 정렬, 셔플 등의 기능 제공
		//Collections.sort() 메서드를 이용한 요소 정렬
		Collections.sort(arrList);
	
		for(int value : arrList) {
			sb.append(value).append('\n');
		}
		System.out.println(sb);
}
}
