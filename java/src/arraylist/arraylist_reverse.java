package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist_reverse {

	public static void main(String[] args) {
		
		
		 // Create ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add numbers
        numbers.add(10);
        numbers.add(25);
        numbers.add(5);
        numbers.add(40);
        numbers.add(15);

        // Display original list
        System.out.println("Original List: " + numbers);

        // Find maximum number
        int max = Collections.max(numbers);
        System.out.println("Maximum Number: " + max);

        // Reverse the list
        Collections.reverse(numbers);
        System.out.println("Reversed List: " + numbers);
    }
}