import static org.junit.jupiter.api.Assertions.assertThrows;

import models.Order;
import org.junit.jupiter.api.Test;

class OrderTest {

    @Test
    void rejectsBlankCustomerName() {
        assertThrows(IllegalArgumentException.class, () -> new Order("", "Laptop"));
    }

    @Test
    void rejectsBlankProduct() {
        assertThrows(IllegalArgumentException.class, () -> new Order("Alice", ""));
    }
}
