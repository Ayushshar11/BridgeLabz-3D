package Level1;

class Product {
    static String store = "OnlineMart";
    private final int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void showProduct() {
        if (this instanceof Product) {
            System.out.println("[" + id + "] " + name + " - ₹" + price + " @ " + store);
        }
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Laptop", 55000);
        Product p2 = new Product(2, "Phone", 25000);

        p1.showProduct();
        p2.showProduct();
    }
}
