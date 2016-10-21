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
public class Ejercicio5 {
    
    public void e5(int a, int b, int c){
        if(a!=b&&a!=c&&b!=c){
            if(a>b&&a>c){
                System.out.println(a+" es el mayor");
            }
            else if(b>a&&b>c){
                System.out.println(b+" es el mayor");
            }
            else if(c>b&&c>a){
                System.out.println(c+" es el mayor");
            }
        }
        else{
            System.out.println("Los numeros deben ser diferentes");
        }
    }
    
}
