import Cars.*;

public class Main {

    public static void main(String[] args) {
        Car gasolineCar = new GasolineCar(1,"BMW","Something",2021,4,95,16.3);
        Car dieselCar = new DieselCar(2,"Honda","Civic",2001,4,false,7.6);
        Car electricCar = new ElectricCar(3,"Tesla", "Model 3", 2016, 4, 76, 470, 162);
        Garage garage = new Garage("Parkeringsplads");
        garage.addCars(gasolineCar,dieselCar,electricCar);
        System.out.println(garage);
        System.out.println("Grøn ejerafgift for alle biler i "+garage.getName()+": "+garage.calculateGreenVehicleTax()+"kr.");
    }
}
