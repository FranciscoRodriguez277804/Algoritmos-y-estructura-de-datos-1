/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sistemaAutogestion;

/**
 *
 * @author Administrator
 */
public interface IListaAerolinea {
    
    public void agregarInicio(String nom , String pais , int cantMaxAviones);
    public void mostrar();
    int cantidadElementos ();
    boolean existeElemento (String nom);
    nodoAerolinea obtenerElemento(String nom);
    void eliminarElemento (String nom);
    void agregarFinal (String nom, String pais, int cantMaxAviones );
    public boolean esVacia();
    public boolean esLLena();  // agregado para lista con tope
    void vaciar();
    void eliminarInicio();
    void eliminarFinal();
}
