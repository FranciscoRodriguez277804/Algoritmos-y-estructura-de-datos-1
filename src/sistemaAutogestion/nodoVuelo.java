/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaAutogestion;

/**
 *
 * @author Administrator
 */
public class nodoVuelo {
 String codigoVuelo ;
 String areolinea;
 String codAvion;
 String paisDestion;
 int dia;
 int mes;
 int año;
 int cantPasajesEco;
 int cantPasajesPClase;
 int dispoibilidad;
 nodoVuelo siguiente;

    public nodoVuelo(String codigoVuelo, String areolinea, String codAvion, String paisDestion, int dia, int mes, int año, int cantPasajesEco, int cantPasajesPClase) {
        this.codigoVuelo = codigoVuelo;
        this.areolinea = areolinea;
        this.codAvion = codAvion;
        this.paisDestion = paisDestion;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.cantPasajesEco = cantPasajesEco;
        this.cantPasajesPClase = cantPasajesPClase;
        this.siguiente = null;
   
    }

    public int getDispoibilidad() {
        return this.cantPasajesEco + this.cantPasajesPClase;
    }

    public void setDispoibilidad(int dispoibilidad) {
        this.dispoibilidad = dispoibilidad;
    }
     
    
    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public String getAreolinea() {
        return areolinea;
    }

    public void setAreolinea(String areolinea) {
        this.areolinea = areolinea;
    }

    public String getCodAvion() {
        return codAvion;
    }

    public void setCodAvion(String codAvion) {
        this.codAvion = codAvion;
    }

    public String getPaisDestion() {
        return paisDestion;
    }

    public void setPaisDestion(String paisDestion) {
        this.paisDestion = paisDestion;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getCantPasajesEco() {
        return cantPasajesEco;
    }

    public void setCantPasajesEco(int cantPasajesEco) {
        this.cantPasajesEco = cantPasajesEco;
    }

    public int getCantPasajesPClase() {
        return cantPasajesPClase;
    }

    public void setCantPasajesPClase(int cantPasajesPClase) {
        this.cantPasajesPClase = cantPasajesPClase;
    }

    public nodoVuelo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodoVuelo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return this.getCodigoVuelo() + "-" + this.getAreolinea()+ "-" + this.getCodAvion() + "-" + 
            this.getCantPasajesEco() + "-" + this.getCantPasajesPClase() +  "-" + this.getDispoibilidad() ; 
    }
 
    

    
    
    
}
