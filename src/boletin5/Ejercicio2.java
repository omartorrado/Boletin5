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
public class Ejercicio2 {
    Scanner sc1=new Scanner(System.in);
    
    public void e2(){
        short n1=sc1.nextShort(); short n2=sc1.nextShort();
        if (n1>=n2){
            System.out.println("La resta es "+(n1-n2));
        }
        System.out.println("La suma es "+(n1+n2));
    }
}
