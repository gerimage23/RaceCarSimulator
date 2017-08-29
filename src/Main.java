import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Main {

    static boolean isRaining;
    private static ArrayList<Vehicle> vehicles;

    public static void main(String[] args) {

        createVehicles();
        simulateRace();
        printRaceResults();
    }

    //createVehicles()  creates 10 cars, 10 trucks and 10 motorcycles
    private static void createVehicles() {
        vehicles = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            vehicles.add(new Car());
            vehicles.add(new Truck());
            vehicles.add(new Motorcycle());
        }
    }

    private static void simulateRace() {
        for (int i = 0; i < 50; i++) {
            setRain();
            setCarSpeedLimit();
            for (Vehicle v : vehicles) {
                v.moveForAnHour();
            }
        }
    }

    private static void setRain() {
        //  30% chance
        Random rnd = new Random();
        isRaining = rnd.nextDouble() <= 0.3;
    }

    private static void setCarSpeedLimit() {
        Random rnd = new Random();

        //  30% chance
        if (rnd.nextDouble() <= 0.3)
            Car.setSpeedLimit(70);
        else
            Car.setSpeedLimit(0);
    }

    private static void printRaceResults() {
        System.out.println("RACE RESULTS");
        System.out.println("=========================================================================");
        vehicles.sort(Comparator.comparing(Vehicle::getDistanceTravelled));
        Collections.reverse(vehicles);
        for (int i = 0; i < vehicles.size(); i++) {
            Vehicle v = vehicles.get(i);
            String type = v.toString().substring(0, v.toString().indexOf('@'));
            System.out.printf("%d. Name: %s; Distance travelled: %d; Type: %s\n",
                    i + 1, v.name, v.distanceTravelled, type);
        }
    }
}
