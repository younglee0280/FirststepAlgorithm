package recursivecall;

public class RecursiveCall {
	
	/*
	 * 재귀 호출은 반복 작업을 구현하는 것이기 때문에 시간 복잡도에 직접적인 영향
	 * 재귀 호출 구현 시 얼마나 수행되는지, 한 번 호출 시 어떤 작업을 하는지 잘 따져볼 것
	 * 
	 * 재귀 호출의 깊이(재귀 호출이 얼마나 연쇄적으로 일어나는지)는 10,000 이하로 유지(많아도 20,000 이하)
	 * 	호출된 메서드에서 사용할 변수들은 메모리에 추가 할당되고, 더이상 참조하지 않을 때 자동으로 메모리에서 할당이 해제
	 * 	중간에 종료되지 않는다면 변수들이 메모리를 모두 할당, StackOverflowError 발생
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
