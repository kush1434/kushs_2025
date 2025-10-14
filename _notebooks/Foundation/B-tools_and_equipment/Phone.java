import java.util.ArrayList;

public class Phone {
    // Attributes (4)
    private String brand;
    private String model;
    private int batteryLevel;
    private ArrayList<String> contacts;
    
    // Constructor - sets brand and model, initializes empty contacts list
    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.batteryLevel = 100;
        this.contacts = new ArrayList<String>();
    }
    
    // displayInfo() - prints brand, model, and battery level
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Battery Level: " + batteryLevel + "%");
    }
    
    // addContact(String name) - adds name to contacts list
    public void addContact(String name) {
        contacts.add(name);
        System.out.println("Added contact: " + name);
    }
    
    // showContacts() - prints all contacts
    public void showContacts() {
        System.out.println("Contacts (" + contacts.size() + "):");
        if (contacts.isEmpty()) {
            System.out.println("  No contacts saved");
        } else {
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println("  " + (i + 1) + ". " + contacts.get(i));
            }
        }
    }
    
    // usePhone(int minutes) - decreases battery by minutes used
    public void usePhone(int minutes) {
        batteryLevel -= minutes;
        if (batteryLevel < 0) {
            batteryLevel = 0;
        }
        System.out.println("Used phone for " + minutes + " minutes. Battery now at " + batteryLevel + "%");
    }
}

// Test your Phone class
class PhoneTest {
    public static void main(String[] args) {
        System.out.println("=== Phone Testing Program ===\n");
        
        // Create 2 Phone objects
        Phone phone1 = new Phone("Apple", "iPhone 15");
        Phone phone2 = new Phone("Samsung", "Galaxy S24");
        
        System.out.println("--- Testing Phone 1 ---");
        // Add 3 contacts to phone1
        phone1.addContact("Alice Johnson");
        phone1.addContact("Bob Smith");
        phone1.addContact("Carol Davis");
        
        // Use phone1 for some minutes
        phone1.usePhone(25);
        
        // Display phone1 information
        System.out.println();
        phone1.displayInfo();
        phone1.showContacts();
        
        System.out.println("\n--- Testing Phone 2 ---");
        // Add 3 contacts to phone2
        phone2.addContact("David Lee");
        phone2.addContact("Emma Wilson");
        phone2.addContact("Frank Martinez");
        
        // Use phone2 for some minutes
        phone2.usePhone(40);
        
        // Display phone2 information
        System.out.println();
        phone2.displayInfo();
        phone2.showContacts();
        
        System.out.println("\n--- Additional Testing ---");
        // Extra testing: use phone1 more
        phone1.usePhone(30);
        System.out.println();
        phone1.displayInfo();
    }
}
