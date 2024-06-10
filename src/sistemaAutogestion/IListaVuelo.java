/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sistemaAutogestion;

/**
 *
 * @author Administrator
 */
public interface IListaVuelo {
    
    public void agregarInicio(String codigoVuelo, String aerolinea, String codAvion, String paisDestino, int dia, int mes, int año, int cantPasajesEcon, int cantPasajesPClase);
    public void mostrar();
    int cantidadElementos ();
    boolean existeElemento (String codigoDeVuelo); 
    nodoVuelo obtenerElemento(String codigoDeVuelo);
    void eliminarElemento (int elemento);
    void agregarFinal (int identificador, String nombre);
    public boolean esVacia();
    public boolean esLLena();  // agregado para lista con tope
    void vaciar();
    void eliminarInicio();
    void eliminarFinal();
    
    boolean fechaDeVuelo(int dia, int mes, int ano);
    
    public void mostrarPasajesDevueltos(String aerolinea);
    
//    public String mostarVuelosDeCliente(nodoVuelo vueloPrimero , nodoVuelo vueloUltimo, String Pasaporte);
}
