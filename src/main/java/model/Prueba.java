package model;

import Estructuras.IngresoEgreso;
import Estructuras.JsonObject;
import com.google.gson.Gson;
import spark.Request;
import spark.Response;

import java.util.List;

public class Prueba {
    public String estaEntreFechas (Request req, Response resp){
        req.body();
        Gson g = new Gson();
        JsonObject JO = g.fromJson(req.body(), JsonObject.class);
        String jsonInString = g.toJson(JO);
        return jsonInString;
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
