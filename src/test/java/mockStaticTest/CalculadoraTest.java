package mockStaticTest;

import ejemploMockStatic.CalculadoraMockStatic;
import ejemploMockStatic.MultiplicarServicioStatic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class CalculadoraTest {

    @Test
    public void verifyFactorialStatic(){
        MockedStatic<MultiplicarServicioStatic> objectMock= Mockito.mockStatic(MultiplicarServicioStatic.class);

        objectMock.when(()-> MultiplicarServicioStatic.multi(1,1)).thenReturn(1);
        objectMock.when(()-> MultiplicarServicioStatic.multi(1,2)).thenReturn(2);
        objectMock.when(()-> MultiplicarServicioStatic.multi(2,3)).thenReturn(6);
        objectMock.when(()-> MultiplicarServicioStatic.multi(6,4)).thenReturn(24);

        CalculadoraMockStatic calculadoraMockStatic = new CalculadoraMockStatic();
        int expected =24;
        int actual =calculadoraMockStatic.getFactorial(4);
        Assertions.assertEquals(expected,actual,"ERROR el factorial es incorrecto");



    }
}
