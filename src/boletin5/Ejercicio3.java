/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5;

import java.util.Scanner;

/**
 *
 * @author otorradomiguez
 */
public class Ejercicio3 {
    Scanner sc1= new Scanner(System.in);
    
    public void e3(){
        float n=sc1.nextFloat();
        if (n>0){
            System.out.println("+");
        }
        else{
            if (n==0){
                System.out.println("0");
            }            
            else{
                System.out.println("-");
            }
        }
    }
}
