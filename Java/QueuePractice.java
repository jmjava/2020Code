// Java program for array implementation of queue 

// A class to represent a queue 
class QueuePractice {

	/*

	public Queue(int capacity) {

	}

	// Queue is full when size becomes equal to
	// the capacity
	boolean isFull(Queue queue) {
		return true;
	}

	// Queue is empty when size is 0
	boolean isEmpty(Queue queue) {
		return true;

	}

	// Method to add an item to the queue.
	// It changes rear and size
	void enqueue(int item) {
		
	}

	// Method to remove an item from queue.
	// It changes front and size
	int dequeue() {
		
	}

	// Method to get front of queue
	int front() {
	
	}

	// Method to get rear of queue
	int rear() {
	
	}

	*/
}

// Driver class
class PracticeTest {
	public static void main(String[] args) {
		Queue queue = new Queue(1000);

		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);

		System.out.println(queue.dequeue() + " dequeued from queue\n");

		System.out.println("Front item is " + queue.front());

		System.out.println("Rear item is " + queue.rear());
	}
}

// This code is contributed by Gaurav Miglani
