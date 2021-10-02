package _02_IntroToQueues;

import java.util.ArrayDeque;
import java.util.Random;
import java.util.Stack;

/* 
 * OBJECTIVE:
 * 1. Push 100 double values onto a Stack.
 * 2. Pop off as many values from the Stack to fill a Queue with 5 values.
 * 3. Randomly remove between 1 and 5 values from the Queue and print them to
 *    the console.
 * 4. Repeat steps 2 and 3 until there are no values left in either the Stack
 *    or Queue.
 * 
 * Example:
 * stack: { ..., 60, 36, 88, 4, 65, 75, 10 }
 * queue: { } // empty
 * 
 * Pop off 5 elements from stack to fill queue with 5 elements
 * stack: { ..., 60, 36 }
 * queue: { 10, 75, 65, 4, 88 }
 * 
 * Remove a random number of values from the front of the queue
 * (2 in this example) and print the number of values being removed
 * and the values themselves
 * stack: { ..., 60, 36 }
 * queue: { 65, 4, 88 }
 * "Removing 2 elements: 10 75"
 * 
 * Pop off 2 elements from the stack to fill the queue to 5
 * stack: { ... }
 * queue: { 65, 4, 88, 36, 60 }
 * 
 * Repeat until there are no more elements in the stack and queue
 */

public class _01_IntroToQueue {
	public static void main(String[] args) {

		// 1. Create a Stack of Doubles using the Stack class
		// Note: you have to use the capitalized Double and not double
		Stack<Double> stack = new Stack<Double>();

		// 2. Use a loop to add 100 random doubles between 0 and 100 to the Stack
		double min = 0;
		double max = 100;
		for (int i = 0; i < 100; i++) {
			Random rand = new Random();
			double randomValue = min + (max - min) * rand.nextDouble();
			stack.add(randomValue);
		}
		// 3. Create a Queue of Doubles using the ArrayDeque class
		// Note: you have to use the capitalized Double and not double
		ArrayDeque<Double> myQueue = new ArrayDeque<Double>();
		// 4. Pop off 5 elements from the Stack and add them to the Queue
		double pop1 = stack.pop();
		double pop2 = stack.pop();
		double pop3 = stack.pop();
		double pop4 = stack.pop();
		double pop5 = stack.pop();
		myQueue.add(pop1);
		myQueue.add(pop2);
		myQueue.add(pop3);
		myQueue.add(pop4);
		myQueue.add(pop5);
		// 5. Print and remove a random number of elements, from 1 to 5 elements,
		// from the front of the Queue. Example:
		// "removing 3 elements from Queue: 25 57 2"
		Double val;
		Double val2;
		Double val3;
		Double val4;
		Double val5;
		Random rand = new Random();
		int num = rand.nextInt(5);
		if (num == 1) {
			val = myQueue.remove();
			System.out.println("removing " + num + " element from the Queue:" + val);
		} else if (num == 2) {
			val = myQueue.remove();
			val2 = myQueue.remove();
			System.out.println("removing " + num + " elements from the Queue:" + val + ", " + val2);
		} else if (num == 3) {
			val = myQueue.remove();
			val2 = myQueue.remove();
			val3 = myQueue.remove();
			System.out.println("removing " + num + " elements from the Queue:" + val + ", " + val2 + ", " + val3);
		} else if (num == 4) {
			val = myQueue.remove();
			val2 = myQueue.remove();
			val3 = myQueue.remove();
			val4 = myQueue.remove();
			System.out.println(
					"removing " + num + " elements from the Queue:" + val + ", " + val2 + ", " + val3 + ", " + val4);
		} else {
			val = myQueue.remove();
			val2 = myQueue.remove();
			val3 = myQueue.remove();
			val4 = myQueue.remove();
			val5 = myQueue.remove();
			System.out.println("removing 5 elements from the Queue: " + val + ", " + val2 + ", " + val3 + ", " + val4
					+ ",	 " + val5);
		}

		// 6. Pop off as many elements from the stack to fill the Queue with 5
		// elements. If there aren't enough elements in the Stack to fill the
		// queue, fill the queue as much as possible.

		if (myQueue.size() == 1) {
			double s1 = stack.pop();
			double s2 = stack.pop();
			double s3 = stack.pop();
			double s4 = stack.pop();
			myQueue.add(s1);
			myQueue.add(s2);
			myQueue.add(s3);
			myQueue.add(s4);
			myQueue.add(s4);
		} else if (myQueue.size() == 2) {
			double s1 = stack.pop();
			double s2 = stack.pop();
			double s3 = stack.pop();
			myQueue.add(s1);
			myQueue.add(s2);
			myQueue.add(s3);

		}else if (myQueue.size() == 3) {
			double s1 = stack.pop();
			double s2 = stack.pop();
			myQueue.add(s1);
			myQueue.add(s2);
		}else if (myQueue.size() == 4) {
			double s1 = stack.pop();
			myQueue.add(s1);
		}
		System.out.println("The queue now has "+myQueue.size()+ " elements");
		// 7. Loop until there are no more elements in either the Stack or Queue
		// and all the elements are printed
	while( ! myQueue.isEmpty() ) {
        System.out.println("Removing: "+myQueue.remove());
    }
	}
}
    
	


