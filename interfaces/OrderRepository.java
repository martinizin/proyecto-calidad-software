package interfaces;

import java.util.List;
import models.Order;

public interface OrderRepository {
    void save(Order order);
    List<Order> findAll();
}
