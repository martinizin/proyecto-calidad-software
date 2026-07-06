import interfaces.OrderNotifier;
import interfaces.OrderRepository;
import models.Order;

public class OrderManager {
    private final OrderRepository repository;
    private final OrderNotifier notifier;

    public OrderManager(OrderRepository repository, OrderNotifier notifier) {
        this.repository = repository;
        this.notifier = notifier;
    }

    public void addOrder(String customerName, String product) {
        Order order = new Order(customerName, product);
        repository.save(order);
        notifier.notify(order);
    }

    public void listOrders() {
        repository.findAll().forEach(order ->
            System.out.println("Customer: " + order.getCustomerName() +
                               ", Order: " + order.getProduct())
        );
    }
}
