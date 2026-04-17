import java.util.*;

// Base Class
class Book {
    protected int id;
    protected String title;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    // Method to override
    public void display() {
        System.out.println("Book ID: " + id + ", Title: " + title);
    }

    public void issue() {
        System.out.println(title + " issued.");
    }

    public void returnBook() {
        System.out.println(title + " returned.");
    }
}

// Derived Class - Fiction
class Fiction extends Book {
    public Fiction(int id, String title) {
        super(id, title);
    }

    @Override
    public void display() {
        System.out.println("Fiction Book → ID: " + id + ", Title: " + title);
    }
}

// Derived Class - NonFiction
class NonFiction extends Book {
    public NonFiction(int id, String title) {
        super(id, title);
    }

    @Override
    public void display() {
        System.out.println("Non-Fiction Book → ID: " + id + ", Title: " + title);
    }
}

// Derived Class - Magazine
class Magazine extends Book {
    public Magazine(int id, String title) {
        super(id, title);
    }

    @Override
    public void display() {
        System.out.println("Magazine → ID: " + id + ", Title: " + title);
    }
}

