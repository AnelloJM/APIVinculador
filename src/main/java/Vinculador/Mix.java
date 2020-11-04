package Vinculador;

import Estructuras.IngresoEgreso;

import java.util.ArrayList;
import java.util.List;

public class Mix implements CriterioVinculador {
    private List<CriterioVinculador> criteriosVinculados;

    @Override
    public void setEgresos(ArrayList<IngresoEgreso> egresos) {

    }

    @Override
    public void setIngresos(ArrayList<IngresoEgreso> ingresos) {

    }

    @Override
    public String ejecutarCriterio() {
        return "falta implementar";

    }
}
