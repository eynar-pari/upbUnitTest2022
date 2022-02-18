package ejemplo2Static.ejemplo2;

import java.util.HashMap;
import java.util.Map;

public class Prestamo {


    // testeamos este metodo
    public String maximoPrestamo(int ci){
        Map<String,String> maximo = new HashMap<>();
        maximo.put("A","maximo a prestar 200000");
        maximo.put("B","maximo a prestar 100000");
        maximo.put("C","no se puede prestar ningun monto");
        String categoria =HistorialCredito.getCategoriaCrediticia(ci);
        return maximo.get(categoria);
    }


}
