/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaAutogestion;

/**
 *
 * @author Administrator
 */
public class nodoAerolinea {
    String nombre;
    String pais;
    int cantMaxAviones;
    nodoAerolinea siguiente;

    public nodoAerolinea(String nombre, String pais, int cantMaxAviones) {
        this.nombre = nombre;
        this.pais = pais;
        this.cantMaxAviones = cantMaxAviones;
        this.siguiente = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getCantMaxAviones() {
        return cantMaxAviones;
    }

    public void setCantMaxAviones(int cantMaxAviones) {
        this.cantMaxAviones = cantMaxAviones;
    }

    public nodoAerolinea getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodoAerolinea siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
}
