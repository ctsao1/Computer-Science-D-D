public class RecursionTester {
    public static void main(String[] args) {
        ListNode first = new ListNode("1", new ListNode("2", new ListNode("3")));
        Recursion.printListInReverse(first);
        System.out.println();
    }
}
