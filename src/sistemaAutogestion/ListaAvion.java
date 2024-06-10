/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaAutogestion;

/**
 *
 * @author Administrator
 */
public class ListaAvion implements IListaAvion {

    nodoAvion primero;
    nodoAvion ultimo;
    ListaVuelo LisVuelosDeAvion;
    int contadornodos;
    int limite;

    public ListaAvion() {
        this.primero = null;
        this.ultimo = null;
        this.contadornodos = 0;
        this.limite = 0;
        LisVuelosDeAvion = new ListaVuelo();
    }

    public ListaVuelo getLisVuelos() {
        return LisVuelosDeAvion;
    }

    public void setLisVuelos(ListaVuelo LisVuelos) {
        this.LisVuelosDeAvion = LisVuelos;
    }

    public nodoAvion getPrimero() {
        return primero;
    }

    public void setPrimero(nodoAvion primero) {
        this.primero = primero;
    }

    public nodoAvion getUltimo() {
        return ultimo;
    }

    public void setUltimo(nodoAvion ultimo) {
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
    public void agregarInicio(String cod, int capacidad, String nombreAerolinea) {
        nodoAvion nuevo = new nodoAvion(cod, capacidad, nombreAerolinea);
        if (this.esVacia()) {
            this.setPrimero(nuevo);
            this.setUltimo(nuevo);
            this.contadornodos++;
        } else {
            int contador = 0;
            boolean existe = false;
            nodoAvion aux = this.getPrimero();

            while (contador < contadornodos && !existe) {
                if (aux.codigo.equals(cod)) {
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
        nodoAvion aux = this.getPrimero();
        while (aux != null) {
            System.out.print(aux.getCodigo() + "\n");
            aux = aux.getSiguiente();
        }
    }

    @Override
    public int cantidadElementos() {
        return this.getContadornodos();
    }

    @Override
    public boolean existeElemento(String cod) {
        nodoAvion aux = this.getPrimero();
        boolean encontrado = false;
        while (aux != null && !encontrado) {
            if (cod.equals(aux.codigo)) {
                encontrado = true;
            }
            aux = aux.getSiguiente();
        }

        return encontrado;
    }

    @Override
    public nodoAvion obtenerElemento(String cod) {
        nodoAvion aux = this.getPrimero();
        nodoAvion encontrado = null;
        while (aux != null && encontrado == null) {
            if (cod.equals(aux.codigo)) {
                encontrado = aux;
            }
            aux = aux.getSiguiente();
        }

        return encontrado;
    }

    @Override
    public void eliminarElemento(String cod) {
        nodoAvion aux = this.getPrimero();
        if (!this.esVacia()) {
            if (aux.codigo.equals(cod)) {
                this.eliminarInicio();
            } else {
                nodoAvion anterior = primero;

                while (aux != null && aux.codigo != cod) {
                    anterior = aux;
                    aux = aux.siguiente;
                }
                if (aux == this.getUltimo()) {
                    anterior.siguiente = aux.siguiente;
                    this.setUltimo(anterior);
                    contadornodos--;
                } else {
                    anterior.siguiente = aux.siguiente;
                    contadornodos--;
                }
            }
        }
    }

    @Override
    public void agregarFinal(String cod, int capacidad, String nombreAerolinea) {
        nodoAvion nuevo = new nodoAvion(cod, capacidad, nombreAerolinea);
        if (this.esVacia()) {
            this.setPrimero(nuevo);
            this.setUltimo(nuevo);

        } else {
            nodoAvion aux = this.getPrimero();
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
        if (!this.esVacia()) {
            if (this.primero == this.ultimo) {
                this.primero = null;
                this.ultimo = null;
            } else {
                this.primero = this.primero.siguiente;
            }
            this.contadornodos--;
        }
    }

    @Override
    public void eliminarFinal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public String toString() {
        return ""; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
