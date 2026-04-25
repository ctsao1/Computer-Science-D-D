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
            parent.setParent(n2);
        } else {
            parent.setLeft(n2);
            parent.setParent(n1);
        }
        parent.setFrequency(n1.getFrequency() + n2.getFrequency());
		return parent;
	}

}
