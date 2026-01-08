// Implements a BST with BinaryNode nodes

public class MyBST<E extends Comparable<E>> {
	
	private BinaryNode<E> root;  // holds the root of this BST

	// Constructor: creates an empty BST.
	public MyBST() {
		root = null;
	}

	public BinaryNode<E> getRoot() {
		return root;
	}
	
	public int getHeight() {
		return root.getHeight();
	}

	// Returns true if this BST contains value; otherwise returns false.
	public boolean contains(E value) {
		return false;
	}

	// Adds value to this BST, unless this tree already holds value.
	// Returns true if value has been added; otherwise returns false.
	public boolean add(E value) {
		if (contains(value)) {
			return false;
		}
		if (root == null) {
			root = new BinaryNode<E>(value);
			return true;
		}
		BinaryNode<E> temp = root;
		boolean goLeft = false;
		while ((value.compareTo(temp.getValue()) < 0 && temp.getLeft() != null) || value.compareTo(temp.getValue()) > 0 && temp.getRight() != null) {
			if (value.compareTo(temp.getValue()) < 0) {
				temp = temp.getLeft();
				goLeft = true;
			} else {
				temp = temp.getRight();
			}
		}
		new BinaryNode<>(value, temp, goLeft);
		return true;
	}

	// Removes value from this BST.  Returns true if value has been
	// found and removed; otherwise returns false.
	// If removing a node with two children: replace it with the
	//  largest node in the right subtree
	public boolean remove(E value) {

		return false;
	}
	
	// Returns the minimum in the tree
	public E min() {
		BinaryNode<E> temp = getRoot();
		temp = getLeftMost(temp);
		return temp.getValue();
	}
	
	// Returns the maximum in the tree.
	public E max() {
		BinaryNode<E> temp = getRoot();
		while (temp.getRight() != null) {
			temp = temp.getRight();
		}
		return temp.getValue();
	}

	public BinaryNode<E> getLeftMost(BinaryNode<E> node) {
		while (node.getLeft() != null) {
			node = node.getLeft();
		}
		return node;
	}

	// Returns a bracket-surrounded, comma separated list of the contents of the nodes, in order
	// e.g. [Apple, Cranberry, Durian, Mango]
	public String toString() {
		if (root == null) {
			return "[]";
		}
		StringBuilder str = new StringBuilder("[");
		BinaryNode<E> temp = root;
		temp = getLeftMost(temp);
		str.append(temp.getValue() + ", ");

		while (temp.getValue() != max()) {
			temp = temp.getParent();
			str.append(temp.getValue() + ", ");
			if (temp.getRight() != null) {
				temp = temp.getRight();
				temp = getLeftMost(temp);
				str.append(temp.getValue() + ", ");
			}
		}
		if (root.getRight() != null) {
			str.append(max());
		} else {
			str.delete(str.length() - 2, str.length());
		}
		str.append("]");
		return str.toString();
	}


}
