package recursivecall;

public class RecursiveCall {
	
	/*
	 * 재귀 호출은 반복 작업을 구현하기에 시간 복잡도에 직접적인 영향을 줌
	 * 따라서 구현 시 얼마나 수행되는지 한 번 호출 시 어떤 작업을 하는지 잘 따져볼 것
	 * 
	 * 재귀 호출의 깊이(호출이 얼마나 연쇄적으로 일어나는지)는 10,000 이하로 유지(많아도 20,000 이하)
	 * 
	 */
	
	public static int factorial(int n) {
		if(n == 0) {
			return 1;
		} else {
			return n * factorial(n-1);
		}
	}
	
	public static void main(String[] args) {
		int ans;
		
		ans = factorial(5);
		System.out.printf("%d\n", ans);
	}
}
