package boat_raft_ship;

/**
 * Created by Dmitriy on 30.01.2016.
 */
public class Test {
    public static void main(String[] args) {

        Boat boat[] = { new Raft(15, "My Raft", "Square"), new Ship(55.15, "My Ship", "Oval")};

        for( Boat boats : boat){
        boats.outputVehicleInfo();
        }

    }
}
