/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.pruebas;

import ec.edu.ups.clases.EstructuraPeriodico;
import ec.edu.ups.clases.Multimedia;
import ec.edu.ups.clases.Noticia;
import ec.edu.ups.clases.RedSocial;
import ec.edu.ups.clases.Seccion;
import java.text.DateFormat;

/**
 *
 * @author Carmen Bravo
 */
public class Prueba {

    public static void main(String[] args) {

        System.out.println("**RED SOCIAL**");
        RedSocial facebook = new RedSocial();
        facebook.setCodigo(1);
        facebook.setNombre("FACEBOOK");
        facebook.setUrl("www.facebook.com");

        int cod = facebook.getCodigo();
        System.out.println("codigo:" + cod);

        String nom = facebook.getNombre();
        System.out.println("nombre:" + nom);
        
        String url = facebook.getUrl();
        System.out.println("url:" + url);

        System.out.println("");
        System.out.println("**SECCION**");
        
        Seccion seccion= new Seccion();
        seccion.setNombre("Deportes");
        //seccion.setNoticia(noticia);
        
        String nombre =seccion.getNombre();
        System.out.println("nombre:" + nombre);
        //Noticia noticia=seccion.getNoticia();
        //System.out.println("noticia:" + );
        System.out.println("");
        System.out.println("**MULTIMEDIA**");
        Multimedia multi= new Multimedia();
        multi.setNombre("El Amanecer");
        //multi.setArchivo();
        multi.setTamanoByte(126);
        multi.setPath("C:/Users/Mateo Robalino/Documents");
        
        String nomb= multi.getNombre();
        System.out.println("nombre:" + nomb);
        
        int tamanoByte=multi.getTamanoByte();
        System.out.println("tamaño de Byte:" + tamanoByte);
        
        String path=multi.getPath();
        System.out.println("ubicacion:"+ path);
        
        System.out.println("");
        System.out.println("**ESTRUCTURA DEL PERIODICO");
        
        EstructuraPeriodico EP=new EstructuraPeriodico();
        EP.setNombrePeriodico("El Mercurio");
       // EP.setFecha("02-01-2019");
        EP.setUbicacion("Cuenca");
        
        String nombreP =EP.getNombrePeriodico();
        System.out.println("Nombre del Periodico:"+ nombreP);
        
        String ubicacionP=EP.getUbicacion();
        System.out.println("Ubicacion:"+ ubicacionP );
        
        System.out.println("");
        System.out.println("**NOTICIA**");
        Noticia noti=new Noticia();
        noti.setTituloNoticia("Nuevas Elecciones Electorales");
       
       noti.setAutor("Carlos Peralta");
       noti.setLugar("Cuenca");
       //noti.setMultimedia("imagenes");
       noti.setContenido("EL 24 de Marzo los ecuatorianos procedieron a sufragar en las elecciones del 2019");
        
        String tituloN=noti.getTituloNoticia();
        System.out.println("titulo de la Noticia:" + tituloN);
        
        String autor= noti.getAutor();
        System.out.println("Autor: " + autor);
        
        String lugar=noti.getLugar();
        System.out.println("Lugar:"+ lugar);
        
        String contenido=noti.getContenido();
        System.out.println("Contenido de la Noticia:" + contenido);
        
        
       
        
        
        
                
        
    
  }
    
}
