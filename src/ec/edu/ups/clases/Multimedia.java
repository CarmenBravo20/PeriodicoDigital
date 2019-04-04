/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.Date;

/**
 *
 * @author Carmen Bravo
 */
//nombre de la clase
public class Multimedia {

    // los atributos de la clase Multimedia
    private String nombre;
    private byte archivo;
    private String formato;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private int tamanoByte;
    private String path;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setArchivo(byte archivo) {
        this.archivo = archivo;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public void setTamanoByte(int tamanoByte) {
        this.tamanoByte = tamanoByte;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getNombre() {
        return nombre;
    }

    public byte getArchivo() {
        return archivo;
    }

    public String getFormato() {
        return formato;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public int getTamanoByte() {
        return tamanoByte;
    }

    public String getPath() {
        return path;
    }

    @Override
    public String toString() {
        return "Multimedia{" + "nombre=" + nombre + ", archivo=" + archivo + ", formato=" + formato + ", fechaCreacion=" + fechaCreacion + ", fechaModificacion=" + fechaModificacion + ", tamanoByte=" + tamanoByte + ", path=" + path + '}';
    }
    
 


}