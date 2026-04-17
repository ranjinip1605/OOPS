// Main Class
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Book> library = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Select Type: 1.Fiction 2.NonFiction 3.Magazine");
                    int type = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    Book b = null;

                    if (type == 1) b = new Fiction(id, title);
                    else if (type == 2) b = new NonFiction(id, title);
                    else if (type == 3) b = new Magazine(id, title);

                    if (b != null) {
                        library.add(b);
                        System.out.println("Book added successfully!");
                    }
                    break;

                case 2:
                    for (Book book : library) {
                        book.display(); // Polymorphism
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to issue: ");
                    int issueId = sc.nextInt();

                    for (Book book : library) {
                        if (book.id == issueId) {
                            book.issue();
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID to return: ");
                    int returnId = sc.nextInt();

                    for (Book book : library) {
                        if (book.id == returnId) {
                            book.returnBook();
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}