package ferry;

import java.util.Scanner;

public class FerryTUI {
    private static Ferry ferry = new Ferry(); // Create a default ferry
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\nFerry Management System");
            System.out.println("1. Board a lorry");
            System.out.println("2. Calculate total collected tolls");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    boardLorry();
                    break;
                case 2:
                    calculateTotalTolls();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        } while (choice != 3);
    }

    private static void boardLorry() {
        System.out.print("Enter lorry registration number: ");
        String regNumber = scanner.next();
        System.out.print("Enter lorry weight (in kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter number of axles: ");
        int nAxles = scanner.nextInt();

        Lorry lorry = new Lorry(regNumber, weight, nAxles);
        if (ferry.board(lorry)) {
            System.out.println("Lorry boarded successfully.");
        } else {
            System.out.println("Cannot board lorry. Exceeds weight limit or axle limit.");
        }
    }

    private static void calculateTotalTolls() {
        double totalTolls = ferry.collectedTolls();
        System.out.println("Total collected tolls: $" + totalTolls);
    }
}
