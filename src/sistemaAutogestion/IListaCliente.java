/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sistemaAutogestion;

/**
 *
 * @author Administrator
 */
public interface IListaCliente {
    
    public void agregarInicio(String pasaporte, String nombre, int edad);
    public String mostrar(nodoCliente nodoClientePrimero , nodoCliente nodoClienteUltimo);
    int cantidadElementos ();
    boolean existeElemento (String pasaporte);
    nodoCliente obtenerElemento(String pasaporte);
    void eliminarElemento (String pasaporte);
    void agregarFinal (String pasaporte, String nombre, int edad);
    public boolean esVacia();
    public boolean esLLena();  // agregado para lista con tope
    void vaciar();
    void eliminarInicio();
    void eliminarFinal();

}
