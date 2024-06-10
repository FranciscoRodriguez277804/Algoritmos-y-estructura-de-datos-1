/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaAutogestion;

/**
 *
 * @author Administrator
 */
public class nodoPasaje {
    String pasaporteCliente;
    String codigoVuelo;
    int categoriaPasaje;
    boolean esDevuelto;
    nodoPasaje siguiente;

    public nodoPasaje(String pasaporteCliente, String codigoVuelo, int categoriaPasaje) {
        this.pasaporteCliente = pasaporteCliente;
        this.codigoVuelo = codigoVuelo;
        this.categoriaPasaje = categoriaPasaje;
        this.siguiente = null;
        this.esDevuelto = false;
        
    }

    public boolean getEsDevuelto() {
        return esDevuelto;
    }

    public void setEsDevuelto(boolean esDevuelto) {
        this.esDevuelto = esDevuelto;
    }
    
    public nodoPasaje(boolean esDevuelto) {
        this.esDevuelto = esDevuelto;
    }

    public String getPasaporteCliente() {
        return pasaporteCliente;
    }

    public void setPasaporteCliente(String pasaporteCliente) {
        this.pasaporteCliente = pasaporteCliente;
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public int getCategoriaPasaje() {
        return categoriaPasaje;
    }

    public void setCategoriaPasaje(int categoriaPasaje) {
        this.categoriaPasaje = categoriaPasaje;
    }

    public nodoPasaje getSiguiente() {
        return this.siguiente;
    }

    public void setSiguiente(nodoPasaje siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return this.pasaporteCliente + '-' + this.codigoVuelo + "|\n";
    }
    
    
    
    
}
