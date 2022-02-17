package calculadoraTest;

import basicCalculator.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**parametrizacion**/
public class Calculadora2Test {

    @ParameterizedTest
    @CsvSource({ "2,2,4",
          "3,3,6",
          "2,3,5",
          "-2,-2,-4",
          "-1,5,4"
    })
    public void sumarTest(int a,int b, int expectedResult){
        Calculadora calculadora = new Calculadora();
        int actualResult=calculadora.suma(a,b);
        Assertions.assertEquals(expectedResult,actualResult,"ERROR! la suma es incorrecta");
    }
}