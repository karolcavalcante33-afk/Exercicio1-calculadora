import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    private final Calculadora calc = new Calculadora();

    @Test
    public void testSomar() {
        assertEquals(5.0, calc.somar(2.0, 3.0), 0.001);
    }

    @Test
    public void testSubtrair() {
        assertEquals(2.0, calc.subtrair(5.0, 3.0), 0.001);
    }

    @Test
    public void testMultiplicar() {
        assertEquals(12.0, calc.multiplicar(4.0, 3.0), 0.001);
    }

    @Test
    public void testDividir() {
        assertEquals(2.0, calc.dividir(6.0, 3.0), 0.001);
    }

    @Test
    public void testDividirPorZero() {
        assertThrows(ArithmeticException.class, () -> {
            calc.dividir(10.0, 0.0);
        });
    }
}