package ejemplo2MockStatic;

import ejemplo2Static.ejemplo2.HistorialCredito;
import ejemplo2Static.ejemplo2.Prestamo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class PrestamoTestStatic {

    @BeforeAll
    public static void before(){
        MockedStatic<HistorialCredito> mocked = Mockito.mockStatic(HistorialCredito.class);
        mocked.when(()->HistorialCredito.getCategoriaCrediticia(666666)).thenReturn("A");
        mocked.when(()->HistorialCredito.getCategoriaCrediticia(666667)).thenReturn("B");
        mocked.when(()->HistorialCredito.getCategoriaCrediticia(11111)).thenReturn("C");
    }

    @Test
    public void verifyPrestamo(){
        Prestamo prestamo = new Prestamo();
        Assertions.assertEquals("maximo a prestar 200000",
                                       prestamo.maximoPrestamo(666666),
                                "ERROR es incorrecto");
    }

    @Test
    public void verifyPrestamoB(){
        Prestamo prestamo = new Prestamo();
        Assertions.assertEquals("maximo a prestar 100000",
                prestamo.maximoPrestamo(666667),
                "ERROR es incorrecto");
    }

    @Test
    public void verifyPrestamoC(){
        Prestamo prestamo = new Prestamo();
        Assertions.assertEquals("no se puede prestar ningun monto",
                prestamo.maximoPrestamo(11111),
                "ERROR es incorrecto");
    }
}
