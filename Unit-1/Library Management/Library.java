class Library {
    int bookId;
    String title;
    String author;
    int edition;
    int quantity;
   
    Library(int a, String b, String c, int d, int e) {
        this.bookId = a;
        this.title = b;
        this.author = c;
        this.edition = d;
        this.quantity = e;
    }

    void displayLibrary() {
        System.out.println(" Enter the Book Id: "+bookId);
        System.out.println("Enter the title: "+title);
        System.out.println("Enter the author name: "+author);
        System.out.println("Enter the edition: "+edition);
        System.out.println("No. of books needed: "+quantity);
    }
}
