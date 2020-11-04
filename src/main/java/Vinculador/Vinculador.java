package Vinculador;


import Estructuras.IngresoEgreso;
import Estructuras.JsonIngresosEgresos;

import java.util.ArrayList;

public class Vinculador {
    CondicionVinculador condicion;
    CriterioVinculador criterio;

    public String ejecutarVinculador(JsonIngresosEgresos operacionesPorVincular)
    {
        ArrayList<IngresoEgreso> jEgresos = condicion.ejecutarCondicion(operacionesPorVincular.getEgresos());
        ArrayList<IngresoEgreso>  jIngresos = condicion.ejecutarCondicion(operacionesPorVincular.getIngresos());

        criterio.setEgresos(jEgresos);
        criterio.setIngresos(jIngresos);
        String response = criterio.ejecutarCriterio();

        return response;
    }
    public void cambiarCriterio(CriterioVinculador unCriterio){
        this.criterio=unCriterio;
    }
    public void cambiarCondicion(CondicionVinculador unaCondicion){
        this.condicion=unaCondicion;
    }

}
