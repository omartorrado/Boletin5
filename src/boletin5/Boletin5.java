/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author otorradomiguez
 */
public class Boletin5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int selector=Integer.parseInt(JOptionPane.showInputDialog("Selecciona el ejercicio"));
        switch (selector){
            case 1:
        // Ejercicio 1
        Ejercicio1 e1=new Ejercicio1();
        //Si metemos un int lo pasa a float. Si ponemos 21.3 en lugar de 21,3
        //da error, si no metemos un numero da error tb
        //si escribimos ,56 funciona
        e1.positivo();
            case 2:
        //Ejercicio2
        Ejercicio2 e2=new Ejercicio2();
        e2.e2();
            case 3:
        //Ejercicio3
        Ejercicio3 e3=new Ejercicio3();
        e3.e3();
            case 4:
        //Ejercicio4
        //Revisar para comparar dos objetos persona que contengan nombre y peso
    //    Ejercicio4 e4=new Ejercicio4("Miguel","Paco",58,72);
    //    e4.e4();
    //    Ejercicio4 e4_1=new Ejercicio4("Miguel","Paco",88,72);
    //    e4_1.e4();
    //    Ejercicio4 e4_2=new Ejercicio4("Miguel","Paco",60,60);
    //    e4_2.e4();
        
        //Ejercicio4 Mejor diseñado
        Ejercicio4 e4_1=new Ejercicio4("Miguel", 70);
        Ejercicio4 e4_2=new Ejercicio4("Pablo", 80);
        e4_1.Comp(e4_2);
        e4_2.Comp(e4_1);
        Ejercicio4 e4_3=new Ejercicio4("Juan",80);
        e4_2.Comp(e4_3);
            case 5:
        //Ejercicio5
        Ejercicio5 e5=new Ejercicio5();
        e5.e5(5, 7, 9);
        e5.e5(-9, 8, 7);
        e5.e5(5, 8, 5);
            case 6:
        //Ejercicio6
        Ejercicio6 e6=new Ejercicio6("Cerveza",94);
        e6.tipo();
        Ejercicio6 e6_1=new Ejercicio6("Vino",400);
        e6_1.tipo();
            case 7:
        //Ejercicio7
        int n=0;
        JFrame frame=new JFrame();
        JButton b1=new JButton();
        frame.
        
        switch (n){
            case 1:
        }
      }
    }
}

    

