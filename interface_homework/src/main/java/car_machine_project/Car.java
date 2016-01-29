package car_machine_project;


abstract public class Car implements Machine {

    private static final double maxSpeed = 325;
    private static final double minSpeed = 0;
    private static final int maxPassengersNumber = 6;
    private static final int minPassengersNumber = 1;
    private double currentSpeed;
    private String vehicleName;

    public Car(String vehicleName, double vehicleSpeed){
        this.vehicleName = vehicleName;
        this.currentSpeed = vehicleSpeed;
    }

    public void printVehicleName(){
        System.out.println("Current car name is " + vehicleName);
    }


    //
    public double getCurrentSpeed(){
        return currentSpeed;
    }
}
