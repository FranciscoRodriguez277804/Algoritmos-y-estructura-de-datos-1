/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaAutogestion;

/**
 *
 * @author Administrator
 */
public class ListaCliente implements IListaCliente {
    
    nodoCliente primero;
    nodoCliente ultimo;
    int contadornodos;
    int limite;

    public ListaCliente() {
        this.primero = null;
        this.ultimo = null;
        this.contadornodos = 0;
        this.limite = 0;

    }

    public nodoCliente getPrimero() {
        return primero;
    }

    public void setPrimero(nodoCliente primero) {
        this.primero = primero;
    }

    public nodoCliente getUltimo() {
        return ultimo;
    }

    public void setUltimo(nodoCliente ultimo) {
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

    //    ---------------------------(metodos interface)--------------------------------
    @Override
    public void agregarInicio(String pasaporte, String nombre, int edad) {
        nodoCliente nuevo = new nodoCliente(pasaporte, nombre, edad);
        if (this.esVacia()) {
            this.setPrimero(nuevo);
            this.setUltimo(nuevo);
            this.contadornodos++;

        } else {
            int contador = 0;
            boolean existe = false;
            nodoCliente aux = this.getPrimero();

            while (contador < contadornodos && !existe) {
                if (aux.nombre.equals(pasaporte)) {
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
    public String mostrar(nodoCliente nodoClientePrimero , nodoCliente nodoClienteUltimo) {
        if(this.primero == null) {
            return "";
        } else {
                if(nodoClientePrimero == (nodoClienteUltimo)){
                
                    return nodoClientePrimero.toString();
                    
                } else {
                    
                    return mostrar(nodoClientePrimero.getSiguiente(), nodoClienteUltimo ) + nodoClientePrimero.toString();
                }
        }

    }

    @Override
    public int cantidadElementos() {
        return this.getContadornodos();
    }

    @Override
    public boolean existeElemento(String pasaporte) {

        nodoCliente aux = this.getPrimero();
        boolean encontrado = false;
        while (aux != null && !encontrado) {
            if (pasaporte.equals(aux.pasaporte)) {
                encontrado = true;
            }
            aux = aux.getSiguiente();
        }

        return encontrado;
    }

    @Override
    public nodoCliente obtenerElemento(String pasaporte) {
        nodoCliente aux = this.getPrimero();
        nodoCliente encontrado = null;
        while (aux != null && encontrado == null) {

            if (pasaporte.equals(aux.pasaporte)) {

                encontrado = aux;
            }
            aux = aux.getSiguiente();
        }
        return encontrado;
    }

    @Override
    public void eliminarElemento(String pasaporte) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }

    @Override
    public void agregarFinal(String pasaporte, String nombre, int edad) {
        nodoCliente nuevo = new nodoCliente(pasaporte, nombre, edad);
        if (this.esVacia()) {
            this.setPrimero(nuevo);
            this.setUltimo(nuevo);
        } else {
            nodoCliente aux = this.getPrimero();
            while (aux.siguiente != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            this.setUltimo(nuevo);
        }
        this.contadornodos++;
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
    
    
}
