package tree;

public class Node {
	int key;
	Node prev;
	Node left;
	Node right;
	
	public Node(int key) {
		this.key=key;
		this.prev = null;
		this.left=null;
		this.right=null;
	}
	
	public void show() {
		System.out.printf("Ref: %s, key: %d , Previous: %s, Left: %s,  Right: %s\n",this.toString(),this.key,this.prev,this.left,this.right);
	}
}
