// Implements a singly-linked list.

import java.util.List;
import java.util.NoSuchElementException;

public class SinglyLinkedList<E> {
	private ListNode<E> head;
	private ListNode<E> tail;
	private int nodeCount;

	// Constructor: creates an empty list
	public SinglyLinkedList() {
		nodeCount = 0;
	}

	// Constructor: creates a list that contains
	// all elements from the array values, in the same order
	public SinglyLinkedList(Object[] values) {
		if (values == null) {
			throw new NullPointerException();
		}
		for (int i = 0; i < values.length; i++) {
			add((E) values[i]);
		}
	}
	
	public ListNode<E> getHead() {
		return head;
	}
	
	public ListNode<E> getTail() {
		return tail;
	}

	// Returns true if this list is empty; otherwise returns false.
	public boolean isEmpty() {
		if (nodeCount == 0) {
			return true;
		}
		return false;
	}

	// Returns the number of elements in this list.
	public int size() {
		return nodeCount;
	}

	// Returns true if this list contains an element equal to obj;
	// otherwise returns false.
	public boolean contains(E obj) {
		for (ListNode<E> i = getHead(); i != null ; i = i.getNext()) {
			if (i.getValue().equals(obj) == true) {
				return true;
			}
		}
		if (getTail().getValue().equals(obj) == true) {
			return true;
		}
		return false;
	}

	// Returns the index of the first element in equal to obj;
	// if not found, returns -1.
	public int indexOf(E obj) {
		int index = 0;
		for (ListNode<E> i = getHead(); i != null; i = i.getNext()) {
			if (i.getValue().equals(obj)) {
				return index;
			}
			index++;
		}
		return -1;
	}

	// Adds obj to this collection.  Returns true if successful;
	// otherwise returns false.
	public boolean add(E obj) {
		if (nodeCount == 0) {
			head = new ListNode<E>(obj);
			tail = head;
			nodeCount++;
			return true;
		}
		tail.setNext(new ListNode<E>(obj));
		tail = tail.getNext();
		nodeCount++;
		return true;
	}

	// Removes the first element that is equal to obj, if any.
	// Returns true if successful; otherwise returns false.
	public boolean remove(E obj) {
		if (nodeCount == 0) {
			throw new NoSuchElementException();
		}
		int index = indexOf(obj);
		if (indexOf(obj) == -1) {
			return false;
		}
		ListNode<E> temp = getHead();
		if (index == 0) {
			head = temp.getNext();
			return true;
		}
		for (int i = 0; i < index - 1; i++) {
			temp = temp.getNext();
		}
		temp.setNext(temp.getNext().getNext());
		nodeCount--;
		return true;
	}

	// Returns the i-th element.               
	public E get(int i) {
		if (i < 0 || i > size()) {
			throw new IndexOutOfBoundsException();
		}
		ListNode<E> output = head;
		for (int j = 0; j < i; j++) {
			output = output.getNext();
		}
		return output.getValue();
	}

	// Replaces the i-th element with obj and returns the old value.
	public E set(int i, Object obj) {
		if (i < 0 || i > size()) {
			throw new IndexOutOfBoundsException();
		}
		ListNode<E> temp = head;
		for (int j = 0; j < i; j++) {
			temp = head.getNext();
		}
		E output = temp.getValue();
		temp.setValue((E) obj);
		return output;
	}

	// Inserts obj to become the i-th element. Increments the size
	// of the list by one.
	public void add(int i, Object obj) {
		if (i < 0 || i > size()) {
			throw new IndexOutOfBoundsException();
		}
		ListNode<E> temp = new ListNode<E>((E) obj);
		ListNode<E> node = head;
		if (i == 0) {
			head = new ListNode<E>((E) obj, head);
			return;
		}
		for (int j = 0; j < i - 1; j++) {
			node = node.getNext();
		}
		temp.setNext(node.getNext());
		node.setNext(temp);
		nodeCount++;
	}

	// Removes the i-th element and returns its value.
	// Decrements the size of the list by one.
	public E remove(int i) {
		if (i < 0 || i >= size()) {
			throw new IndexOutOfBoundsException();
		}
		ListNode<E> temp = head;
		if (i == 1) {
			E output = head.getValue();
			head = temp.getNext();
			return output;
		}
		for (int j = 0; j < i - 1; j++) {
			temp = temp.getNext();
		}
		E output = temp.getNext().getValue();
		temp.setNext(temp.getNext().getNext());
		nodeCount--;
		return output;
	}

	// Returns a string representation of this list exactly like that for MyArrayList.
	public String toString() {
		if (nodeCount == 0) {
			return "[]";
		}
		StringBuilder output = new StringBuilder(nodeCount);
		output.append('[');
		for (int i = 0; i < nodeCount - 1; i++) {
			if (get(i) == null) {
				output.append("null, ");
			} else {
			output.append(get(i).toString() + ", ");
			}
		}
		if (getTail().getValue() == null) {
			output.append("null]");
		} else {
		output.append(getTail().getValue().toString() + "]");
		}
		return output.toString();
	}
	
}
