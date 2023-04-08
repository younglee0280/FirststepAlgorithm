package sequentialsearch;

import java.util.Scanner;

public class SequentialSearch_02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] a = {72, 68, 92, 88, 41, 53, 97, 84, 39, 55};
		int x, pos, i;
		
		System.out.print("x = ");
		x = scn.nextInt();
		pos = -1;
		System.out.printf("반복 실행 전: x = %d, pos = %d\n", x, pos);
//		System.out.printf("반복 실행 전: pos = %d\n", pos);
		
		for(i=0; i < a.length && pos == -1; i++) {  // 원래 i<10 && pos == -1, 이렇게도 쓸 수 있지 않을까. i < a.length -1 && pos == -1 or 
			if(a[i] == x) {
				pos = i;
			}
			System.out.printf("반복 실행 중: pos = %d, i = %d\n", pos, i);
		}
		
		System.out.printf("pos = %d\n", pos);
		System.out.printf("반복 실행 후: pos = %d, i = %d\n", pos, i);
	}

}
