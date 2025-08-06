package ch10.exercises.ch10_e10;

public class TestQueueOfIntegers {

	public static void main(String[] args) {
		QueueOfIntegers queue = new QueueOfIntegers();

		for (int i = 1; i <= 20; i++)
			queue.enqueue(i);

		System.out.println(queue.getSize());
		
		while (!queue.empty()) {
			System.out.print(queue.dequeue() + " ");
		}

		System.out.println("\n" + queue.empty());
	}
}
