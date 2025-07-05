
import java.util.Map;
import java.util.HashMap;

public class Cart {
    Map<Product, Integer> items = new HashMap<>();

    // Add method
    public void add(Product product, int quantity) {
        if (quantity <= 0) return;

        // Optional: validate quantity doesn't exceed product.stock
        if (quantity > product.quantity) {
            System.out.println("Not enough stock for: " + product.name);
            return;
        }

        // Add or update quantity in cart
        items.put(product, items.getOrDefault(product, 0) + quantity);
    }
}