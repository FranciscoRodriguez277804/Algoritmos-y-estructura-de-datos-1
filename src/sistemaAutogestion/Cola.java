/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaAutogestion;

/**
 *
 * @author Administrator
 */
public class Cola implements ICola{
    nodo frente;
    nodo fondo;
    int maximoAceptado;
    int contadorNodos; 

    public Cola(int maximoAceptado) {
        this.frente = null;
        this.fondo = null;
        this.maximoAceptado = maximoAceptado;
        this.contadorNodos = 0;
    }

    public nodo getFrente() {
        return frente;
    }

    public void setFrente(nodo frente) {
        this.frente = frente;
    }

    public nodo getFondo() {
        return fondo;
    }

    public void setFondo(nodo fondo) {
        this.fondo = fondo;
    }

    public int getMaximoAceptado() {
        return maximoAceptado;
    }

    public void setMaximoAceptado(int maximoAceptado) {
        this.maximoAceptado = maximoAceptado;
    }

    public int getContadorNodos() {
        return contadorNodos;
    }

    public void setContadorNodos(int contadorNodos) {
        this.contadorNodos = contadorNodos;
    }

    
    
    @Override
    public boolean esVacia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean esLLena() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void encolar(int dato) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Desencolar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public nodo frente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public nodo fondo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
