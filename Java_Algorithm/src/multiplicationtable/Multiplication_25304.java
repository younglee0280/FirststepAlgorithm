package multiplicationtable;

import java.util.Scanner;

public class Multiplication_25304 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer totalMoney = scanner.nextInt();
        Integer totalCount = scanner.nextInt();

        int res = 0;
        for (int i = 0; i < totalCount; i++) {
            Integer money = scanner.nextInt();
            Integer count = scanner.nextInt();

            res += (money * count);
        }

        if (res == totalMoney) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
