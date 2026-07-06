import java.util.ArrayList;
import java.util.List;

public class OldOrderManager {
    private List customers = new ArrayList<>();
    private List orders = new ArrayList<>();

    public void addOrder(String customer, String order) {
        customers.add(customer);
        orders.add(order);
        System.out.println("Order added for " + customer);
    }

    public void listOrders() {
        for (int i = 0; i < orders.size(); i++) {
            System.out.println("Customer: " + customers.get(i) + ", Order: " + orders.get(i));
        }
    }

    public static void main(String[] args) {
        OldOrderManager om = new OldOrderManager();
        om.addOrder("Alice", "Laptop");
        om.addOrder("Bob", "Phone");
        om.listOrders();
    }
}