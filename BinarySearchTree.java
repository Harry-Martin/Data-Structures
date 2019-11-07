package dataStructures;

public class BinarySearchTree<T extends Comparable<T>> {

	public BinaryNode<T> root;
	
	public void addNode(T data) {
		BinaryNode<T> newNode = new BinaryNode<T>(data);
		if(root == null) {
			root = newNode;
		}else {
			root.add(newNode);
		}
	}
	
	public BinaryNode<T> getRoot(){
		return root;
	}
	
	public int getHeight() {
		return root == null ? 0 : root.getHeight();
	}
	
}

