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
//nombre de la clase
public class RedSocial {
    //atributos de la clase RedSocial
    private int codigo;
    private String nombre;
    private String url;
    

    /**
     *
     * @param codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return codigo
     */
    public int getCodigo() {
        return this.codigo;
    }

    /**
     *
     * @return nombre
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     *
     * @return url
     */
    public String getUrl() {
        return this.url;
    }
}
