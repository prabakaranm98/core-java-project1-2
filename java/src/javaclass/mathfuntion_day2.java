package javaclass;

public class mathfuntion_day2 {

	public static void main(String[] args) {
		
		double num = -12.75;

        // 1.abs() - Converts negative to positive
        double absolute = Math.abs(num);

        // 2.floor() - Rounds downward
        double floorValue = Math.floor(num);

        // 3.ceil() - Rounds upward
        double ceilValue = Math.ceil(num);

        // 4.round() - Rounds to nearest integer
        long roundValue = Math.round(num);

        // 5.Type casting double to int explicit type casting
        int intValue = (int) num;

        System.out.println("Original value  : " + num);
        System.out.println("Absolute value  : " + absolute);
        System.out.println("Floor value     : " + floorValue);
        System.out.println("Ceil value      : " + ceilValue);
        System.out.println("Round value     : " + roundValue);
        System.out.println("Type cast to int: " + intValue);

	}

}
