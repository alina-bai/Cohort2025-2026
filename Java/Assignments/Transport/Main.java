package Assignments.Transport;

public class Main {
    public static void main(String[] args) {

        TransportVehicle[] vehicles = new TransportVehicle[2];
        vehicles[0] = new Bicycle();
        vehicles[1] = new Train();

        for (TransportVehicle vehicle : vehicles ) {
            vehicle.start();
            vehicle.move();
            System.out.println();
        }
        }
    }


