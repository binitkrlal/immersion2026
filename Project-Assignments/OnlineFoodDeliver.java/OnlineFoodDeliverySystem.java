class FoodItem {
    private int itemId;
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public FoodItem(int itemId, String itemName, double price, int quantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Calculate amount
    public double calculateAmount() {
        return price * quantity;
    }

    // Display item details
    public void displayItemDetails() {
        System.out.println("Item ID      : " + itemId);
        System.out.println("Item Name    : " + itemName);
        System.out.println("Price        : " + price);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Amount       : " + calculateAmount());
        System.out.println("-----------------------------");
    }
}

class Customer {
    private int customerId;
    private String customerName;
    private String mobileNumber;

    // Constructor
    public Customer(int customerId, String customerName, String mobileNumber) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.mobileNumber = mobileNumber;
    }

    // Display customer details
    public void displayCustomerDetails() {
        System.out.println("Customer ID   : " + customerId);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("=============================");
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {

        // Create 4 FoodItem objects
        FoodItem item1 = new FoodItem(101, "Burger", 120, 2);
        FoodItem item2 = new FoodItem(102, "Pizza", 300, 1);
        FoodItem item3 = new FoodItem(103, "Pasta", 180, 2);
        FoodItem item4 = new FoodItem(104, "Cold Drink", 50, 3);

        // Create 2 Customer objects
        Customer customer1 = new Customer(1, "Rahul Sharma", "9876543210");
        Customer customer2 = new Customer(2, "Priya Verma", "9876501234");

        // Display customer details
        customer1.displayCustomerDetails();

        // Display item details and calculate total bill
        double totalBill = 0;

        item1.displayItemDetails();
        totalBill += item1.calculateAmount();

        item2.displayItemDetails();
        totalBill += item2.calculateAmount();

        item3.displayItemDetails();
        totalBill += item3.calculateAmount();

        item4.displayItemDetails();
        totalBill += item4.calculateAmount();

        // Print final bill
        System.out.println("=================================");
        System.out.println("Total Bill : " + totalBill);
        System.out.println("=================================");

        // Display second customer details
        customer2.displayCustomerDetails();
    }
}