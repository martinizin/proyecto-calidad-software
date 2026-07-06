package interfaces;

import models.Order;

public interface OrderNotifier {
    void notify(Order order);
}
