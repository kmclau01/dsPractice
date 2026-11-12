package trees;

public class Driver {

	public static void main(String[] args) {
		BinTree tree = new BinTree();
		tree.insert(25);
		tree.insert(10);
		tree.insert(17);
		tree.insert(30);
		tree.insert(5);
		tree.insert(18);
		tree.inOrderTrav();
	}
}
