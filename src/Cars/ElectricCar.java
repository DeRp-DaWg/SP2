package Cars;

public class ElectricCar extends Car {
    private int batteryCapacityKWh;
    private int maxKm;
    private double whPrKm;

    public ElectricCar(int regNr, String make, String model, int year, int amountOfDoors, int batteryCapacityKWh, int maxKm, double whPrKm) {
        super(regNr, make, model, year, amountOfDoors);
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    @Override
    public double calculateGreenVehicleTax() {
        double tax = 0;
        double kmPrL = 100 / (whPrKm / 91.25);
        tax += findTax(kmPrL, defaultTaxTable);
        return tax;
    }

    public int getBatteryCapacityKWh() {
        return batteryCapacityKWh;
    }

    public void setBatteryCapacityKWh(int batteryCapacityKWh) {
        this.batteryCapacityKWh = batteryCapacityKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public double getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(double whPrKm) {
        this.whPrKm = whPrKm;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "regNr=" + regNr +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", amountOfDoors=" + amountOfDoors +
                ", batteryCapacityKWh=" + batteryCapacityKWh +
                ", maxKm=" + maxKm +
                ", whPrKm=" + whPrKm +
                '}';
    }
}
