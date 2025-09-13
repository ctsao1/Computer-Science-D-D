/* See ArrayList documentation here:
 * http://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html
 */

/*
 * Your indexed functions should throw IndexOutOfBoundsException if index is invalid!
 */

public class MyArrayList<E> {
	// instance variables
	/* Internal Object counter */
	protected int objectCount;

	/* Internal Object array */
	protected E [] internalArray;

	// constructors
	/* Constructor: Create it with whatever capacity you want? */
	@SuppressWarnings("unchecked")
	public MyArrayList() {
		this.internalArray = (E[])new Object[100];
	}

	/* Constructor with initial capacity */
	@SuppressWarnings("unchecked")
	public MyArrayList(int initialCapacity){
		this.internalArray = (E[])new Object[initialCapacity];
	}

	// methods
	/* Return the number of active slots in the array list 
	 * Change code
	*/
	public int size() {
		return objectCount;
	}

	/* Are there zero objects in the array list? */
	public boolean isEmpty() {
		if (objectCount == 0) {
			return true;
		}
		return false;
	}

	/* Get the index-th object in the list. */
	public E get(int index) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException("Your index was not within the index of the array");
		}
		return internalArray[index];
	}

	/* Replace the object at index with obj.  returns object that was replaced. */
	public E set(int index, E obj) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException("Your index was not within the index of the array");
		}
		E output = internalArray[index];
		internalArray[index] = obj;
		return output;
	}

	/* Returns true if this list contains an element equal to obj;
	 otherwise returns false. 
	 BigO (n)
	  */
	public boolean contains(E obj) {
		for (int i = 0; i < internalArray.length; i++) {
			if (internalArray[i].equals(obj) == true) {
				return true;
			}
		}
		return false;
		/* ---- YOUR CODE HERE ---- */
	}

	public E [] expandArray(E [] oldArray) {
		E [] newArray;
		newArray = (E[]) new Object[oldArray.length * 2];
		for (int i = 0; i < oldArray.length; i++) {
			newArray[i] = oldArray[i];
		}
		return newArray;
	}
	
	/* Insert an object at index */
	@SuppressWarnings("unchecked")
	public void add(int index, E obj) {


	}

	/* Add an object to the end of the list; returns true */
	@SuppressWarnings("unchecked")
	public boolean add(E obj) {
		int emptySpot = size() + 1;
		if (size() == internalArray.length - 1) {
			expandArray(internalArray);
		}
		internalArray[emptySpot] = obj;
		return true;
		/* ---- YOUR CODE HERE ---- */
	}

	/* Remove the object at index and shift.  Returns removed object. */
	public E remove(int index) {
		/* ---- YOUR CODE HERE ---- */
	}

	/* Removes the first occurrence of the specified element from this list, 
	 * if it is present. If the list does not contain the element, it is unchanged. 
	 * More formally, removes the element with the lowest index i such that
	 * (o==null ? get(i)==null : o.equals(get(i))) (if such an element exists). 
	 * Returns true if this list contained the specified element (or equivalently, 
	 * if this list changed as a result of the call). */
	public boolean remove(E obj) {

	}


	/* For testing; your string should output as "[X, X, X, X, ...]" where X, X, X, X, ... are the elements in the ArrayList.
	 * If the array is empty, it should return "[]".  If there is one element, "[X]", etc.
	 * Elements are separated by a comma and a space. */
	public String toString() {
		/* ---- YOUR CODE HERE ---- */
	}

}