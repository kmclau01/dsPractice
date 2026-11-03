package hashTable;

public class Driver {

	public static void main(String[] args) {
		HashTable table = new HashTable(20);
		table.put("FirstName", "Joe");
		table.put("Email", "Joe@mail");
		table.put("Address", "Joe Street");
		table.show();
	}
}
