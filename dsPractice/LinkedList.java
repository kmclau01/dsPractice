
public class LinkedList {

	Node head;
	Node tail;
	
	public LinkedList() {
		this.head=null;
		this.tail = null;
	}
	
	public LinkedList(Node head) {
		this.head = head;
		this.tail = head;
	}
	
	public void appendOld(int value) {
		Node newNode = new Node(value);
		Node curNode = this.head;
		if(this.head == null)
			this.head = newNode;
		else {
			while(curNode.next != null) {
				curNode = curNode.next;
			}
			curNode.next = newNode;
			this.tail = curNode;
		}
	}
	
	public void append(int value) {
		Node newNode = new Node(value);
		if(this.head == null) {
			this.head = newNode;
			this.tail =newNode;
		}
		else {
			this.tail.next = newNode;
			this.tail = newNode;
		}
	}
	
	public Node linSearch(int value) {
		boolean found = false;
		Node curNode = this.head;
		while(curNode.next != null) {
			if(curNode.value == value) {
				found = true;
				break;
			}
			else
				curNode = curNode.next;
		}
		if(found)
			return curNode;
		else
			return null;
	}
	
	public Node prevlinSearch(Node node) {
		boolean found = false;
		Node curNode = this.head;
		while(curNode.next != null) {
			if(curNode.next == node) {
				found = true;
				break;
			}
			else
				curNode = curNode.next;
		}
		if(found)
			return curNode;
		else
			return null;
	}
	
	public Node delete(int value) {
		Node delNode = linSearch(value);
		Node prevNode = prevlinSearch(delNode);
		
		prevNode.next = delNode.next;
		delNode.next = null;
		return delNode;
	}
	
	public void show() {
		Node curNode = this.head;
		while(curNode != null) {
			System.out.printf("Value: %d - Next: %h\n",curNode.value,curNode.next);
			curNode = curNode.next;
		}	
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.append(10);
		list.append(20);
		list.append(30);
		
		list.show();
	}
}
