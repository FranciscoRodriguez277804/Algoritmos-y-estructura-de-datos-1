/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaAutogestion;

/**
 *
 * @author Administrator
 */
public class nodoCliente {
    String pasaporte;
    String nombre;
    int edad;
    nodoCliente siguiente;
   

    public nodoCliente(String pasaporte, String nombre, int edad) {
        this.pasaporte = pasaporte;
        this.nombre = nombre;
        this.edad = edad;
        this.siguiente = null;
      
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public nodoCliente getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodoCliente siguiente) {
        this.siguiente = siguiente;
    }
    
    @Override
    public String toString() {
        return this.pasaporte + "-" + this.nombre + "-" + this.edad + "|\n";
    }
    
    public boolean equals(nodoCliente a) {
        return this.pasaporte.equals(a.getPasaporte());
    }
}
