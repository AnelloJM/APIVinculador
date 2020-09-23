package Server;

import Estructuras.IngresoEgreso;
import java.util.ArrayList;
import java.util.List;
import spark.Spark;
import spark.debug.DebugScreen;

public class Server {
    public static void main(String[] args){
        Spark.port(9000);
        Router.init();
        DebugScreen.enableDebugScreen();
    }

    public boolean estaEntreFechas(IngresoEgreso ingresoegreso) {
        //en base a las del arch de configuracion
        //return true/false
        return true;
    }

    public void ordenarPorFecha( List<IngresoEgreso> ingresosegresos ) {
        //orderlistaby fecha ascendente (lista)
    }

    public void ordenarPorValor( List<IngresoEgreso> ingresosegresos ) {
        //orderlistaby valor ascendente (lista)
    }

    public String vincular( IngresoEgreso ingreso, IngresoEgreso egreso) {
        //devuelve el objeto vinculado para agregar al JSON
        return "void";
    }

    public String ejecutarCriterio(){
        //levantamos segun arch de configuracion que criterio
        return "void";
    }
}
