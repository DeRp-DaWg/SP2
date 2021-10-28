package Cars;

public abstract class Car {
    protected int regNr;
    protected String make;
    protected String model;
    protected int year;
    protected int amountOfDoors;
    protected final static int[] defaultTaxTable = {10470,5500,2340,1050,330};

    public Car(int regNr, String make, String model, int year, int amountOfDoors) {
        this.regNr = regNr;
        this.make = make;
        this.model = model;
        this.year = year;
        this.amountOfDoors = amountOfDoors;
    }

    protected static double findTax(double kmPrL, int[] taxTable) {
        double tax = 0;
        if (kmPrL < 5) tax += taxTable[0];
        else if (kmPrL >= 5 && kmPrL < 10) tax += taxTable[1];
        else if (kmPrL >= 10 && kmPrL < 15) tax += taxTable[2];
        else if (kmPrL >= 15 && kmPrL < 20) tax += taxTable[3];
        else if (kmPrL >= 20 && kmPrL <= 50) tax += taxTable[4];
        return tax;
    }

    public abstract double calculateGreenVehicleTax();

    public int getRegNr() {
        return regNr;
    }

    public void setRegNr(int regNr) {
        this.regNr = regNr;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAmountOfDoors() {
        return amountOfDoors;
    }

    public void setAmountOfDoors(int amountOfDoors) {
        this.amountOfDoors = amountOfDoors;
    }
}
