/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sistemaAutogestion;

/**
 *
 * @author Administrator
 *
 *
 */
public interface IListaAvion {

    public void agregarInicio(String cod, int capacidad , String nombreAerolinea);

    public void mostrar();

    int cantidadElementos();

    boolean existeElemento(String cod);

    nodoAvion obtenerElemento(String nom);

    void eliminarElemento(String nom);

    void agregarFinal(String cod, int capacidad, String nombreAerolinea);

    public boolean esVacia();

    public boolean esLLena();  // agregado para lista con tope

    void vaciar();

    void eliminarInicio();

    void eliminarFinal();
}
