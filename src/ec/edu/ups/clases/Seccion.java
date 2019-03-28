/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *
 * @author Carmen Bravo
 */
public class Seccion {
    
    private String nombre;
    private Noticia noticia;
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNoticia(Noticia noticia) {
        this.noticia = noticia;
    }
    

    public String getNombre() {
        return nombre;
        
    }

    public Noticia getNoticia() {
        return noticia;
    }
    
    
}
