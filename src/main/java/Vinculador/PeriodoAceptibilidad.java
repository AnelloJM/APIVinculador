package Vinculador;

import Configuracion.Configuracion;
import Estructuras.IngresoEgreso;

import java.util.ArrayList;
import java.util.Date;

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
        return (ArrayList<IngresoEgreso>) arrayList.stream().filter(ingresoEgreso -> (fechaDesde.compareTo(ingresoEgreso.getFecha()) * fechaHasta.compareTo(ingresoEgreso.getFecha()) >= 0));
    }
}
