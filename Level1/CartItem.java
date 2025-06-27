package Level1;

public class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void addQuantity(int qty) {
        quantity += qty;
    }

    public void removeQuantity(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
        } else {
            System.out.println("Cannot remove more than available quantity.");
        }
    }

    public double totalCost() {
        return price * quantity;
    }

    public void displayItem() {
        System.out.println("Item: " + itemName);
        System.out.println("Price per item: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost());
    }
}
