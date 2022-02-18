package ejemploMockStatic;


public class CalculadoraMockStatic {

    public CalculadoraMockStatic(){
    }

     public int getFactorial(int number){
        int fact=1;
        for (int i = 1; i <=number ; i++) {
            fact=MultiplicarServicioStatic.multi(fact,i);
        }
        return fact;
    }



}
