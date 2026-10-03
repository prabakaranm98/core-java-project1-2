package java_day7;

public class onearray_to_anotherarray {

	public static void main(String[] args) {
		int[] array1 = {10, 20, 30, 40, 50};
        int[] array2 = new int[array1.length];

        // Copy elements from array1 to array2
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }

        // Print the second array
        System.out.println("Copied Array:");

        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }


	}


