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
			System.out.printf("\n������ ������ = ");
			data = scn.nextInt();
			
			if (data < 0){
				break;
			}
			
			hashValue = hashFunc(data);
			
			hashTable[hashValue] = data;
		} while(true);
		
		do {
			System.out.printf("\nŽ���� ������ = ");
			data = scn.nextInt();
			
			if (data < 0) {
				break;
			}
			
			hashValue = hashFunc(data);
			
			if(hashTable[hashValue] == data) {
				System.out.printf("%d��°���� �߰ߵǾ����ϴ�.\n", hashValue);
			}else {
				System.out.printf("ã�� �� �����ϴ�.\n");
			}
		} while(true);
		scn.close();
	}
}
