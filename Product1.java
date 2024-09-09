public class Product1 implements Taxable {
    private int pid;
    private double price;
    private int quantity;

    // Constructor
    public Product1(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    // Calculate sales tax based on unit price and quantity
    @Override
    public double calcTax() {
        return price * quantity * SALES_TAX;
    }

    @Override
    public String toString() {
        return "Product ID: " + pid + ", Price: " + price + ", Quantity: " + quantity;
    }
}
