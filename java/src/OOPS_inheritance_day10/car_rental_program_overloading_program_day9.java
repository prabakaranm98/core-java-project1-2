package OOPS_inheritance_day10;

class CarRental {

    // 1. Hour basis
    void calculateRent(int hours) {
        double hourlyRate = 500;
        double totalAmount = hours * hourlyRate;

        System.out.println("Rental Basis  : Hour Basis");
        System.out.println("Hours Needed  : " + hours);
        System.out.println("Hourly Rate   : Rs." + hourlyRate);
        System.out.println("Total Amount  : Rs." + totalAmount);
        System.out.println("-----------------------------");
    }

    // 2. Day basis - without driver
    void calculateRent(int days, boolean withDriver) {
        double dailyRate = 2500;
        double driverCharge = 1000;

        double totalAmount;

        if (withDriver) {
            totalAmount = days * (dailyRate + driverCharge);

            System.out.println("Rental Basis  : Day Basis");
            System.out.println("Days Needed   : " + days);
            System.out.println("Driver        : With Driver");
            System.out.println("Daily Rate    : Rs." + dailyRate);
            System.out.println("Driver Charge : Rs." + driverCharge + " per day");
            System.out.println("Total Amount  : Rs." + totalAmount);
        } else {
            totalAmount = days * dailyRate;

            System.out.println("Rental Basis  : Day Basis");
            System.out.println("Days Needed   : " + days);
            System.out.println("Driver        : Without Driver");
            System.out.println("Daily Rate    : Rs." + dailyRate);
            System.out.println("Total Amount  : Rs." + totalAmount);
        }

        System.out.println("-----------------------------");
    }
}

//Main class
public class car_rental_program_overloading_program_day9 {

	public static void main(String[] args) {
		
		CarRental car = new CarRental();

        // 1. Rent based on hours
        car.calculateRent(5);

        // 2. Rent based on days with driver
        car.calculateRent(3, true);

        // 3. Rent based on days without driver
        car.calculateRent(3, false);
    }
}
