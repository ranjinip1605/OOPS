class Contact {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("--------------------");
    }
}


class ContactManager {

    ArrayList<Contact> contacts = new ArrayList<>();

    void addContact(String name, String phone, String email) {
        contacts.add(new Contact(name, phone, email));
        System.out.println("Contact Added Successfully!");
    }

    void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
            return;
        }

        for (Contact c : contacts) {
            c.display();
        }
    }

    void searchContact(String name) {
        for (Contact c : contacts) {
            if (c.name.equalsIgnoreCase(name)) {
                System.out.println("Contact Found:");
                c.display();
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    void deleteContact(String name) {
        Iterator<Contact> it = contacts.iterator();

        while (it.hasNext()) {
            Contact c = it.next();
            if (c.name.equalsIgnoreCase(name)) {
                it.remove();
                System.out.println("Contact Deleted!");
                return;
            }
        }

        System.out.println("Contact not found.");
    }
}