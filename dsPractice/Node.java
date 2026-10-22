
public class Node {
	int value;
	Node next;
	Node prev;
	
	public Node() {}
	
	public Node(int value) {
		this.value = value;
		this.next = null;
		this.prev = null;
	}
	
	public String toString() {
		return "| Value: "+this.value+", Previous: "+this.prev+", Next: "+this.next;
	}
	
}
