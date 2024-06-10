/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaAutogestion;

/**
 *
 * @author Administrator
 */
public class ListaPasaje implements IListaPasaje {
    
    nodoPasaje primero;
    nodoPasaje ultimo;
    int contadornodos;
    int limite;

    public ListaPasaje() {
        this.primero = null;
        this.ultimo = null;
        this.contadornodos = 0;
        this.limite = 0;
    }

    public nodoPasaje getPrimero() {
        return primero;
    }

    public void setPrimero(nodoPasaje primero) {
        this.primero = primero;
    }

    public nodoPasaje getUltimo() {
        return ultimo;
    }

    public void setUltimo(nodoPasaje ultimo) {
        this.ultimo = ultimo;
    }

    public int getContadornodos() {
        return contadornodos;
    }

    public void setContadornodos(int contadornodos) {
        this.contadornodos = contadornodos;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    @Override
    public void agregarInicio(String PasaporteCliente, String codigoVuelo, int categoriaPasaje) {
    nodoPasaje nuevo = new nodoPasaje(PasaporteCliente, codigoVuelo, categoriaPasaje);
        if (this.esVacia()) {
            this.setPrimero(nuevo);
            this.setUltimo(nuevo);
            this.contadornodos++;

        } else {
            int contador = 0;
            boolean existe = false;
            nodoPasaje aux = this.getPrimero();

            while (contador < contadornodos && !existe) {
                if (aux.pasaporteCliente.equals(PasaporteCliente) && aux.codigoVuelo.equals(codigoVuelo)) { 
                    existe = true;
                }
                contador++;
                aux = aux.getSiguiente();
            }

            if (!existe) {
                nuevo.setSiguiente(primero);
                this.primero = nuevo;
                this.contadornodos++;
            }

        }

        
    }

    @Override
    public void mostrarPasajesDevueltos() {
        nodoPasaje nodoAux = this.getPrimero();
        
        while(nodoAux != null){
            if(nodoAux.getEsDevuelto()){
                
                System.out.println(nodoAux);
                
            }
        }
        
    }

    @Override
    public int cantidadElementos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean existeElemento(String PasaporteCliente , String codigoVuelo) {
       nodoPasaje aux = this.getPrimero();
        boolean encontrado = false;
        while (aux != null && !encontrado) {
            if (PasaporteCliente.equals(aux.pasaporteCliente) && codigoVuelo.equals(aux.codigoVuelo)) {
                encontrado = true;
            }
            aux = aux.getSiguiente();
        }

        return encontrado;
    }

    @Override
    public nodoPasaje obtenerElemento(String PasaporteCliente) {
       
        nodoPasaje aux = this.getPrimero();
        nodoPasaje encontrado = null;
        while (aux != null && encontrado == null) {
            if (PasaporteCliente.equals(aux.pasaporteCliente)) {
                encontrado = aux;
            }
            aux = aux.getSiguiente();
        }

        return encontrado;
    }
    
    @Override
    public void eliminarElemento(String PasaporteCliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void agregarFinal(String PasaporteCliente, String codigoVuelo, int categoriaPasaje) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean esVacia() {
        return this.getPrimero() == null;
    }

    @Override
    public boolean esLLena() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void vaciar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarInicio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarFinal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void devolverPasaje(String pasaporteCliente, String codigoVuelo) {
        
        nodoPasaje nodoAuxPasaje = this.getPrimero();
        
        while(nodoAuxPasaje != null){
            
            if ((nodoAuxPasaje.getCodigoVuelo().equals(codigoVuelo)) && (nodoAuxPasaje.getPasaporteCliente().equals(pasaporteCliente))) {
                
                nodoAuxPasaje.setEsDevuelto(true);
            }
            
            nodoAuxPasaje = nodoAuxPasaje.getSiguiente();
        }
        
        
    }

    
}
    
   