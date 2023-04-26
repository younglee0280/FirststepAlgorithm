package binarysearchtree;

public class printLogicalBST {
	public static void printLogicalBST(int currentIdx) {
		if(currentIdx != -1) {
			System.out.printf("tree[%d] : data = %d, left = %d, right = %d\n", currentIdx,
					tree[currentIdx].data, tree[currentIdx].left, tree[currentIdx].right);
			
			printLogicalBST(tree[currentIdx].left);
			printLogicalBST(tree[currentIdx].right);
		}
	}
	
	public static void main(String[] args) {
		for(int i = 0; i<tree.length; i++) {
			tree[i] = new BST();
		}
		addBST(4);
		addBST(6);
		addBST(5);
		addBST(2);
		addBST(3);
		addBST(7);
		addBST(1);
		
		
	}

}
