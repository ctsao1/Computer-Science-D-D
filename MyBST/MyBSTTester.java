public class MyBSTTester {
    public static void main(String[] args) {
        MyBST<String> bst = new MyBST<String>();
        // System.out.println(bst.toString());
        bst.add("d");
        // System.out.println(bst.toString());
        bst.add("b");
        bst.add("f");
        bst.add("c");
        bst.add("e");
        bst.add("g");
        bst.add("a");
        System.out.println(bst.toString());
        System.out.println(bst.remove("g"));
        System.out.println(bst.min());
        System.out.println(bst.max());
        System.out.println(bst.toString());
        System.out.println(bst.contains("z"));
    }
}
