package ferry;

import java.util.ArrayList;

public class Ferry {
    // Attributes of the ferry
    private String regNumber; // Registration number
    private String name; // Name of the ferry
    private String harbourName; // Name of the harbor
    private double pricePerAxle; // Price per axle
    private double pricePerTon; // Price per ton
    private double maxWeight; // Maximum allowed weight
    private ArrayList<Lorry> boardedLorries; // List of lorries boarded

    // Constructors
    // Default constructor with default values
    public Ferry(){
        this.regNumber = "347346AGSA";
        this.name = "Transatlantico uwefeuefes";
        this.harbourName = "Buenasss";	
        this.pricePerAxle = 12.30;
        this.pricePerTon = 200.00;
        this.maxWeight = 50000.00;
        this.boardedLorries = new ArrayList<Lorry>();
    }

    // Constructor with registration number as parameter
    public Ferry(String regNumber) {
        this.regNumber = regNumber;
        this.boardedLorries = new ArrayList<Lorry>();
    }

    // Constructor with all attributes as parameters
    public Ferry(String regNumber, String name, String harbourName, double pricePerAxle, double pricePerTon, double maxWeight) {
        this.regNumber = regNumber;
        this.name = name;
        this.harbourName = harbourName;
        this.pricePerAxle = pricePerAxle;
        this.pricePerTon = pricePerTon;
        this.maxWeight = maxWeight;
        this.boardedLorries = new ArrayList<Lorry>();
    }

    // Methods
    // Method to calculate total weight of lorries boarded
   /* 
    * 
    * For-each
    * public double totalWeight() {
        double totalWeight = 0;
        for (Lorry lorry : this.boardedLorries) {
            totalWeight += lorry.getWeight();
        }
        return totalWeight;
    }
    */
    public double totalWeight() {
        double totalWeight = 0;
        for (int i = 0; i < boardedLorries.size(); i++) {
            Lorry lorry = boardedLorries.get(i);
            totalWeight += lorry.getWeight();
        }
        return totalWeight;
    }


    // Method to check if a lorry is boarded on the ferry
    public boolean isBoarded(Lorry lorry) {
        return this.boardedLorries.contains(lorry);
    }

    // Method to check if a lorry can board the ferry
    public boolean canBoard(Lorry lorry) {
        if (totalWeight() + lorry.getWeight() <= maxWeight && lorry.getnAxles() <= 12) {
            return true;
        } else {
            return false;
        }
    }

    // Method to board a lorry onto the ferry
    public boolean board(Lorry lorry) {
        if (canBoard(lorry)) {
            this.boardedLorries.add(lorry);
            return true;
        } else {
            return false;
        }
    }

    // Method to get the lorry at a specific position
    public Lorry lorryInPosition(int n) {
        if (n >= 0 && n < boardedLorries.size()) {
            return boardedLorries.get(n);
        } else {
            return null;
        }
    }
    public double tollPrice(Lorry lorry) {
        double toll = 0.0;
        if (canBoard(lorry)) {
            toll = lorry.getnAxles() * pricePerAxle + (lorry.getWeight() / 1000) * pricePerTon;
        }
        return toll;
    }

    public double collectedTolls() {
        double totalTolls = 0.0;
        for (Lorry lorry : boardedLorries) {
            totalTolls += tollPrice(lorry);
        }
        return totalTolls;
    }
    @Override
    public boolean equals(Object obj) {
        // Checking if the other object is null or not of the same class
        if (this == obj)
            return true;
        if (obj == null || this.getClass() != obj.getClass())
            return false;
        Ferry otherFerry = (Ferry) obj;

        return regNumber == (otherFerry.regNumber);
    }
    public int hashCode() {
	    final int prime = 12;
	    int result = 1;
	    result = prime * result +  boardedLorries.size();
	    return result;
    }
}
