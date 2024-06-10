/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sistemaAutogestion;

/**
 *
 * @author Administrator
 */
public interface ICola {
    public boolean esVacia();
    public boolean esLLena();
    public void encolar(int dato);
    public void Desencolar();
    public nodo frente();
    public nodo fondo();
}
