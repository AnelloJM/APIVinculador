package Vinculador;

import Configuracion.Configuracion;
import Estructuras.IngresoEgreso;

import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Collectors;

public class PeriodoAceptibilidad implements CondicionVinculador{
    Date fechaDesde;
    Date fechaHasta;

    public PeriodoAceptibilidad() {
        Configuracion config = new Configuracion();
        this.fechaDesde = config.getFechaDesde();
        this.fechaHasta = config.getFechaHasta();
    }

    @Override
    public ArrayList<IngresoEgreso> ejecutarCondicion(ArrayList<IngresoEgreso> arrayList) {

        ArrayList<IngresoEgreso> filtrado;
        filtrado = (ArrayList<IngresoEgreso>) arrayList.
                stream().
                filter(
                        ingresoEgreso -> (ingresoEgreso.getFecha().compareTo(fechaDesde) * ingresoEgreso.getFecha().compareTo(fechaHasta) <= 0)
                ).collect(Collectors.toList());
        return filtrado;
    }
}
