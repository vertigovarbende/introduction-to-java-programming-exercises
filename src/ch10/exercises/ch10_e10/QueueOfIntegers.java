package ch10.exercises.ch10_e10;

public class QueueOfIntegers {

	// The private instance variables
	private int[] elements;
	private int size;

	// The private static final variable
	public static final int DEFAULT_CAPACITY = 8;

	// Constructors

	// No-arg/default constructor
	// +QueueOfIntegers()
	public QueueOfIntegers() {
		this(DEFAULT_CAPACITY);
	}

	// Smart constructor
	// +QueueOfIntegers(capacity: int)
	public QueueOfIntegers(int capacity) {
		elements = new int[capacity];
	}

	// +enqueue(value: int): void
	// this method adds specified value into the queue
	public void enqueue(int value) {
		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}

		elements[size++] = value;
	}

	// +dequeue(): int
	// this method removes and returns the element from the queue
	public int dequeue() {
		int removedValue = elements[0];
		int[] temp = new int[elements.length - 1];
		System.arraycopy(elements, 1, temp, 0, elements.length - 1);
		elements = temp;
		--size;
		return removedValue;
	}

	// +empty(): boolean
	// this method returns true if the queue is empty
	public boolean empty() {
		return size == 0;
	}

	// +getSize(): int
	// this method returns the size of the queue
	public int getSize() {
		return size;
	}
	
	public int[] getElements() {
		return elements;
	}
}
