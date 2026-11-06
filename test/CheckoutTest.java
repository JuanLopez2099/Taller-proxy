import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckoutTest {
    @Test void sumaSubtotalYEnvioSmart() {
        Checkout checkout = new Checkout(new SmartShippingCalculator());
        Order order = new Order("o1", "c1", "Medellín", 100, 4);
        assertEquals(115.0, checkout.total(order)); // 100 + (4 × 2,5 + 5)
    }

    @Test void enBogotaNoHayRecargo() {
        Checkout checkout = new Checkout(new SmartShippingCalculator());
        Order order = new Order("o2", "c1", "Bogotá", 100, 4);
        assertEquals(110.0, checkout.total(order)); // 100 + (4 × 2,5)
    }
}