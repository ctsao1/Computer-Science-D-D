public class MyStackTester {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<Integer>();
        System.out.println(stack.empty());
        stack.push(1);
        System.out.println(stack.empty());
        System.out.println(stack.peek());
        stack.push(2);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
    }
}
