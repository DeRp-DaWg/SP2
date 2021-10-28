package Cars;

public class DieselCar extends Car {
    private boolean hasParticleFilter;
    private double kmPrL;
    private int[] taxTable = {15260,2770,1850,1390,130};

    public DieselCar(int regNr, String make, String model, int year, int amountOfDoors, boolean hasParticleFilter, double kmPrL) {
        super(regNr, make, model, year, amountOfDoors);
        this.hasParticleFilter = hasParticleFilter;
        this.kmPrL = kmPrL;
    }

    @Override
    public double calculateGreenVehicleTax() {
        double tax = 0;
        tax += findTax(kmPrL, defaultTaxTable);
        tax += findTax(kmPrL, taxTable);
        if (!hasParticleFilter) tax += 1000;
        return tax;
    }

    public boolean hasParticleFilter() {
        return hasParticleFilter;
    }

    public void setHasParticleFilter(boolean hasParticleFilter) {
        this.hasParticleFilter = hasParticleFilter;
    }

    public double getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(double kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "DieselCar{" +
                "regNr=" + regNr +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", amountOfDoors=" + amountOfDoors +
                ", particleFilter=" + hasParticleFilter +
                ", kmPrL=" + kmPrL +
                '}';
    }
}
