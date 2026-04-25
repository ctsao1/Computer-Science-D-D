
public class Node implements Comparable {

	private int frequency;
	private char value;
	private Node left;
	private Node right;
	private Node parent;
	private int height;
	
	public Node(char value) {
		this.frequency = 1;
		this.value = value;
		this.left = null;
		this.right = null;
		this.parent = null;
		this.height = 0;
	}

	public Node(char value, Node parent, boolean goLeft) { 
		this.frequency = 1;
		this.value = value;
		this.left = null;
		this.right = null;
		this.parent = parent;
		if (parent == null) {
			this.height = 0;
		} else {
			this.height = parent.getHeight() + 1;
		}
		if (goLeft) {
			parent.setLeft(this);
		} else {
			parent.setRight(this);
		}
	}

	public int getFrequency() {
		return frequency;
	}

	public char getValue() {
		return value;
	}

	public Node getLeft() {
		return left;
	}

	public Node getRight() {
		return right;
	}

	public Node getParent() {
		return parent;
	}

	public int getHeight() {
		if (this.getParent() == null) {
			return 0;
		}
		height = this.getParent().getHeight() + 1;
		return height;
	}
	
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public void plusFrequency() {
		this.frequency++;
	}

	public void setValue(char value) {
		this.value = value;
	}

	public void setLeft(Node left) {
		this.left = left;
		//YOU CODE: Update height
	}

	public void setRight(Node right) {
		this.right = right;
		//YOU CODE: Update height
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public boolean hasLeft() {
		return left != null;
	}
	
	public boolean hasRight() {
		return right != null;
	}
	
	public boolean isLeaf() {
		return !hasLeft() && !hasRight();
	}

	public String toString() {
		return "Value: " + value + " | Frequency: " + frequency;
	}

	// public int compareTo(Node other) {
	// 	if (this.getFrequency() < other.getFrequency()) {
	// 		return -1;
	// 	} if (this.getFrequency() > other.getFrequency()) {
	// 		return 1;
	// 	}
	// 	return 0;
	// }

	@Override
	public int compareTo(Object o) {
		if (this.getFrequency() < ((Node) o).getFrequency()) {
			return -1;
		} if (this.getFrequency() > ((Node) o).getFrequency()) {
			return 1;
		}
		return 0;
	}
	
}

