/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaAutogestion;

/**
 *
 * @author Administrator
 */
public class ListaAerolinea implements IListaAerolinea {

    nodoAerolinea primero;
    nodoAerolinea ultimo;
    ListaAvion LisAvionesDeAerolinea;
    ListaPasaje LisPasajesDeAerolinea;
    int contadornodos;
    int limite;

    public ListaAerolinea() {
        this.primero = null;
        this.ultimo = null;
        this.contadornodos = 0;
        this.limite = 0;
        this.LisAvionesDeAerolinea = new ListaAvion();
        this.LisPasajesDeAerolinea = new ListaPasaje();

    }

    public ListaPasaje getLisPasajesDeAerlinea() {
        return LisPasajesDeAerolinea;
    }

    public void setLisPasajesDeAerlinea(ListaPasaje LisPasajesDeAerlinea) {
        this.LisPasajesDeAerolinea = LisPasajesDeAerlinea;
    }

    public ListaAvion getLisAvionesDeAerolinea() {
        return LisAvionesDeAerolinea;
    }

    public void setLisAvionesDeAerolinea(ListaAvion LisAvionesDeAerolinea) {
        this.LisAvionesDeAerolinea = LisAvionesDeAerolinea;
    }


    public nodoAerolinea getPrimero() {
        return primero;
    }

    public void setPrimero(nodoAerolinea primero) {
        this.primero = primero;
    }

    public nodoAerolinea getUltimo() {
        return ultimo;
    }

    public void setUltimo(nodoAerolinea ultimo) {
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
    public void agregarInicio(String nom, String pais, int cantMaxAviones) {
        nodoAerolinea nuevo = new nodoAerolinea(nom, pais, cantMaxAviones);
        if (this.esVacia()) {
            this.setPrimero(nuevo);
            this.setUltimo(nuevo);
            this.contadornodos++;

        } else {
            int contador = 0;
            boolean existe = false;
            nodoAerolinea aux = this.getPrimero();

            while (contador < contadornodos && !existe) {
                if (aux.nombre.equals(nom)) {
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
        nodoAerolinea aux = this.getPrimero();
        while (aux != null) {
            System.out.print(aux.getNombre()  + "\n");
            aux = aux.getSiguiente();
        }

    }

    @Override
    public int cantidadElementos() {
        return this.getContadornodos();
    }

    @Override
    public boolean existeElemento(String nom) {

        nodoAerolinea aux = this.getPrimero();
        boolean encontrado = false;
        while (aux != null && !encontrado) {
            if (nom.equals(aux.nombre)) {
                encontrado = true;
            }
            aux = aux.getSiguiente();
        }

        return encontrado;
    }

    @Override
    public nodoAerolinea obtenerElemento(String nom) {
        nodoAerolinea aux = this.getPrimero();
        nodoAerolinea encontrado = null;
        while (aux != null && encontrado == null) {
            if (nom.equals(aux.nombre)) {
                encontrado = aux;
            }
            aux = aux.getSiguiente();
        }

        return encontrado;
    }

    // pre: el elemento existe
    @Override
    public void eliminarElemento(String nom) {
        nodoAerolinea aux = this.getPrimero();
        if (!this.esVacia()) {
            if (aux.nombre.equals(nom)) {
                this.eliminarInicio();
            } else {
                nodoAerolinea anterior = primero;

                while (aux != null && aux.nombre != nom) {
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
    public void agregarFinal(String nom, String pais, int cantMaxAviones) {
        nodoAerolinea nuevo = new nodoAerolinea(nom, pais, cantMaxAviones);
        if (this.esVacia() && this.LisAvionesDeAerolinea.cantidadElementos() <= 0) {
            this.setPrimero(nuevo);
            this.setUltimo(nuevo);
        } else {
            nodoAerolinea aux = this.getPrimero();
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
        }
        this.contadornodos--;
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
