/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases03;

public class Ejecutable {
    public static void main(String[] args) {
        // Se crea un objeto
        Computadora computadoraPersonal = new Computadora(16.2);
        Computadora computadoraPersona2 = new Computadora("Ryzen 7 5800");
        Computadora computadoraPersona3 = new Computadora("Intel Core i9", 16.2);

        computadoraPersonal.establecerTipoProcesador("Ryzen");
        // Se presenta valores en pantalla, rescatando los valores
        // que se necesita a través de los métodos obtener del
        // objeto 
        
        System.out.printf("Computadora\n"
                + "Procesador: %s\n"
                + "Memoria: %.2f GB\n", 
                computadoraPersonal.obtenerTipoProcesador(),
                computadoraPersonal.obtenerMemoria());
        
        System.out.println("**********************");
        
        computadoraPersona2.establecerMemoria(16.2);
        System.out.printf("Computadora\n"
                + "Procesador: %s\n"
                + "Memoria: %.2f GB\n", 
                computadoraPersona2.obtenerTipoProcesador(),
                computadoraPersona2.obtenerMemoria());
        
        System.out.println("**********************");
        
        System.out.printf("Computadora\n"
                + "Procesador: %s\n"
                + "Memoria: %.2f GB\n", 
                computadoraPersona3.obtenerTipoProcesador(),
                computadoraPersona3.obtenerMemoria());
    }
}
