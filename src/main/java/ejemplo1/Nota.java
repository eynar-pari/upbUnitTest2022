package ejemplo1;

public class Nota {

    public String obtenerMensaje(int note) {

        String msg;
        if (note >= 0 && note <= 70)
            msg = "Esfuerzate mas tu nota es: " + note;
        else if (note >= 71 && note <= 80)
            msg="Bien tu nota es: "+note;
        else if  (note >= 81 && note <= 90)
            msg="Muy bien tu nota es: "+note;
        else if (note >= 91 && note <= 100)
            msg="Excelente tu nota es: "+note;
        else
            msg="La nota no es correcta ingrese nuevamente el valor";

        return msg;
    }
}
