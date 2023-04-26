package binarysearchtree;

public class printLogicalBST {
	public static void printLogicalBST(int currentIdx) {
		if(currentIdx != -1) {
			System.out.printf("tree[%d] : data = %d, left = %d, right = %d\n", currentIdx, tree[currentIdx].data,
					tree[currentIdx].left, tree[currentIdx].right);
		}
	}
	
	
	public static void main(String[] args) {

	}

}
