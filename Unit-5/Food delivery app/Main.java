public class Main { 

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        List<Food> menu = new ArrayList<>();
        menu.add(new Food(1, "Burger", 120));
        menu.add(new Food(2, "Pizza", 250));
        menu.add(new Food(3, "Sandwich", 100));
        menu.add(new Food(4, "Juice", 80));

        double total = 0;

        while (true) {
            System.out.println("\n--- Food Menu ---");

            for (Food f : menu) {
                f.display();
            }

            System.out.println("5. Checkout");
            System.out.print("Enter choice: ");

            int choice = s.nextInt();

            if (choice >= 1 && choice <= 4) {
                Food selected = menu.get(choice - 1);

                System.out.print("Enter quantity: ");
                int qty = s.nextInt();

                double cost = selected.price * qty;
                total += cost;

                System.out.println(selected.name + " added! Cost: ₹" + cost);
            }
            else if (choice == 5) {
                System.out.println("\nTotal Bill: ₹" + total);

                System.out.println("Select Payment Method:");
                System.out.println("1. Cash");
                System.out.println("2. UPI");

                int pay = s.nextInt();

                if (pay == 1) {
                    System.out.println("Payment Successful (Cash)");
                } else {
                    System.out.println("Payment Successful (UPI)");
                }

                System.out.println("Order Placed Successfully ");
                break;
            }
            else {
                System.out.println("Invalid choice!");
            }
        }

        s.close();
    }
}