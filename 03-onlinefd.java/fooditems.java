class FoodItem{
    int itemId;
    String itemName;
    double price;
    int quantity;
    FoodItem(int itemId,String itemName,double price,int quantity){
        this.itemId=itemId;
        this.itemName=itemName;
        this.price=price;
        this.quantity=quantity;
    }
    double calculateAmount(){
        return price * quantity;
    }
    void displayItemDetails(){
        System.out.println("Item Name : " + itemName);
        System.out.println("Price : " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Amount : " + calculateAmount());
        System.out.println();
    }

}