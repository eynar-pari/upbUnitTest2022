package ejemplo2;

import java.util.HashMap;
import java.util.Map;

public class Prestamo {

    HistorialCredito historialCredito;
    public Prestamo(){
        historialCredito= new HistorialCredito();
    }

    //  ********** PASO 1 **************//
    // este seccion de codigo solo TEST
    public Prestamo(HistorialCredito objetoMockeado){
        historialCredito=objetoMockeado;
    }

    // testeamos este metodo
    public String maximoPrestamo(int ci){
        Map<String,String> maximo = new HashMap<>();
        maximo.put("A","maximo a prestar 200000");
        maximo.put("B","maximo a prestar 100000");
        maximo.put("C","no se puede prestar ningun monto");
        String categoria =historialCredito.getCategoriaCrediticia(ci);
        return maximo.get(categoria);
    }

    public HistorialCredito getHistorialCredito() {
        return historialCredito;
    }

    public void setHistorialCredito(HistorialCredito historialCredito) {
        this.historialCredito = historialCredito;
    }
}
