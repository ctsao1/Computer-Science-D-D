public class MyStack<E> {

    private ListNode<E> top;
    
    public MyStack() {
        this.top = null;
    }

    public boolean push(E value) {
        if (top == null) {
            top.setValue(value);
        } else {
            ListNode<E> temp = new ListNode<E>(value);
            temp.setNext(top);
            top = temp;
        }
        return true;
    }

    public boolean pop() {
        top = top.getNext();
        return true;
    }

    public E peek() {
        return top.getValue();
    }

    public boolean empty() {
        return top == null;
    }
    
}
