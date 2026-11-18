import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        VehicleFileManager manager = new VehicleFileManager();
        ArrayList<Vehicles> vehicles = manager.loadVehicles("src/data/inventory.csv");

        for (Vehicles v : vehicles) {
            System.out.println(v);
        }
    }
}



