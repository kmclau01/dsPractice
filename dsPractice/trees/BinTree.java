package trees;

public class BinTree {

	Node root;
	
	public BinTree() {
		this.root=null;
	}
	
	public void insert(int key) {
		this.root = insert(this.root, key);
	}
	
	private Node insert(Node current, int key) {
		Node newNode;
		
		//Base Case
		if(current == null) {
			newNode = new Node(key);
			return newNode;
		}
		
		if(key < current.key) {
			current.left = insert(current.left, key);
		}
		if(key > current.key) {
			current.right = insert(current.right, key);
		}
		
		return current;
	}
	
	public void inOrderTrav() {
		inOrderTrav(this.root);
		System.out.println();
	}
	
	private void inOrderTrav(Node node) {
		if(node != null) {
			inOrderTrav(node.left);
			System.out.printf(" d% ", node.key);
			inOrderTrav(node.right);
		}
	}
	
}
