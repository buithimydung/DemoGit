package Task1;

	public class MyArrayList<E> {
	    public static final int DEFAULT_CAPACITY = 10;
	    private E[] elements;
	    private int size;

	    public MyArrayList() {
	        this.elements = (E[]) new Object[DEFAULT_CAPACITY];
	    }

	    public MyArrayList(int capacity) {
	        this.elements = (E[]) new Object[capacity];
	    }

	    private void growSize() {
	        int newCapacity = elements.length * 2;
	        E[] newElements = (E[]) new Object[newCapacity];
	        for (int i = 0; i < size; i++) {
	            newElements[i] = elements[i];
	        }
	        elements = newElements;
	    }

	    public int size() {
	        return size;
	    }

	    public boolean isEmpty() {
	        return size == 0;
	    }

	    public E get(int i) throws IndexOutOfBoundsException {
	        if (i < 0 || i >= size) {
	            throw new IndexOutOfBoundsException("Index is out of bounds");
	        }
	        return elements[i];
	    }

	    public boolean add(E e) {
	        if (size == elements.length) {
	            growSize();
	        }
	        elements[size] = e;
	        size++;
	        return true;
	    }

	    public E remove(int i) throws IndexOutOfBoundsException {
	        if (i < 0 || i >= size) {
	            throw new IndexOutOfBoundsException("Index is out of bounds");
	        }
	        E removedElement = elements[i];
	        for (int j = i; j < size - 1; j++) {
	            elements[j] = elements[j + 1];
	        }
	        elements[size - 1] = null; // Set the last element to null
	        size--;
	        return removedElement;
	    }
	}
}