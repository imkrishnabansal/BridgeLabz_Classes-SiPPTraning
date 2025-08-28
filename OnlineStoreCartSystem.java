import java.util.ArrayList;
import java.util.List;

class Item {
    String name;
    double price;

    Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class OnlineStoreCartSystem {
    public static <T extends Item> double calculateTotal(List<T> items) {
        double total = 0;
        for (T item : items) {
            total += item.price;
        }
        return total;
    }

    public static void main(String[] args) {
        List<Item> cart = new ArrayList<>();
        cart.add(new Item("Book", 200.5));
        cart.add(new Item("Pen", 20.0));
        cart.add(new Item("Laptop", 45000.0));

        double total = calculateTotal(cart);
        System.out.println("Total price: " + total);
    }
}