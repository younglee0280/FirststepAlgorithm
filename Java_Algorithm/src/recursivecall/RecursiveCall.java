package recursivecall;

public class RecursiveCall {
	
	/*
	 * 
	 * 재귀 호출의 깊이(호출이 얼마나 연쇄적으로 일어나는지)는 10,000 이하로 유지(많아도 20,000 이하)
	 * 
	 */
	
	public static int factorial(int n) {
		if(n == 0) {
			return 1;
		} else {
			return n * factorial(n-1);
			//int retVal = n * factorial(n-1);
		}
	}
	
	public static void main(String[] args) {
		int ans;
		ans = factorial(5);
		System.out.printf("%d\n", ans);
	}
}
