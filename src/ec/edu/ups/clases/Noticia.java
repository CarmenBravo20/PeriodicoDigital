/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.Date;

/**
 *
 * @author  Carmen Bravo
 */
public class Noticia {

    private String tituloNoticia;
    private String autor;
    private String lugar;
    private Date fecha;
    private String contenido;
    private Multimedia multimedia;

    public void setTituloNoticia(String tituloNoticia) {
        this.tituloNoticia = tituloNoticia;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
     public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setMultimedia(Multimedia multimedia) {
        this.multimedia = multimedia;
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
    
    
    public Date getFecha() {
        return fecha;
    }

    public String getContenido() {
        return contenido;
    }

    public Multimedia getMultimedia() {
        return multimedia;
    }

   
    
    
}
