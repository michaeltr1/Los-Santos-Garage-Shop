import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class VehicleFileManager {
    //Arraylist to find vehicles
    public ArrayList<Vehicles> loadVehicles(String fileName) {
        ArrayList<Vehicles> vehicles = new ArrayList<>();
        //Reading CSV FILES
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            reader.readLine();                                    // skip the header line
            String line;
            while ((line = reader.readLine()) != null) {
                String[] c = line.split("\\|");

                String vin = c[0];
                int year = Integer.parseInt(c[1]);
                String make = c[2];
                String model = c[3];
                String type = c[4];
                String color = c[5];
                int odometer = Integer.parseInt(c[6]);
                double price = Double.parseDouble(c[7]);

                vehicles.add(new Vehicles(vin, year, make, model, type, color, odometer, price));
            }

            reader.close();
            // catch runs only when read fails
        } catch (IOException ex) {
            System.out.println("Could not load inventory: " + ex.getMessage());
        }

        return vehicles;
    }
}