class Product {

    int id;
    String name;
    int quantity;
    double price;

    Product(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("---------------------");
    }
}


class Inventory {

    HashMap<Integer, Product> items = new HashMap<>();

    void addProduct(Product p) {
        items.put(p.id, p);
        System.out.println("Product added successfully!");
    }

    void viewProducts() {
        if(items.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }

        for(Product p : items.values()) {
            p.display();
        }
    }

    void searchProduct(int id) {
        if(items.containsKey(id)) {
            items.get(id).display();
        }
        else {
            System.out.println("Product not found.");
        }
    }

    void updateQuantity(int id, int qty) {
        if(items.containsKey(id)) {
            items.get(id).quantity = qty;
            System.out.println("Quantity updated.");
        }
        else {
            System.out.println("Product not found.");
        }
    }

    void deleteProduct(int id) {
        if(items.remove(id) != null) {
            System.out.println("Product deleted.");
        }
        else {
            System.out.println("Product not found.");
        }
    }
}