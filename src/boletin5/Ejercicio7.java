/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5;

import javax.swing.JOptionPane;

/**
 *
 * @author otorradomiguez
 */
public class Ejercicio7 {
    
    public void cuadrado(){
        float lado=Float.parseFloat(JOptionPane.showInputDialog("Escriba el valor del lado"));
        JOptionPane.showMessageDialog(null, ("El Area de este cuadrado es "+lado*lado));
    }
    
    public void triangulo(){
        float base=Float.parseFloat(JOptionPane.showInputDialog("Escriba el valor de la base"));
        float altura=Float.parseFloat(JOptionPane.showInputDialog("Escriba el valor de la altura"));
        JOptionPane.showMessageDialog(null, ("El Area de este triangulo es "+(base*altura)/2));
    }
    
    public void circulo(){
        float radio=Float.parseFloat(JOptionPane.showInputDialog("Escriba el valor del radio"));
        JOptionPane.showMessageDialog(null, ("El Area de este circulo es "+radio*radio*3.14));
    }
}
