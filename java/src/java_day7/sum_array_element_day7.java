package java_day7;

public class sum_array_element_day7 {

	public static void main(String[] args) {
		int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        System.out.println("Sum of array elements = " + sum);
    }

	}


