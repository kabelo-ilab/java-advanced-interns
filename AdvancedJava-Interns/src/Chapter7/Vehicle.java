package Chapter7;

public class Vehicle {
    //class / instance variables
    private String color;
    private String model;
    private int year;
    private String registrationNumber;
    private double mileage;
    private String transmissionType;

    /**
     * Constructor with default values
     */
    public Vehicle(){
        this.color = "White";
        this.transmissionType = "Manual";
        this.mileage = 0;
        this.year = 2000;
        this.registrationNumber = "None";
        this.model = "None";
    }

    /**
     * Overloaded constructor with initial values
     * @param theReg Vehicle's registration number
     * @param theModel Model of the vehicle
     * @param theYear Manufacture's year
     * @param theTransmission Transmission Type
     * @param theMileage Vehicle Mileage
     * @param theColor The color of the vehicle
     */
    public Vehicle(String theReg, String theModel, int theYear,
                   String theTransmission, double theMileage,String theColor)
    {
        this.registrationNumber = theReg;
        this.model = theModel;
        this.year = theYear;
        this.transmissionType = theTransmission;
        this.mileage = theMileage;
        this.color = theColor;

    }

    /**
     * Method to display vehicle details
     */
    public void display(){
        System.out.println("Reg#: " + registrationNumber);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Transmission: " + transmissionType);
        System.out.println("Mileage: " + mileage);
    }

}
