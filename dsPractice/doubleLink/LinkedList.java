package doubleLink;

public class LinkedList {

	Node head;
	Node tail;
	
	public LinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public LinkedList(Node head) {
		this.head = head;
		this.tail = head;
	}
	

	public void append(int value) {
		Node newNode = new Node(value);
		if(this.head == null) {
			this.head = newNode;
			this.tail =newNode;
		}
		else {
			this.tail.next = newNode;
			newNode.prev = this.tail;
			this.tail = newNode;
		}
	}

	public Node search(int value) {
		boolean found = false;
		Node curNode = this.head;
		while(!found && curNode != null) {
			if(curNode.value == value) {
				found = true;
			}
			else{
				curNode = curNode.next;
				if(curNode == null || curNode == this.head){
					return null;
				}
			}
		}
		return curNode;
	}
	
	public Node searchTail(int value) {
		boolean found = false;
		Node curNode = this.tail;
		while(!found && curNode != null) {
			if(curNode.value == value) {
				found = true;
			}
			else{
				curNode = curNode.prev;
				if(curNode == null || curNode == this.tail){
					return null;
				}
			}
		}
		return curNode;
	}
	
	
	
	public Node delete(int value) {
		Node delNode = searchTail(value);
		
		if(delNode == this.head){
			this.head = delNode.next;
			this.head.prev = delNode.prev;
		}
		else if(delNode == this.tail) {
			this.tail = delNode.prev;
			this.tail.next = delNode.next;
		}
		
		if(delNode.prev != null) {
			delNode.prev.next = delNode.next;
		}
		delNode.next = null;
		delNode.prev = null;
		return delNode;
	}
	
	public void show() {
		Node curNode = this.head;
		while(curNode != null) {
			System.out.println(curNode);
			curNode = curNode.next;
			if(curNode == null || curNode == this.head){
				break;
			}
		}	
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.append(10);
		list.append(20);
		list.append(30);
		//list.search(30).next = list.search(10);
		
		
		list.show();
		

		System.out.println("Deleting " + list.delete(10).value);
		list.show();

	}
}
