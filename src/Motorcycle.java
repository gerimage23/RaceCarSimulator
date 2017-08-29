import java.util.Random;

public class Motorcycle extends Vehicle {

    static int nameNumber = 1;
    static int speed = 100;

    public Motorcycle() {
        this.name = "Motorcycle " + nameNumber++;
        this.distanceTravelled = 0;
    }

    void moveForAnHour() {
        int slowed = 0;
        if (Main.isRaining) {
            Random rnd = new Random();
            slowed = rnd.nextInt(45) + 5;
        }

        this.distanceTravelled += speed - slowed;
    }
}
