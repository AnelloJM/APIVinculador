package Vinculador;


import Estructuras.IngresoEgreso;
import Estructuras.JsonIngresosEgresos;
import org.json.JSONObject;

import java.util.ArrayList;

public class Vinculador {
    CondicionVinculador condicion;
    CriterioVinculador criterio;

    public JsonIngresosEgresos ejecutarVinculador(JsonIngresosEgresos operacionesPorVincular)
    {
        ArrayList<IngresoEgreso> jEgresos = condicion.ejecutarCondicion(operacionesPorVincular.getEgresos());
        ArrayList<IngresoEgreso>  jIngresos = condicion.ejecutarCondicion(operacionesPorVincular.getIngresos());



        JsonIngresosEgresos response = new JsonIngresosEgresos();
        response.setEgresos(jEgresos);
        response.setIngresos(jEgresos);

        return response;
    }
    public void cambiarCriterio(CriterioVinculador unCriterio){
        this.criterio=unCriterio;
    }
    public void cambiarCondicion(CondicionVinculador unaCondicion){
        this.condicion=unaCondicion;
    }

}
