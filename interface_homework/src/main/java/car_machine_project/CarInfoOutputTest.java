package car_machine_project;

/**
 * Created by Dmitriy on 30.01.2016.
 */
public class CarInfoOutputTest extends Car{
    public CarInfoOutputTest(String vehicleName, double vehicleSpeed) {
        super(vehicleName, vehicleSpeed);
    }

    public static void main(String[] args) {
        CarInfoOutputTest carInfo = new CarInfoOutputTest("Mazda", 65);
        carInfo.printVehicleName();
        System.out.println("Car speed is " + carInfo.getCurrentSpeed() + "kmph");
    }

}
