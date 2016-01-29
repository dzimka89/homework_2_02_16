package boat_raft_ship;

/**
 * Created by Dmitriy on 30.01.2016.
 */
public class Raft extends Boat {

    public Raft(double currentSpeed, String vehicleName, String boatShape) {
        super(currentSpeed, vehicleName, boatShape);
    }

    @Override
    void outputVehicleInfo() {
        System.out.println("Raft info:\n" + getVehicleName() + "\nSpeed: " + getVehicleSpeed() + "\nVehicle shape: " + getBoatShape() + "\nArea of usage: " + getAreasOfUsage() + "\n");
    }

}
