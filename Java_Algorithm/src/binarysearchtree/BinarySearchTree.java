package binarysearchtree;

class BST {
	public int data;
	public int left;
	public int right;
}

public class BinarySearchTree {

	public static BST[] tree = new BST[10];

	public static int rootIdx = 0;
	
	public static int newIdx = 0;
	
	public static void addBST(int data) {
		int currentIdx;
		boolean addFlag;
	
		tree[newIdx].data = data;
		tree[newIdx].left = -1;
		tree[newIdx].right = -1;
		
		if(newIdx != rootIdx) {
			currentIdx = rootIdx;
			addFlag = false;
			do {
				if(data < tree[currentIdx].data) {
					if(tree[currentIdx].left == -1) {
						tree[currentIdx].left = newIdx;
						addFlag = true;
					}
					else {
						currentIdx = tree[currentIdx].left;
					}
				}
				else {
					if(tree[currentIdx].right == -1) {
						tree[currentIdx].right = newIdx;
						addFlag = true;
					}
					
				}
			}while (addFlag == false);
			
		}
	}
}
