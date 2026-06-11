public class Main {
    public static void main(String[] args) {

        FoodItem f1 = new FoodItem(101, "Burger", 120, 2);
        FoodItem f2 = new FoodItem(102, "Pizza", 300, 1);
        FoodItem f3 = new FoodItem(103, "Pasta", 180, 2);
        FoodItem f4 = new FoodItem(104, "Cold Drink", 50, 3);

        Customer c1 = new Customer(1, "Rahul Sharma", "9876543210");
        Customer c2 = new Customer(2, "Priya Singh", "9876501234");

        double totalBill = 0;

        System.out.println("===== CUSTOMER DETAILS =====");
        c1.displayCustomerDetails();

        System.out.println("\n===== ORDER SUMMARY =====");

        f1.displayItemDetails();
        f2.displayItemDetails();
        f3.displayItemDetails();
        f4.displayItemDetails();

        totalBill += f1.calculateAmount();
        totalBill += f2.calculateAmount();
        totalBill += f3.calculateAmount();
        totalBill += f4.calculateAmount();

        System.out.println("-----------------------");
        System.out.println("Total Bill : " + totalBill);
        System.out.println("-----------------------");
    }
}