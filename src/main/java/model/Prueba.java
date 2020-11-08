package model;

import Estructuras.IngresoEgreso;
import Estructuras.JsonIngresosEgresos;
import Vinculador.*;
import com.google.gson.Gson;
import spark.Request;
import spark.Response;

import java.util.List;

public class Prueba {
    public String estaEntreFechas (Request req, Response resp){
        req.body();
        Gson g = new Gson();
        JsonIngresosEgresos JO = g.fromJson(req.body(), JsonIngresosEgresos.class);

        Vinculador vinculador = new Vinculador();
        vinculador.cambiarCondicion(JO.getConfiguracion().getCondicionVinculador());
        vinculador.cambiarCriterio(JO.getConfiguracion().getCriterioVinculacion());

        String jsonInString =  vinculador.ejecutarVinculador(JO);

        String response="{\n" +
                "\"Relaciones\":[\n";

        response=response.concat(jsonInString);
        response=response.concat("]\n}");
        return response;
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
