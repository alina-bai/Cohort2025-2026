package Assignments.Transport;

abstract class TransportVehicle {
    String name;
    int speed;

    public void start() {
        System.out.println("The vehicle has started");
    }
    public abstract void move();

}
