import interfaces.OrderNotifier;
import interfaces.OrderRepository;

public class App {
    public static void main(String[] args) {
        OrderRepository repository = new InMemoryOrderRepository();
        OrderNotifier notifier = new ConsoleOrderNotifier();
        OrderManager manager = new OrderManager(repository, notifier);

        manager.addOrder("Alice", "Laptop");
        manager.addOrder("Bob", "Phone");
        manager.listOrders();
    }
}
