package java_day7;

public class largest_element_array_day7 {

	public static void main(String[] args) {
		int[] numbers = {10, 25, 45, 12, 60, 30};

        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Largest element = " + largest);
    }
}