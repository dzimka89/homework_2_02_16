package boat_raft_ship;

/**
 * Created by Dmitriy on 30.01.2016.
 */
abstract public class Boat {

    private double currentSpeed;
    private String vehicleName;
    private String boatShape;


    private int minSpeed = 0;
    private String areasOfUsage = " Water surface";

    public int getMinSpeed() {
        return minSpeed;
    }

    public String getAreasOfUsage() {
        return areasOfUsage;
    }

    abstract void outputVehicleInfo();

    public double getVehicleSpeed() {
        return currentSpeed;
    }

    public String getVehicleName(){
        return vehicleName;
    }

    public String getBoatShape(){
        return boatShape;
    }

    public Boat(double currentSpeed, String vehicleName, String boatShape) {
        this.currentSpeed = currentSpeed;
        this.vehicleName = vehicleName;
        this.boatShape = boatShape;
    }
}
