// Implements a singly-linked list.

import java.util.NoSuchElementException;

public class SinglyLinkedList<E> {
	private ListNode<E> head;
	private ListNode<E> tail;
	private int nodeCount;

	// Constructor: creates an empty list
	public SinglyLinkedList() {
		head.setValue(null);
		tail = head;
		nodeCount = 0;
	}

	// Constructor: creates a list that contains
	// all elements from the array values, in the same order
	public SinglyLinkedList(Object[] values) {
		for (int i = 0; i < values.length; i++) {
			add((E) values[i]);
			nodeCount++;
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
		for (ListNode<E> i = head; i.getNext() != null ; i = i.getNext()) {
			if (i.getValue().equals(obj) == true) {
				return true;
			}
		}
		return false;
	}

	// Returns the index of the first element in equal to obj;
	// if not found, returns -1.
	public int indexOf(E obj) {
		boolean found = false;
		int index = 0;
		ListNode<E> i = head;
		while (found == false) {
			if (i.getValue().equals(obj) == true) {
				found = true;
				return index;
			}
			i = i.getNext();
		}
		return -1;
	}

	// Adds obj to this collection.  Returns true if successful;
	// otherwise returns false.
	public boolean add(E obj) {
		ListNode<E> temp = tail;
		tail = new ListNode<E>(obj, null);
		temp.setNext(tail);
		nodeCount++;
		return false;
	}

	// Removes the first element that is equal to obj, if any.
	// Returns true if successful; otherwise returns false.
	public boolean remove(E obj) {
		if (nodeCount == 0) {
			throw new NoSuchElementException();
		}
		head = head.getNext();
		return true;
	}

	// Returns the i-th element.               
	public E get(int i) {

	}

	// Replaces the i-th element with obj and returns the old value.
	public E set(int i, Object obj) {

	}

	// Inserts obj to become the i-th element. Increments the size
	// of the list by one.
	public void add(int i, Object obj) {

	}

	// Removes the i-th element and returns its value.
	// Decrements the size of the list by one.
	public E remove(int i) {
		
	}

	// Returns a string representation of this list exactly like that for MyArrayList.
	public String toString() {


	}
	

}
