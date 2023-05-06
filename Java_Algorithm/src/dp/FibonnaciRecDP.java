package dp;

public class FibonnaciRecDP {
	
	public static int[] fibonacciNumbers = new int[100];
	

	public static void initFibonacciNumbers() {
		for (int i = 0; i < fibonacciNumbers.length; i++) {
			fibonacciNumbers[i] = -1;
		}
	}
	public static int fibonacci(int n) {
		System.out.printf("fibonacci(%d)°¡ È£Ãâ");
	
		if(fibonacciNumbers[n] == -1) {
			if(n==0) {
				fibonacciNumbers[n] = 0;
			}
			else if(n == 1) {
				fibonacciNumbers[n] = 1;
			}
			else {
				fibonacciNumbers[n] = fibonacci(n-1) + fibonacci(n-2);
			}
		}
		return fibonacciNumbers[n];
	}
	
	public static void main(String[] args) {

	}

}
