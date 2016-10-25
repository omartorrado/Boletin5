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
    
//    public void tipo(){
//        if(ventas<=100){
//            System.out.println("Articulo de consumo bajo");
//        }
//        else if(ventas>100&&ventas<=500){
//            System.out.println("Articulo de consumo medio");
//        }
//        else if(ventas>500&&ventas<=1000){
//            System.out.println("Articulo de consumo alto");
//        }
//        else if (ventas>1000){
//            System.out.println("Articulo de primera necesidad");
//        }
//        else System.out.println("Error");
//    }
    //Otra manera de hacerlo
        public void tipo(){
            //le doy un valor a mensaje pq sino puede darse el caso de que no
            //se le llegue a asignar un valor y de error
            String mensaje="consumo";
        if(ventas<=100){
            mensaje="consumo bajo";
        }
        else if(ventas>100&&ventas<=500){
            mensaje="consumo medio";
        }
        else if(ventas>500&&ventas<=1000){
            mensaje="consumo alto";
        }
        else if (ventas>1000){
            mensaje="primera necesidad";
        }
        System.out.println("Es un articulo de "+mensaje);
    }
        //ninguna de las opciones me gusta, se puede hacer mejor. Por ejemplo
        //no contempla que hacer con numeros negativos
}
