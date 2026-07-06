import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class OrderManagerTest {

    @Test
    void mainPrintsExpectedOrders() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        try {
            System.setOut(new PrintStream(output, true));
            OrderManager.main(new String[0]);
        } finally {
            System.setOut(originalOut);
        }

        String text = output.toString();
        assertTrue(text.contains("Order added for Alice"));
        assertTrue(text.contains("Order added for Bob"));
        assertTrue(text.contains("Customer: Alice, Order: Laptop"));
        assertTrue(text.contains("Customer: Bob, Order: Phone"));
    }
}
