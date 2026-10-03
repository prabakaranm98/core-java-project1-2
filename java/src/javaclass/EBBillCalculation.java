package javaclass;
import java.util.Scanner;

class EBConsumer {

    String consumerName;
    String consumerId;
    String buildingType;

    double previousReading;
    double currentReading;
    double units;
    double billAmount;

    EBConsumer(String consumerName, String consumerId,
               String buildingType, double previousReading,
               double currentReading) {

        this.consumerName = consumerName;
        this.consumerId = consumerId;
        this.buildingType = buildingType;
        this.previousReading = previousReading;
        this.currentReading = currentReading;
    }

    void calculateBill() {

        // Calculate units consumed
        units = currentReading - previousReading;

        // HOUSE / RESIDENTIAL
        if (buildingType.equalsIgnoreCase("house")
                || buildingType.equalsIgnoreCase("residential")) {

            // Up to 100 units - Discount
            if (units <= 100) {

                billAmount = 0;

            }

            // More than 100 and up to 200
            else if (units <= 200) {

                billAmount = (units - 100) * 2.35;
            }

            // More than 200
            else {

                billAmount = (100 * 2.35)
                           + ((units - 200) * 4.70);
            }
        }

        // SHOP
        else if (buildingType.equalsIgnoreCase("shop")) {

            // No discount
            if (units <= 200) {

                billAmount = units * 2.35;

            }
            else {

                billAmount = (200 * 2.35)
                           + ((units - 200) * 4.70);
            }
        }

        else {

            System.out.println("Invalid building type!");
        }
    }

    void displayBill() {

        System.out.println("\n====================================");
        System.out.println("          ELECTRICITY BILL");
        System.out.println("====================================");

        System.out.println("Consumer Name    : " + consumerName);
        System.out.println("Consumer ID      : " + consumerId);
        System.out.println("Building Type    : " + buildingType);

        System.out.println("\n---------- READING DETAILS ----------");

        System.out.println("Previous Reading : " + previousReading);
        System.out.println("Current Reading  : " + currentReading);
        System.out.println("Units Consumed   : " + units);

        System.out.println("\n---------- BILL DETAILS ----------");

        System.out.println("Bill Amount      : ₹" + billAmount);

        System.out.println("====================================");
        System.out.println("TOTAL AMOUNT     : ₹" + billAmount);
        System.out.println("====================================");
    }
}


public class EBBillCalculation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("      EB BILL CALCULATION SYSTEM");
        System.out.println("====================================");

        System.out.print("Enter Consumer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Consumer ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Type of Building: ");
        String building = sc.nextLine();

        System.out.print("Enter Previous Reading: ");
        double previous = sc.nextDouble();

        System.out.print("Enter Current Reading: ");
        double current = sc.nextDouble();

        if (current < previous) {

            System.out.println(
                "Error: Current reading cannot be less than previous reading."
            );

        } else {

            EBConsumer consumer = new EBConsumer(
                    name,
                    id,
                    building,
                    previous,
                    current
            );

            consumer.calculateBill();
            consumer.displayBill();
        }

        sc.close();
    }
}