package tree;

public class BinarySearchTree {
	Node root;
	
	public BinarySearchTree() {
		this.root=null;
	}
	
	//****** INSERT ***************************
	public void insert(int key) {
		this.root = insert(root,key);
	}

	private Node insert(Node current, int key) {
		if(current==null) {
			current = new Node(key);
			return current;
		}
		if(key<current.key) {
			current.left = insert(current.left,key);
			current.left.prev = current;
		}else {
			if(key > current.key) {
				current.right = insert(current.right,key);
				current.right.prev = current;
			}
		}
		return current;
	}
	
	//****** SEARCH ***************************
	public Node search(int key) {
		Node node = search(this.root,key);
		return node;
	}
	
	private Node search(Node current, int key){
		
		if(current.key == key) {
			return current;
		}
		else if(key < current.key) {
			if(current.left != null) {
			return search(current.left, key);
			}
		}
		else {
			if( current.right != null) {
			return search(current.right, key);
			}
		}
		
		return null;
	}
	
	//****** DELETE ***************************
	public void delete(int key) {
		this.root = delete(this.root,key);
	}
	
	private Node delete(Node current, int key){
		
		
		if(current.key == key) {
			if(current.right != null) {
				findMin(current.right).left = current.left;
				Node node = current.right;
				current.right = null;
				current.left = null;
				return node;
			}
			else {
				Node node = current.left;
				current.right = null;
				current.left = null;
				return node;
			}
			
			
			
			
		}
		else if(key < current.key) {
			if(current.left != null) {
				 Node node = delete(current.left, key);
				 if(current.left != node) {
					 current.left = node;
				 }
				 return current;
			
			}
		}
		else {
			if( current.right != null) {
				
				Node node = delete(current.right, key);
				if(current.right != node) {
					current.right = node;
				}
				return current;
			}
		}
		
		return null;
	}
	
	
	//****** Find Minimum Key Value ***************************
	public Node findMin(Node node) {
			while(node.left != null) {
				node = node.left;
			}
		
		return node;
	}
	
	//****** Height (Count in Nodes) ***************************
	public int height(Node root) {
    	return 0;
    }
    
    //****** Count Leaves ***************************
	public int countLeaves(Node root) {
		return 0;
	}
	
	//****** isValidBST ***************************
	public boolean isValidBST(Node root) {
		return false;
	}
	
	
	public void inOrderTraversal(Node root) {
		// Left-Root-Right
		if(root!=null) {
			inOrderTraversal(root.left);
			System.out.printf(" %d ", root.key);
			inOrderTraversal(root.right);
		}
	}
	
	public void preOrderTraversal(Node root) {
		// Root-Left-Right
		if(root!=null) {
			System.out.printf(" %d ", root.key);
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}
	
	public void postOrderTraversal(Node root) {
		// Left-Right-Root
		if(root!=null) {
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.printf(" %d ", root.key);
		}
	}
	
	

}