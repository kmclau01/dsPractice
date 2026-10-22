
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
	
/*
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
*/
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
/*	
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
	
	public Node deleteOLD(int value) {
		Node delNode = linSearch(value);
		Node prevNode = prevlinSearch(delNode);
		
		prevNode.next = delNode.next;
		delNode.next = null;
		return delNode;
	}
*/	

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
	
	public Node prevSearch(Node node) {
		boolean found = false;
		Node curNode = this.head;
		while(!found && curNode != null) {
			if(curNode.next == node) {
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
	
	public Node delete(int value) {
		Node delNode = search(value);
		Node prevNode = prevSearch(delNode);
		
		if(delNode == this.head){
			this.head = delNode.next;
		}
		else if(delNode == this.tail) {
			this.tail = prevNode;
		}
		
		if(prevNode != null) {
			prevNode.next = delNode.next;
		}
		delNode.next = null;
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
