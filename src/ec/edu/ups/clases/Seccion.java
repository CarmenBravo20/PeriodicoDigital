/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Carmen Bravo
 */
//Nombre de la clase
public class Seccion {
    
    //atributos de la clase Seccion
    private String nombre;
    private List<Noticia> noticias;
    //public
    //no retorna nada
    //debe ser el mismo nombre de la clase
    //constructores son metodos especiales que permiten crear o instanciar una clase
    public Seccion(){ 
        noticias= new ArrayList();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNoticia(List<Noticia> noticia) {
        this.noticias = noticia;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Noticia> getNoticia() {
        return noticias;
    }
      public void agregarNoticia(Noticia noticia){
          noticias.add(noticia);
      }

    @Override
    public String toString() {
        return "Seccion{" + "nombre=" + nombre + ", noticias=" + noticias + '}';
    }
          
}