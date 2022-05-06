/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases03;

public class Computadora {
    private String tipoProcesador;
    private double memoria;
    
    // métodos establecer para cada atributo
    public Computadora(double cen){
        memoria = cen;
    }
    public Computadora(String com){
        tipoProcesador = com;
    }
    public Computadora(String cum, double cum2){
        tipoProcesador = cum;
        memoria = cum2;
    }
    public void establecerTipoProcesador(String n){
        tipoProcesador = n;
    }
    
    public void establecerMemoria(double n){
        memoria = n;
    }
    
    public String obtenerTipoProcesador(){
        return tipoProcesador;
    }
    
    public double obtenerMemoria(){
        return memoria;
    }
    
}
