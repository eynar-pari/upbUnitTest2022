package mockTest;

import ejemploMock.CalculadoraMock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraWithoutMock {

    @Test
    public void verifyFactorial(){
        CalculadoraMock calculadoraMock = new CalculadoraMock();
        int expectedResult=6;
        int actualResult=calculadoraMock.getFactorial(3);
        Assertions.assertEquals(expectedResult,actualResult,"Error el factorial el incorrecto");
    }

}
