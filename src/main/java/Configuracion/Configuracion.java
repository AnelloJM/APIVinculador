package Configuracion;

import Vinculador.CondicionVinculador;
import Vinculador.CriterioVinculador;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Configuracion {

    public Configuracion() {
        this.levantarConfiguracion();
    }

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(String fechaDesde) throws ParseException {
        this.fechaDesde = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy").parse(fechaDesde);
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(String fechaHasta) throws ParseException {
        this.fechaHasta = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy").parse(fechaHasta);
    }

    public CriterioVinculador getCriterioVinculacion() {
        return criterioVinculacion;
    }

    public void setCriterioVinculacion(String criterioVinculacion) {
        this.criterioVinculacion = criterioVinculacion;
    }

    public CondicionVinculador getApiVinculador() {
        return condicionVinculador;
    }

    public void setCondicionVinculador(String condicionVinculador) {
        this.condicionVinculador = condicionVinculador;
    }

    private Date fechaDesde;
    private Date fechaHasta;
    private CriterioVinculador criterioVinculacion;
    private CondicionVinculador condicionVinculador;

    public void levantarConfiguracion() {
        try {
            File archivo = new File("config.xml");

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = factory.newDocumentBuilder();
            Document archivoDeConfiguracion = documentBuilder.parse(archivo);
            archivoDeConfiguracion.getDocumentElement().normalize();

            Node nodo = archivoDeConfiguracion.getElementsByTagName("General").item(0);

            if(nodo.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) nodo;
                this.setFechaDesde(element.getElementsByTagName("fechaDesde").item(0).getTextContent());
                this.setFechaHasta(element.getElementsByTagName("fechaHasta").item(0).getTextContent());
                this.setCriterioVinculacion(element.getElementsByTagName("criterioVinculacion").item(0).getTextContent());
                this.setCondicionVinculador(element.getElementsByTagName("condicionVinculacion").item(0).getTextContent());
            } else{
                System.out.println("No es un ELEMENT_NODE");
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}