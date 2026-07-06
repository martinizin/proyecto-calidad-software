import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import interfaces.OrderRepository;
import models.Order;

public class InMemoryOrderRepository implements OrderRepository {
    private final List<Order> orders = new ArrayList<>();

    @Override
    public void save(Order order) {
        orders.add(order);
    }

    @Override
    public List<Order> findAll() {
        return Collections.unmodifiableList(orders);
    }
}
