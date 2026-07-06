import interfaces.OrderNotifier;
import models.Order;

public class ConsoleOrderNotifier implements OrderNotifier {
    @Override
    public void notify(Order order) {
        System.out.println("Order added for " + order.getCustomerName());
    }
}
