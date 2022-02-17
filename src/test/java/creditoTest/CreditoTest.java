package creditoTest;

import ejemplo2.HistorialCredito;
import ejemplo2.Prestamo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CreditoTest {

    //PASO 2
    HistorialCredito historialCreditoMock = Mockito.mock(HistorialCredito.class);

    @Test
    public void verifyMontoMaximoA(){
        //PASO3
        Mockito.when(historialCreditoMock.getCategoriaCrediticia(12345)).thenReturn("A");

        Prestamo prestamo = new Prestamo(historialCreditoMock);
        String actualResult= prestamo.maximoPrestamo(12345);
        String expectedResult= "maximo a prestar 200000";
        Assertions.assertEquals(expectedResult,actualResult,"ERROR!! la respuesta es incorrecta");

        Mockito.verify(historialCreditoMock).getCategoriaCrediticia(12345);
    }
    @Test
    public void verifyMontoMaximoB(){
        //PASO3
        Mockito.when(historialCreditoMock.getCategoriaCrediticia(55555)).thenReturn("B");
        Prestamo prestamo = new Prestamo(historialCreditoMock);
        String actualResult= prestamo.maximoPrestamo(55555);
        String expectedResult= "maximo a prestar 100000";
        Assertions.assertEquals(expectedResult,actualResult,"ERROR!! la respuesta es incorrecta");
        Mockito.verify(historialCreditoMock).getCategoriaCrediticia(55555);
    }

    @Test
    public void verifyMontoMaximoC(){
        //PASO3
        Mockito.when(historialCreditoMock.getCategoriaCrediticia(98765)).thenReturn("C");
        Prestamo prestamo = new Prestamo(historialCreditoMock);
        String actualResult= prestamo.maximoPrestamo(98765);
        String expectedResult= "no se puede prestar ningun monto";
        Assertions.assertEquals(expectedResult,actualResult,"ERROR!! la respuesta es incorrecta");
        Mockito.verify(historialCreditoMock).getCategoriaCrediticia(98765);
    }
}
