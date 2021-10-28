import Cars.*;
import java.util.ArrayList;

public class Garage {
    private ArrayList<Car> Cars = new ArrayList<>();
    private String name;

    public Garage(String name) {
        this.name = name;
    }

    public void addCars(Car... car) {
        for (Car b : car) {
            Cars.add(b);
        }
    }

    public String getName() {
        return name;
    }

    public double calculateGreenVehicleTax() {
        double tax = 0;
        for (Car car : Cars) {
            tax += car.calculateGreenVehicleTax();
        }
        return tax;
    }

    @Override
    public String toString() {
        String str = name + ": ";
        for (Car car : Cars) {
            str += "\n" + car.toString();
        }
        return str;
    }
}
