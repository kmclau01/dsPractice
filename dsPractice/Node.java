
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
		String show = "Value: "+this.value+", Previous: ";
		if(this.prev != null)
			show = show + this.prev.value;
		else
			show = show + "null";
		
		show = show +", Next: ";
		if(this.next!=null)
			show = show + this.next.value;
		else
			show = show + "null";
		
		
		return show;
	}
	
}
