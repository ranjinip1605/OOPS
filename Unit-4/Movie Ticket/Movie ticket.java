class Show {
    String movie;
    boolean seats[] = new boolean[5];
    int price;

    Show(String movie, int price) {
        this.movie = movie;
        this.price = price;
    }

    void displayShow() {
        System.out.println("Movie Show: " + movie);
        System.out.println("Ticket Price: ₹" + price);
    }

    void displaySeats() {
        System.out.println("Seat Status (false=available true=booked)");

        for(int i = 0; i < seats.length; i++) {
            System.out.println("Seat " + (i+1) + " : " + seats[i]);
        }
    }

    void bookSeat(int seat) throws SeatBookedException {

        if(seat < 1 || seat > 5) {
            throw new ArrayIndexOutOfBoundsException();
        }

        if(seats[seat-1]) {
            throw new SeatBookedException("Seat already booked");
        }

        seats[seat-1] = true;
        System.out.println("Seat " + seat + " booked successfully");
    }
}

class Customer {
    String name;
    int seats[];
    int count;
    int price;

    Customer(String name, int seats[], int count, int price) {
        this.name = name;
        this.seats = seats;
        this.count = count;
        this.price = price;
    }

    void displayBill() {
        System.out.println("\n----- Ticket Booking Receipt -----");
        System.out.println("Customer Name: " + name);

        System.out.print("Seats Booked: ");
        for(int s : seats) {
            System.out.print(s + " ");
        }

        System.out.println("\nNumber of Tickets: " + count);
        System.out.println("Price per Ticket: ₹" + price);
        System.out.println("Total Amount: ₹" + (count * price));
        System.out.println("----------------------------------");
    }
}