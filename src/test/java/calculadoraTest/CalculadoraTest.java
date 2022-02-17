package calculadoraTest;

import basicCalculator.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;


public class CalculadoraTest {

    @Test
    public void sumarTest(){
        Calculadora calculadora = new Calculadora();
        int expectedResult=4;
        int actualResult=calculadora.suma(2,2);
        // tiene que existir una verificacion
        Assertions.assertEquals(expectedResult,actualResult,"ERROR! la suma es incorrecta");
    }

    @Test
    @Disabled
    public void restaTest(){
        Calculadora calculadora = new Calculadora();
        int expectedResult=0;
        int actualResult=calculadora.resta(2,2);
        // tiene que existir una verificacion
        Assertions.assertEquals(expectedResult,actualResult,"ERROR! la resta es incorrecta");
    }


    @Test
    @Timeout(value = 7)
    public void multiTest() throws InterruptedException {
        Calculadora calculadora = new Calculadora();
        int expectedResult=6;
        int actualResult=calculadora.multi(3,2);
        // tiene que existir una verificacion
        Assertions.assertEquals(expectedResult,actualResult,"ERROR! la multiplicacion es incorrecta");
    }

    @Test
    public void dividirTest(){
        Calculadora calculadora = new Calculadora();
        Assertions.assertThrows(Exception.class, ()-> {calculadora.division(8,0);} );
    }


}
