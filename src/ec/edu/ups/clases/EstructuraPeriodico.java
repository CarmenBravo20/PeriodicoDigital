/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Carmen Bravo
 */
//nombre de la clase
public class EstructuraPeriodico {

    //los atributos de la clase Estructuraeriodico
    private String nombrePeriodico;
    private String ubicacion;
    private Date fecha;
    private String encabezado;
    private List<Seccion> secciones;
    
    /**
     * Es un Constructor
     */
    public EstructuraPeriodico(){
        secciones=new ArrayList();
    }

    public void setNombrePeriodico(String nombrePeriodico) {
        this.nombrePeriodico = nombrePeriodico;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setEncabezado(String encabezado) {
        this.encabezado = encabezado;
    }

    public void setSecciones(List<Seccion> secciones) {
        this.secciones = secciones;
    }

   
    

    public String getNombrePeriodico() {
        return nombrePeriodico;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getEncabezado() {
        return encabezado;
    }

    public List<Seccion> getSecciones() {
        return secciones;
    }

   
    public void agregarSeccion(Seccion seccion) {

        secciones.add(seccion);
    }

    @Override
    public String toString() {
        return "EstructuraPeriodico{" + "nombrePeriodico=" + nombrePeriodico + ", ubicacion=" + ubicacion + ", fecha=" + fecha + ", encabezado=" + encabezado + ", secciones=" + secciones + '}';
    }
    
  
    

}
