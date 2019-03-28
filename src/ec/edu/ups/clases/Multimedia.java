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
public class Multimedia {

    private String nombre;
    private byte archivo;
    private int tamanoByte;
    private String path;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setArchivo(byte archivo) {
        this.archivo = archivo;
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

    public int getTamanoByte() {
        return tamanoByte;
    }

    public String getPath() {
        return path;
    }

    
    
}
