public class MyBSTTester {
    public static void main(String[] args) {
        MyBST<Integer> bst = new MyBST<Integer>();
        // System.out.println(bst.toString());
        bst.add(3);
        // System.out.println(bst.toString());
        bst.add(1);
        bst.add(5);
        bst.add(2);
        bst.add(4);
        bst.add(10);
        bst.add(0);
        System.out.println(bst.min());
        System.out.println(bst.max());
        System.out.println(bst.toString());
    }
}
