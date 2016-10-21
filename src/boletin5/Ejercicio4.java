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
public class Ejercicio4 {
//    String nombre1,nombre2;
//    float peso1,peso2;
//    
//    public Ejercicio4(){
//
//}
//    public Ejercicio4(String a, String b, float c, float d){
//        nombre1=a; nombre2=b;
//        peso1=c; peso2=d;
//    }
//    
//    public void e4(){
//        if (peso1>peso2){
//            float diferencia=peso1-peso2;
//            System.out.println(nombre1+" pesa "+peso1+"Kg, "+diferencia+"Kg mas que "+nombre2);
//        }
//        else{
//            if(peso2>peso1){
//                float diferencia=peso2-peso1;
//                System.out.println(nombre2+" pesa "+peso2+"Kg, "+diferencia+"Kg mas que "+nombre1);
//            }
//            else System.out.println(nombre1+" y "+nombre2+" pesan lo mismo");
//        }
//    }
    String nombre;
    float peso;
    
    public Ejercicio4(String a,float b){
        nombre=a; peso= b;
    }
    
    public void Comp(Ejercicio4 b){
        if(this.peso>b.peso){
            float dif=this.peso-b.peso;
            System.out.println(this.nombre+" pesa "+this.peso+"Kg, "+dif+"Kg mas que "+b.nombre);
        }
        else if (b.peso>this.peso){
            float dif=b.peso-this.peso;
            System.out.println(b.nombre+" pesa "+b.peso+"Kg, "+dif+"Kg mas que "+this.nombre);
        }
        else System.out.println("Ambos pesan lo mismo");
    }
}
