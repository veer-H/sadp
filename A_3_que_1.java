// Product class to hold product information
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// TaxCalculator class responsible for tax calculation
class TaxCalculator {
    public double calculateTax(Product product) {
        return product.getPrice() * 0.10;  // 10% tax rate
    }
}

public class A_3_que_1 {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 1000);
        TaxCalculator taxCalculator = new TaxCalculator();

        double tax = taxCalculator.calculateTax(product);
        System.out.println("Tax for " + product.getName() + ": " + tax);
    }
}
