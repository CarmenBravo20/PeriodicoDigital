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
import java.text.SimpleDateFormat;
import static java.util.Collections.list;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import sun.util.calendar.Gregorian;

/**
 *
 * @author Carmen Bravo
 */
//nombre de la clase
public class Prueba {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Date fecha1 = new Date();
        System.out.println(fecha1);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        //fecha1.setTime(0);//se en millisegundos**/
        String fechaFormateada = formato.format(fecha1);
        System.out.println("FECHA FORMATEADA:" + fechaFormateada);
        
        Date fecha6 = new Date();
        System.out.println(fecha6);
        SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
        //fecha1.setTime(0);//se en millisegundos**/
        String fechaFormateada1 = formato1.format(fecha6);
        System.out.println("FECHA FORMATEADA:" + fechaFormateada);

        GregorianCalendar fecha2 = new GregorianCalendar(2019, 1, 14);//  hay de 0 a 11 meses
        System.out.println("Fecha:" + formato.format(fecha2.getTime()));// no funciona de esta manera ojo
        fecha2.set(2018, 1, 14);// sirve para modificar la fecha
        System.out.println("fecha:" + formato.format(fecha2.getTime()));

        
        
        Noticia barceleche = new Noticia();
        barceleche.setTituloNoticia("Elecciones 2019");
        barceleche.setAutor("Juan Pelaez");
        barceleche.setContenido("El pasado 24 de Marzo todos los ecuatorianos procederon a votar para asi elejir su alcalde y su prefectura");
        
        Noticia cuenquita = new Noticia();
        cuenquita.setTituloNoticia("Posibles nuevas Elecciones");
        cuenquita.setAutor("Martin Condor");
        cuenquita.setContenido("Se consideran que habra nuevas elecciones en 5 provincias del Ecuador debido a que piensan que bicieron fraude");

        Multimedia multimedia = new Multimedia();
        multimedia.setNombre("El canto");
        multimedia.setFormato("jpn");
        multimedia.setArchivo((byte) 256);
        multimedia.setFechaCreacion(fecha1);
        multimedia.setFechaModificacion(fecha6);
        multimedia.setPath("C:/Users/Carmen Bravo/Desktop/canto");
        
        Seccion seccion1=new Seccion();
        seccion1.setNombre("Cultura");
        

        System.out.println("");
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

        Seccion seccion = new Seccion();
        seccion.setNombre("Deportes");

        seccion.agregarNoticia(barceleche);
        seccion.agregarNoticia(cuenquita);
        System.out.println(seccion);

        String nombre = seccion.getNombre();
        System.out.println("nombre:" + nombre);
        
        
        
        System.out.println("");
        System.out.println("**MULTIMEDIA**");
        Multimedia multi = new Multimedia();
        GregorianCalendar fecha = new GregorianCalendar(2018, 1, 17);
        System.out.println("Fecha de Creacion:" + formato.format(fecha.getTime()));
        GregorianCalendar fecha4 = new GregorianCalendar(2019, 0, 24);
        System.out.println("Fecha de Modificacion:" + formato.format(fecha4.getTime()));
        multi.setNombre("El Amanecer");
        multi.setFormato("mpg");

        multi.setTamanoByte(126);
        multi.setPath("C:/Users/Mateo Robalino/Documents");

        String nomb = multi.getNombre();
        System.out.println("nombre:" + nomb);

        String formatoA = multi.getFormato();
        System.out.println("Formato:" + formatoA);

        int tamanoByte = multi.getTamanoByte();
        System.out.println("tamaño de Byte:" + tamanoByte);

        String path = multi.getPath();
        System.out.println("ubicacion:" + path);

      
        System.out.println("");
        System.out.println("**ESTRUCTURA DEL PERIODICO");

        EstructuraPeriodico EP = new EstructuraPeriodico();
        EP.setNombrePeriodico("El Mercurio");
        GregorianCalendar fecha3 = new GregorianCalendar(2019, 0, 18);//  
        System.out.println("Fecha:" + formato.format(fecha3.getTime()));
        EP.setUbicacion("Cuenca");
        EP.setEncabezado("Titulo");
        EP.agregarSeccion(seccion1);
        System.out.println(seccion1);
        

        String nombreP = EP.getNombrePeriodico();
        System.out.println("Nombre del Periodico:" + nombreP);

        String ubicacionP = EP.getUbicacion();
        System.out.println("Ubicacion:" + ubicacionP);

        String encabezado = EP.getEncabezado();
        System.out.println("Encabezado:" + encabezado);

       
        System.out.println("");
        System.out.println("**NOTICIA**");
        Noticia noti = new Noticia();
        
        noti.agregarMultimedia(multimedia);
        System.out.println(noti);
        
        noti.setTituloNoticia("Nuevas Elecciones Electorales");
        noti.setAutor("Carlos Peralta");
        noti.setLugar("Cuenca");
        noti.setContenido("EL 24 de Marzo los ecuatorianos procedieron a sufragar en las elecciones del 2019");

        String tituloN = noti.getTituloNoticia();
        System.out.println("titulo de la Noticia:" + tituloN);

        String autor = noti.getAutor();
        System.out.println("Autor: " + autor);

        String lugar = noti.getLugar();
        System.out.println("Lugar:" + lugar);

        String contenido = noti.getContenido();
        System.out.println("Contenido de la Noticia:" + contenido);

    }

}
