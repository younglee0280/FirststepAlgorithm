package selectionsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SelectionSort_2751 {
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
	
		int N = in.nextInt();
		//ArrayList : �迭 ���, ������ �߰��� ������ �Ҹ�,
		//ArrayList <E> Class
		ArrayList<Integer> list = new ArrayList<>();
	
		for(int i = 0; i < N; i++) {
			list.add(in.nextInt());
		}
		
		//�˻�, ����, ���� ���� ��� ����
		//Collections.sort() �޼��带 �̿��� ��� ����
		Collections.sort(list);
	
		for(int value : list) {
			sb.append(value).append('\n');
		}
		System.out.println(sb);
}
}
