package hashtablesearch;

import java.util.Scanner;

public class HashTableSearchSyn {

		public static int[] hashTable = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

		public static int hashFunc(int data) {
			return data % 10;
		}
		
		public static void main(String[] args) {
			int data, hashValue;
			int pos;
			
			Scanner scn = new Scanner(System.in);
			do {
				System.out.printf("\n저장할 데이터 = ");
				data = scn.nextInt();
				
				if(data < 0) {
					break;
				}
				
				hashValue = hashFunc(data);
				
				pos = hashValue;
				while (hashTable[pos] != -1) {
					pos++;
				if(pos <= hashTable.length) {
					pos = 0;
				}
				
				if(pos == hashValue) {
					break;
				}
			}
				if(hashTable[pos] == -1) {
					hashTable[pos] = data;
				}else {
					System.out.printf("해시 테이블이 가득 찼습니다\n");
				}
			}while(true);
	}

}
