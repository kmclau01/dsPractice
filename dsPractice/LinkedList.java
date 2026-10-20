
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
	
	public void append(int value) {
		Node newNode = new Node(value);
		Node curNode = this.head;
		if(this.head==null)
			this.head = newNode;
		else {
			while(curNode.next != null) {
				curNode = curNode.next;
			}
			curNode.next = newNode;
		}
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
