public class MyBSTTester {
    public static void main(String[] args) {
        MyBST<Integer> bst = new MyBST<Integer>();
        // System.out.println(bst.toString());
        bst.add(1);
        // System.out.println(bst.toString());
        bst.add(2);
        bst.add(0);
        bst.add(3);
        System.out.println(bst.min());
        System.out.println(bst.max());
        System.out.println(bst.toString());
    }
}
