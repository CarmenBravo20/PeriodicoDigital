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
//Nombre de la clase
public class Noticia {

    //son los atributos de la clase Noticia
    private String tituloNoticia;
    private String autor;
    private String lugar;
    private Date fechaPublicacion;
    private String contenido;
    private List<Multimedia> multimedias;
    
    /**
     * Es un Constructor
     */
     public Noticia(){ 
        multimedias= new ArrayList();
    }

    public void setTituloNoticia(String tituloNoticia) {
        this.tituloNoticia = tituloNoticia;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setMultimedias(List<Multimedia> multimedias) {
        this.multimedias = multimedias;
    }

    public String getTituloNoticia() {
        return tituloNoticia;
    }

    public String getAutor() {
        return autor;
    }

    public String getLugar() {
        return lugar;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public String getContenido() {
        return contenido;
    }

    public List<Multimedia> getMultimedias() {
        return multimedias;
    }

    public void agregarMultimedia(Multimedia multimedia) {

        multimedias.add(multimedia);
    }

    @Override
    public String toString() {
        return "Noticia{" + "tituloNoticia=" + tituloNoticia + ", autor=" + autor + ", lugar=" + lugar + ", fechaPublicacion=" + fechaPublicacion + ", contenido=" + contenido + ", multimedias=" + multimedias + '}';
    }

    

   

}
