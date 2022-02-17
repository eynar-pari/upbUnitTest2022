import org.junit.jupiter.api.*;

public class BasicSintaxis {
    @BeforeAll
    public static void beforeClass(){
        System.out.println("INICIO >>>> Esto se ejecuta solo 1 vez");
    }

    @AfterAll
    public static void afterClass(){
        System.out.println("FINAL >>> Esto se ejecuta solo 1 vez ");
    }

    @BeforeEach
    public void setup(){
        System.out.println("BEFORE> Esto se ejecuta antes de CADA test");
    }

    @AfterEach
    public void cleanup(){
        System.out.println("AFTER > Esto se ejecuta despues de CADA test");
    }

    @Test
    public void verifyThing(){
        System.out.println("TEST 1");
    }

    @Test
    public void verifyThing2(){
        System.out.println("TEST 2");
    }

}
