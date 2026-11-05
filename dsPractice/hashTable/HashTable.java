package hashTable;

public class HashTable {
	Node[] table;
	int capacity;
	int size;
	
	public HashTable(int capacity) {
		table = new Node[capacity];
		this.capacity = capacity;
		this.size = 0;
	}
	
	public int hashkey(String key) {
		//always modulo by capacity so index is never bigger than capacity
		//This is technically a TERRIBLE hash function
		char[] list = key.toCharArray();
		String hash = "";
		int index = 0;
		for(int i = 0; i < list.length; i++) {
			index = list[i];
			hash = hash + Integer.toString(index);
			
		}
		//System.out.println("Hashkey: "+hash);
		for(int i = hash.length(); i < 0; i--) {
			index = index + (hash.charAt(i)-48)*10^i;
		}
		index = (index * 457) % this.capacity;
		//System.out.println("Final Key: "+index);
		return index;
	}
	
	public void put(String key, String value) {
		int hashkey = hashkey(key);
		Node node = new Node(key,value);
		this.table[hashkey] = node;
		size++;
	}
	
	public String get(String key) {
		String str = null;
		int hashkey = hashkey(key);
		if(this.table[hashkey]!=null) {
			str = this.table[hashkey].value;
		}
		return str;
	}
	
	public void show() {
		int index;
		System.out.printf("Load Factor: %3.2f\n...............\n", (float)this.size/this.capacity);
		for(index=0;index<this.capacity;index++) {
			if(this.table[index]!=null) {
				System.out.printf("[%d]: Key: %s, Value: %s\n",index,this.table[index].key,this.table[index].value);
			}
			else {
				System.out.printf("[%d]: Null\n",index);
			}
		}
	}
	
	
}
