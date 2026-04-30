public class BST {
    private Node root;  // holds the root of this BST

	// Constructor: creates an empty BST.
	public BST() {
		root = null;
	}

	public Node getRoot() {
		return root;
	}

    public void setRoot(Node n) {
        root = n;
    }

    public Node add(Node n1, Node n2) {
		Node parent = new Node('\0');
        if (n1.compareTo(n2) < 0) {
            parent.setLeft(n1);
            parent.setRight(n2);
        } else {
            parent.setLeft(n2);
            parent.setRight(n1);
        }
        n1.setParent(parent);
        n2.setParent(parent);
        parent.setFrequency(n1.getFrequency() + n2.getFrequency());
		return parent;
	}

}
