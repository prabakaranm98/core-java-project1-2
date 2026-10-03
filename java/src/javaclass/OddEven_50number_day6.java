package javaclass;

public class OddEven_50number_day6 {

	public static void main(String[] args) {
		int evenCount = 0;
		int oddCount = 0;
		
		for (int i = 1; i <= 50; i++) {
			
			if (i % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
             
		System.out.println("Even numbers count = " + evenCount);
		System.out.println("Odd numbers count = " + oddCount);
	}

}
