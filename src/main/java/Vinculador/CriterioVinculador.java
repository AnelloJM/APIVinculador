package Vinculador;

import Estructuras.IngresoEgreso;

import java.util.ArrayList;

// primero valor otro por fecha en los de ordenar
public interface CriterioVinculador {
    void setEgresos(ArrayList<IngresoEgreso> egresos);
    void setIngresos(ArrayList<IngresoEgreso> ingresos);

    String ejecutarCriterio();
}
