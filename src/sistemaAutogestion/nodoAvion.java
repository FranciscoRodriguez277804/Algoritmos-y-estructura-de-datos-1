/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaAutogestion;

/**
 *
 * @author Administrator
 */
public class nodoAvion {
    String codigo;
    int capacidadMax;
    String nomAerolinea;
    nodoAvion siguiente;

    public nodoAvion(String codigo, int capacidadMax, String nomAerolinea) {
        this.codigo = codigo;
        this.capacidadMax = capacidadMax;
        this.nomAerolinea = nomAerolinea;
        this.siguiente = null;
    }

    @Override
    public String toString() {
        return this.codigo; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public String getNomAerolinea() {
        return nomAerolinea;
    }

    public void setNomAerolinea(String nomAerolinea) {
        this.nomAerolinea = nomAerolinea;
    }

    public nodoAvion getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodoAvion siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
    


   
