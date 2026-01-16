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
		BinaryNode<E> node = root;
		while ((value.compareTo(node.getValue()) < 0 && node.hasLeft() == true) || (value.compareTo(node.getValue()) > 0 && node.hasRight() == true)) {
			if (value.compareTo(node.getValue()) < 0) {
				node = node.getLeft();
			} else {
				node = node.getRight();
			}
		}
		if (root.getValue().equals(value)) {
			return true;
		}
		return false;
	}

	// Adds value to this BST, unless this tree already holds value.
	// Returns true if value has been added; otherwise returns false.
	public boolean add(E value) {
		if (root == null) {
			root = new BinaryNode<E>(value);
			return true;
		}
		if (contains(value)) {
			return false;
		}
		BinaryNode<E> temp = root;
		boolean goLeft = false;
		while ((value.compareTo(temp.getValue()) < 0 && temp.hasLeft() == true) || value.compareTo(temp.getValue()) > 0 && temp.hasRight() == true) {
			if (value.compareTo(temp.getValue()) < 0) {
				temp = temp.getLeft();
				goLeft = true;
			} else {
				temp = temp.getRight();
			}
		}
		if (value.compareTo(temp.getValue()) < 0) {
			goLeft = true;
		} else {
			goLeft = false;
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
		while (temp.hasLeft() == true) {
			temp = temp.getLeft();
		}
		return temp.getValue();
	}
	
	// Returns the maximum in the tree.
	public E max() {
		BinaryNode<E> temp = getRoot();
		while (temp.hasRight() == true) {
			temp = temp.getRight();
		}
		return temp.getValue();
	}

	private String list(BinaryNode<E> temp) {
		String spaces = ", ";
		StringBuilder str = new StringBuilder();
		if (temp.hasLeft() == false) {
			str.append(temp.getValue() + spaces);
			if (temp.hasRight() == true) {
				str.append(list(temp.getRight()));
			}
			return str.toString();
		}

		str.append(list(temp.getLeft()));
		str.append(temp.getValue().toString() + spaces);
		if (temp.hasRight() == true) {
			str.append(list(temp.getRight()));
		}

		return str.toString();
	}

	// Returns a bracket-surrounded, comma separated list of the contents of the nodes, in order
	// e.g. [Apple, Cranberry, Durian, Mango]
	public String toString() {
		if (root == null) {
			return "[]";
		}

		StringBuilder str = new StringBuilder();

		str.append("[" + list(root));
		str.delete(str.length() - 2, str.length() + 1);
		str.append("]");

		return str.toString();
	}


}
