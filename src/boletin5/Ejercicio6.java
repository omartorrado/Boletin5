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
public class Ejercicio6 {
    String nombre;
    int ventas;
    
    public Ejercicio6(String n,int v){
        nombre=n; ventas=v;
    }
    
    public void tipo(){
        if(ventas<=100){
            System.out.println("Articulo de consumo bajo");
        }
        else if(ventas>100&&ventas<=500){
            System.out.println("Articulo de consumo medio");
        }
        else if(ventas>500&&ventas<=1000){
            System.out.println("Articulo de consumo alto");
        }
        else if (ventas>1000){
            System.out.println("Articulo de primera necesidad");
        }
        else System.out.println("Error");
    }
}
