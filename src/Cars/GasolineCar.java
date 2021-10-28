package Cars;

public class GasolineCar extends Car {
    private int octaneRating;
    private double kmPrL;

    public GasolineCar(int regNr, String make, String model, int year, int amountOfDoors, int octaneRating, double kmPrL) {
        super(regNr, make, model, year, amountOfDoors);
        this.octaneRating = octaneRating;
        this.kmPrL = kmPrL;
    }

    @Override
    public double calculateGreenVehicleTax() {
        double tax = 0;
        tax += findTax(kmPrL, defaultTaxTable);
        return tax;
    }

    public int getOctaneRating() {
        return octaneRating;
    }

    public void setOctaneRating(int octaneRating) {
        this.octaneRating = octaneRating;
    }

    public double getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(double kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "GasolineCar{" +
                "regNr=" + regNr +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", amountOfDoors=" + amountOfDoors +
                ", octaneRating=" + octaneRating +
                ", kmPrL=" + kmPrL +
                '}';
    }
}
