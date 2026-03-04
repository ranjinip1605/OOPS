class Vehicle {

    void trackVehicle(int vehicleNumber) {
        System.out.println("Tracking Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle " + vehicleNumber + " is currently in service center.");
    }

    void trackVehicle(String ownerName) {
        System.out.println("Tracking vehicles for Owner: " + ownerName);
        System.out.println("Owner " + ownerName + " has 1 vehicle under servicing.");
    }

    void trackVehicle(String ownerName, String vehicleType) {
        System.out.println("Tracking " + vehicleType + " of Owner: " + ownerName);
        System.out.println(ownerName + "'s " + vehicleType + " is ready for delivery.");
    }
}

class Car extends Vehicle {
    void vehicleType() {
        System.out.println("Vehicle Type: Car");
    }
}

class Bike extends Vehicle {
    void vehicleType() {
        System.out.println("Vehicle Type: Bike");
    }
}