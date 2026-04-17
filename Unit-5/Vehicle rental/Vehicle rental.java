import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Ride Type (Mini / Sedan / Bike): ");
        String choice = sc.nextLine();

        Vehicle v = VehicleFactory.getVehicle(choice);

        if (v != null) {
            v.bookRide();
            v.calculateFare();
            v.drive();
            v.trackRide();
            v.payment();
        } else {
            System.out.println("Invalid choice! Please select valid ride.");
        }

        sc.close();
    }
}

// Interface
interface Vehicle {
    void bookRide();
    void drive();
    void payment();
    void calculateFare();
    void trackRide();
    void cancelRide();
}

// Mini Class
class Mini implements Vehicle {
    double fare;

    public void bookRide() {
        System.out.println("Ola Mini ride booked ");
    }

    public void calculateFare() {
        fare = 100 + (Math.random() * 50);
        System.out.println("Estimated Fare: ₹" + fare);
    }

    public void drive() {
        System.out.println("Mini car is on the way...");
    }

    public void trackRide() {
        System.out.println("Tracking: Driver is 5 mins away ");
    }

    public void payment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Payment: 1.Cash 2.UPI 3.Card");
        int p = sc.nextInt();

        if (p == 1) System.out.println("Paid ₹" + fare + " via Cash");
        else if (p == 2) System.out.println("Paid ₹" + fare + " via UPI");
        else System.out.println("Paid ₹" + fare + " via Card");
    }

    public void cancelRide() {
        System.out.println("Mini ride cancelled ");
    }
}

// Sedan Class
class Sedan implements Vehicle {
    double fare;

    public void bookRide() {
        System.out.println("Ola Sedan ride booked ");
    }

    public void calculateFare() {
        fare = 150 + (Math.random() * 70);
        System.out.println("Estimated Fare: ₹" + fare);
    }

    public void drive() {
        System.out.println("Sedan ride started...");
    }

    public void trackRide() {
        System.out.println("Tracking: Driver is 3 mins away ");
    }

    public void payment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Payment: 1.Cash 2.UPI 3.Card");
        int p = sc.nextInt();

        if (p == 1) System.out.println("Paid ₹" + fare + " via Cash");
        else if (p == 2) System.out.println("Paid ₹" + fare + " via UPI");
        else System.out.println("Paid ₹" + fare + " via Card");
    }

    public void cancelRide() {
        System.out.println("Sedan ride cancelled ");
    }
}

// Bike Class
class Bike implements Vehicle {
    double fare;

    public void bookRide() {
        System.out.println("Rapido bike ride booked ");
    }

    public void calculateFare() {
        fare = 50 + (Math.random() * 30);
        System.out.println("Estimated Fare: ₹" + fare);
    }

    public void drive() {
        System.out.println("Bike ride in progress...");
    }

    public void trackRide() {
        System.out.println("Tracking: Rider arriving soon");
    }

    public void payment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Payment: 1.Cash 2.UPI 3.Card");
        int p = sc.nextInt();

        if (p == 1) System.out.println("Paid ₹" + fare + " via Cash");
        else if (p == 2) System.out.println("Paid ₹" + fare + " via UPI");
        else System.out.println("Paid ₹" + fare + " via Card");
    }

    public void cancelRide() {
        System.out.println("Bike ride cancelled ");
    }
}

// Factory Class
class VehicleFactory {
    public static Vehicle getVehicle(String type) {
        if (type.equalsIgnoreCase("mini")) return new Mini();
        else if (type.equalsIgnoreCase("sedan")) return new Sedan();
        else if (type.equalsIgnoreCase("bike")) return new Bike();
        else return null;
    }
}