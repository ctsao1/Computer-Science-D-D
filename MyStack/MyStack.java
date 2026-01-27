import java.util.EmptyStackException;

public class MyStack<E> {

    private ListNode<E> top;
    
    public MyStack() {
        this.top = null;
    }

    public boolean push(E value) {
        if (top == null) {
            top = new ListNode<E>(value);
        } else {
            ListNode<E> temp = new ListNode<E>(value);
            temp.setNext(top);
            top = temp;
        }
        return true;
    }

    public E pop() {
        if (top == null) {
            throw new EmptyStackException();
        }
        E temp = top.getValue();
        top = top.getNext();
        return temp;
    }

    public E peek() {
        if (top == null) {
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    public boolean empty() {
        return top == null;
    }
    
}
