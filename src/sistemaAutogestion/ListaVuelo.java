/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaAutogestion;

/**
 *
 * @author Administrator
 */
public class ListaVuelo implements IListaVuelo {
    
    nodoVuelo primero;
    nodoVuelo ultimo;
    ListaPasaje ListaPasajesVuelo;
    int contadornodos;
    int limite;
    

    public ListaVuelo() {
        this.primero = null;
        this.ultimo = null;
        this.ListaPasajesVuelo = new ListaPasaje();
        this.contadornodos = 0;
        this.limite = 0;
        
    }

    public ListaPasaje getListaPasajesVuelo() {
        return ListaPasajesVuelo;
    }

    public void setListaPasajesVuelo(ListaPasaje ListaPasajesVuelo) {
        this.ListaPasajesVuelo = ListaPasajesVuelo;
    }

    
    public nodoVuelo getPrimero() {
        return primero;
    }

    public void setPrimero(nodoVuelo primero) {
        this.primero = primero;
    }

    public nodoVuelo getUltimo() {
        return ultimo;
    }

    public void setUltimo(nodoVuelo ultimo) {
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
    public void agregarInicio(String codigoVuelo, String aerolinea, String codAvion, String paisDestino, int dia, int mes, int año, int cantPasajesEcon, int cantPasajesPClase) {
        nodoVuelo nuevo = new nodoVuelo(codigoVuelo,aerolinea,codAvion,paisDestino,dia,mes,año,cantPasajesEcon,cantPasajesPClase);
        if (this.esVacia()) {
            this.setPrimero(nuevo);
            this.setUltimo(nuevo);
            this.contadornodos++;

        } else {
            int contador = 0;
            boolean existe = false;
            nodoVuelo aux = this.getPrimero();

            while (contador < contadornodos && !existe) {
                if (aux.codigoVuelo.equals(codigoVuelo)) {
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
    public void mostrar() {
          nodoVuelo aux = this.getPrimero();
        while (aux != null) {
            System.out.print(aux.getCodigoVuelo()+ aux.getAreolinea()+ aux.getCodAvion()+ aux.getCantPasajesEco()+ aux.getCantPasajesPClase() + "\n");
            aux = aux.getSiguiente();
        }
    }

    @Override
    public int cantidadElementos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean existeElemento(String codigoDeVuelo) {
        nodoVuelo aux = this.getPrimero();
        boolean encontrado = false;
        while (aux != null && !encontrado) {
            if (codigoDeVuelo.equals(aux.codigoVuelo)) {
                encontrado = true;
            }
            aux = aux.getSiguiente();
        }

        return encontrado;
    }

    @Override
    public nodoVuelo obtenerElemento(String codigoDeVuelo) {
        nodoVuelo aux = this.getPrimero();
        nodoVuelo encontrado = null;
        while (aux != null && encontrado == null) {

            if (codigoDeVuelo.equals(aux.codigoVuelo)) {

                encontrado = aux;
            }
            aux = aux.getSiguiente();
        }
        return encontrado;
    }

    @Override
    public void eliminarElemento(int elemento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void agregarFinal(int identificador, String nombre) {
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
    public boolean fechaDeVuelo(int dia, int mes, int ano) {
        nodoVuelo aux = this.getPrimero();
        boolean encontrado = false;
        while (aux != null && !encontrado) {
            if (dia == aux.dia && mes == aux.mes && aux.año == ano) {
                
                encontrado = true;
            }
            aux = aux.getSiguiente();
        }

        return encontrado;
    }
    

@Override
    public void mostrarPasajesDevueltos(String aerolinea) {
        nodoVuelo nodoAuxVuelo = this.getPrimero();
        while(nodoAuxVuelo != null) {
            
            if(nodoAuxVuelo.getAreolinea().equals(aerolinea)){
                nodoPasaje nodoAuxPasaje = this.getListaPasajesVuelo().getPrimero();
                while(nodoAuxPasaje != null){
                    
                    if(nodoAuxPasaje.getCodigoVuelo().equals(nodoAuxVuelo.getCodigoVuelo())){
                        if(nodoAuxPasaje.getEsDevuelto()){
                    
                            System.out.println(nodoAuxPasaje);
                        }
                   
                    }
            nodoAuxPasaje = nodoAuxPasaje.getSiguiente();
                }
            }
          nodoAuxVuelo = nodoAuxVuelo.getSiguiente();
        }
    }
    
    
}
