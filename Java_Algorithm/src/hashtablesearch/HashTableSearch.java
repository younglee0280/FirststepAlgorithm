package hashtablesearch;

import java.util.Scanner;

public class HashTableSearch {

	public static int[] hashTable = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	public static int hashFunc(int data) {
		return data % 10;
	}

	public static void main(String[] args) {
		int data, hashValue;
		Scanner scn = new Scanner(System.in);
		do {
			System.out.printf("\n저장할 데이터 = ");
			data = scn.nextInt();
			
			if (data < 0){
				break;
			}
			
			hashValue = hashFunc(data);
			
			hashTable[hashValue] = data;
		} while(true);
		
		do {
			System.out.printf("\n탐색할 데이터 = ");
			data = scn.nextInt();
			
			if (data < 0) {
				break;
			}
			
			hashValue = hashFunc(data);
			
			if(hashTable[hashValue] == data) {
				System.out.printf("%d번째에서 발견되었습니다.\n", hashValue);
			}else {
				System.out.printf("찾을 수 없습니다.\n");
			}
		} while(true);
		scn.close();
	}
}
