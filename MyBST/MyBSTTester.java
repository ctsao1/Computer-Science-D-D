public class MyBSTTester {
    public static void main(String[] args) {
        MyBST<Integer> bst = new MyBST<Integer>();
        // System.out.println(bst.toString());
        bst.add(1);
        for (int i = 2; i <= 10; i++) {
            bst.add(i);
        }
        BinaryNode<Integer> node = bst.getRoot();
        while (node.hasRight()) {
            node = node.getRight();
        }
        System.out.println(bst.toString());
        System.out.println(bst.min());
        System.out.println(bst.max());
        System.out.println(bst.remove(9));
        System.out.println(bst.toString());
        System.out.println(node.getHeight());

    }
}
