/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sistemaAutogestion;

/**
 *
 * @author Administrator
 */
public interface IListaPasaje {
    
    public void agregarInicio(String PasaporteCliente, String codigoVuelo, int categoriaPasaje);
    public void mostrarPasajesDevueltos();
    int cantidadElementos ();
    boolean existeElemento (String PasaporteCliente , String codigoVuelo);
    nodoPasaje obtenerElemento(String PasaporteCliente);
    void eliminarElemento (String PasaporteCliente);
    void agregarFinal (String PasaporteCliente, String codigoVuelo, int categoriaPasaje);
    public boolean esVacia();
    public boolean esLLena();  // agregado para lista con tope
    void vaciar();
    void eliminarInicio();
    void eliminarFinal();
    void devolverPasaje(String pasaporteCliente , String codigoVuelo);
    
}
