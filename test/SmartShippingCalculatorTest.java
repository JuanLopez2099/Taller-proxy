import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SmartShippingCalculatorTest {
    private final SmartShippingCalculator calculator = new SmartShippingCalculator();

    @Test
    void cobra2_5PorKilo() {
        Order o = new Order("A1", "C1", "Bogotá", 100.0, 4.0);
        assertEquals(10.0, calculator.calculate(o), 0.001);
    }

    @Test
    void fueraDeBogotaSuma5() {
        Order o = new Order("A2", "C1", "Medellín", 100.0, 4.0);
        assertEquals(15.0, calculator.calculate(o), 0.001);
    }

    @Test
    void enBogotaNoSumaNada() {
        Order o = new Order("A3", "C1", "Bogotá", 100.0, 4.0);
        assertEquals(10.0, calculator.calculate(o), 0.001);
    }
}