abstract class Vehicle {
    String name;
    int distanceTravelled = 0;
    abstract void moveForAnHour();

    int getDistanceTravelled() {
        return this.distanceTravelled;
    }
}
