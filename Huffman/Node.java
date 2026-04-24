
public class Node<E extends Comparable<E>> {

	private int frequency;
	private E value;
	private Node<E> left;
	private Node<E> right;
	private Node<E> parent;
	private int height;
	
	public Node(E value, int frequency) {
		this.frequency = frequency;
		this.value = value;
		this.left = null;
		this.right = null;
		this.parent = null;
		this.height = 0;
	}

	public Node(E value, int frequency, Node<E> parent, boolean goLeft) { 
		this.frequency = frequency;
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

	public E getValue() {
		return value;
	}

	public Node<E> getLeft() {
		return left;
	}

	public Node<E> getRight() {
		return right;
	}

	public Node<E> getParent() {
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

	public void setValue(E value) {
		this.value = value;
	}

	public void setLeft(Node<E> left) {
		this.left = left;
		//YOU CODE: Update height
	}

	public void setRight(Node<E> right) {
		this.right = right;
		//YOU CODE: Update height
	}

	public void setParent(Node<E> parent) {
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
		return "Value: " + value.toString() + " | Frequency: " + frequency;
	}
	
}

