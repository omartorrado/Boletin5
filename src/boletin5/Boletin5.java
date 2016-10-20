/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5;

/**
 *
 * @author otorradomiguez
 */
public class Boletin5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 1
        Ejercicio1 e1=new Ejercicio1();
        //Si metemos un int lo pasa a float. Si ponemos 21.3 en lugar de 21,3
        //da error, si no metemos un numero da error tb
        //si escribimos ,56 funciona
        e1.positivo();
        
        //Ejercicio2
        Ejercicio2 e2=new Ejercicio2();
        e2.e2();
    }
    
}
