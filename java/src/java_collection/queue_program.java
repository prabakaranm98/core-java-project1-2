package java_collection;

import java.util.LinkedList;
import java.util.Queue;

public class queue_program {

	public static void main(String[] args) {
		
		 // Create Queue
        Queue<String> students = new LinkedList<>();

        // Add elements
        students.add("Prabakaran");
        students.add("Arun");
        students.add("Kumar");
        students.add("Ravi");

        // Display queue
        System.out.println("Queue: " + students);

        // View first element
        System.out.println("First Student: " + students.peek());

        // Remove first element
        System.out.println("Removed Student: " + students.poll());

        // Display queue after removal
        System.out.println("Queue after removal: " + students);

        // Check whether queue is empty
        System.out.println("Is Queue Empty? " + students.isEmpty());
    }
}