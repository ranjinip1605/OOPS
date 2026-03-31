import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        Show show1 = new Show("Avatar", 150); // ticket price added

        show1.displayShow();
        show1.displaySeats();

        try {
            System.out.print("Enter customer name: ");
            String name = sc.nextLine();

            System.out.print("Enter number of seats: ");
            int count = sc.nextInt();

            int bookedSeats[] = new int[count];

            for(int i = 0; i < count; i++) {
                System.out.print("Enter seat number: ");
                int seat = sc.nextInt();

                show1.bookSeat(seat);
                bookedSeats[i] = seat;
            }

            Customer c = new Customer(name, bookedSeats, count, show1.price);
            c.displayBill();
        }

        catch(SeatBookedException e) {
            System.out.println("Error: " + e.getMessage());
        }

        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid seat number");
        }

        catch(InputMismatchException e) {
            System.out.println("Please enter correct input");
        }
    }
}