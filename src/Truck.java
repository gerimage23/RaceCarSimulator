import java.util.Random;

class Truck extends Vehicle {

    private static int speed = 100;
    private int breakdownTurnsLeft;

    Truck() {
        Random rnd = new Random();
        this.name = String.valueOf(rnd.nextInt(1000));
        this.breakdownTurnsLeft = 0;
    }

    void moveForAnHour() {
        // speed: 100km/h. 5% chance of breaking down for 2 hours.

        if (this.breakdownTurnsLeft == 0) { //if not broken down

            Random rnd = new Random();
            if (rnd.nextDouble() < 0.05) { //breakdown
                this.breakdownTurnsLeft = 2;
            }
            else {
                this.distanceTravelled += speed;
            }
        }
        else { // if broken down
            this.breakdownTurnsLeft--;
        }
    }
}
