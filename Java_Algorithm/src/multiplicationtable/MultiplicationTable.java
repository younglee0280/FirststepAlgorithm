package multiplicationtable;

public class MultiplicationTable {

	public static void main(String[] args) {
		int step, num;

		for (step = 1; step <= 9; step++) {
			System.out.printf("%d단", step);
			for (num = 1; num <= 9; num++) {
				System.out.printf("\t%2d", step * num);
				/*
				 * %2d : 2자리보다 작으면 여백을 추가해서 2자리 확보 ex)_1 (_는 0x20, 스페이스, 여벡을 의미) 2자리보다 크면 그대로
				 * 출력됨 ex) "12345"
				 * 
				 * %02d : 2자리보다 작으면 '0'을 추가해서 2자리를 확보 ex) 01 2자리보다 크면 그대로 출력됩니다. ex) "12345"
				 * 
				 * %-2d : (왼쪽 정렬) 2자리보다 작으면 여백을 추가해서 2자리를 확보 ex) 1_ (_는 0x20, 스페이스, 여백을 의미)
				 * 2자리보다 크면 그대로 출력됩니다. ex) "12345"
				 *
				 * %+2d : 양수인 경우 '+'를 붙여줌
				 * 
				 */

			}
			System.out.printf("\n");
		}

	}

}
