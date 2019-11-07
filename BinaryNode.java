package dataStructures;

/***
 * 
 * @author harry
 *
 * @param <T>
 * 
 * Implementation of a BST node
 */

public class BinaryNode<T extends Comparable<T>> {

	BinaryNode<T> left, right;
	T data;
	
	public BinaryNode(T data) {
		this.data = data;
	}
	
	public void add(BinaryNode<T> newNode) {
		if(newNode.data.compareTo(data) < 0) {	// new node < this node
			if(left != null) {
				left.add(newNode);
			}else {
				left = newNode;
			}
		}else { 								// new node >= this node	
			if(right != null) {
				right.add(newNode);
			}else {
				right = newNode;
			}
		}
	}
	
	public int getHeight() {
		int lh = 0, rh = 0;
		if(left == null && right == null) {
			return 1;
		}else {
			if(left != null) {
				lh = left.getHeight();
			}
			if(right != null) {
				rh = right.getHeight();
			}
			return rh > lh ? 1 + rh: 1 + lh;
		}
		
	}
	public T getData() {
		return data;
	}
	
	public BinaryNode<T> getLeft(){
		return left;
	}
	
	public BinaryNode<T> getRight(){
		return right;
	}
	
}
