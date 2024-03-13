import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * Esta clase hace pruebas  para la clase Suma.
 */
public class PruebaSum {
    @Test
    void testSumar() {

        Suma suma = new Suma();


        double num1 = 2.0;
        double num2 = 3.0;


        double resultado = suma.Sumar();
        assertEquals(num1 + num2, resultado);


    }
    @Test
    void testSumar1() {

        Suma suma = new Suma();


        double num1 = 4.0;
        double num2 = 5.0;


        double resultado = suma.Sumar();
        assertEquals(num1 + num2, resultado);


    }
    @Test
    void testSumar2() {

        Suma suma = new Suma();


        double num1 = 6.0;
        double num2 = 3.0;


        double resultado = suma.Sumar();
        assertEquals(num1 + num2, resultado);


    }
}