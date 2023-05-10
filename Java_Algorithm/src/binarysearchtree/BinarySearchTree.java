package binarysearchtree;

class BST {
	public int data;
	public int left;
	public int right;
}

public class BinarySearchTree {

	public static BST[] tree = new BST[10];
	//루트 요소의 인덱스(head)
	public static int rootIdx = 0;
	//다음에 저장할 요소의 인덱스
	public static int newIdx = 0;

	//메서드 addBST는 파라미터 data에 지정된 요소를 이진 탐색 트리에 추가
	public static void addBST(int data) {
		int currentIdx;
		boolean addFlag; //확인 플래그

		tree[newIdx].data = data;
		tree[newIdx].left = -1;
		tree[newIdx].right = -1;
		
		//루트가 아닌 경우
		if (newIdx != rootIdx) {
			currentIdx = rootIdx;
			addFlag = false;
			do {
				if (data < tree[currentIdx].data) {
					if (tree[currentIdx].left == -1) {
						tree[currentIdx].left = newIdx;
						addFlag = true;
					} else {
						currentIdx = tree[currentIdx].left;
					}
				} else {
					if (tree[currentIdx].right == -1) {
						tree[currentIdx].right = newIdx;
						addFlag = true;
					} else {
						currentIdx = tree[currentIdx].right;
					}
				}
			} while (addFlag == false);
		}

		// 다음에 추가할 요소를 위해 물리적 위치 인덱스 1 늘리기
		newIdx++;
	}

	public static void printPhysicalBST() {
		int i;

		for (i = 0; i < newIdx; i++) {
			System.out.printf("tree[%d] : data = %d, left = %d, right = %d\n", 
					i, 
					tree[i].data, 
					tree[i].left,
					tree[i].right);
		}
	}
	
	 public static void printLogicalBST(int currentIdx) {
		 if(currentIdx != -1) {
			 System.out.printf("tree[%d] : data = %d, left = %d, right = %d\n",
					 currentIdx, 
					 tree[currentIdx].data, 
					 tree[currentIdx].left, 
					 tree[currentIdx].right);
			 
			 printLogicalBST(tree[currentIdx].left);
			 printLogicalBST(tree[currentIdx].right);
		 }
	 }

	public static void main(String[] args) {
		for (int i = 0; i < tree.length; i++) {
			tree[i] = new BST();
		}
		
		// 트리 구성
		addBST(4);
		addBST(6);
		addBST(5);
		addBST(2);
		addBST(3);
		addBST(7);
		addBST(1);

		printPhysicalBST();
		
		System.out.printf("==========================================\n");
		printLogicalBST(rootIdx);

	}
}
