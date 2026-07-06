package models;

public class Order {
    private final String customerName;
    private final String product;

    public Order(String customerName, String product) {
        if (customerName == null || customerName.isBlank())
            throw new IllegalArgumentException("Customer name must not be empty");
        if (product == null || product.isBlank())
            throw new IllegalArgumentException("Product must not be empty");

        this.customerName = customerName;
        this.product = product;
    }

    public String getCustomerName() { return customerName; }
    public String getProduct() { return product; }
}
