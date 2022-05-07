/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myprueba.tp5;

import java.util.Scanner;

/**
 *
 * @author NEXO-MAX
 */
public class Arreglo {
//Constructor
    public Arreglo() {
    }
    
   

     public static void sumarLista(int [] a){
      int suma = 0;
      
        for (int i = 0; i < a.length; i++) {
            suma += suma+ a[i];
        }
        System.out.println("El total de la lista es: " + suma);
        
         System.out.println("El promedio total es:"+ (suma/a.length));
        
    }
     
     public static void buscarMayor(String [] args){
         Scanner lector = new Scanner(System.in);
         System.out.println("Ingrese el numero de elementos: ");
         int n=lector.nextInt();
         int [] Arreglo = new int [n];
         
         for (int i = 0; i < n; i++) {
             Arreglo[i] = lector.nextInt();
             
         }
         int menor,mayor;
         menor=mayor=Arreglo[0];
         for (int j = 1; j < n; j++) {
             if(Arreglo[j]<mayor){
                 mayor = Arreglo[j];
             }
             if (Arreglo[j]<menor){
                 menor=Arreglo[j];
             }
         }
         System.out.println("Elemento mayor: " + mayor);
         System.out.println("Elemento menor: "+ menor);
     }
     
      public static void cuentaCaracter(String letra,char carac){
        int num = 0;
        
        for (int i = 0; i < letra.length(); i++) {
            if(letra.charAt(i)==carac){
              num++;  
            }
        }
        
        System.out.println("Cantidad de letras "+ carac +": "+ num);
    }
    
     public static void contarVocales(String string){
        int num = 0;
        
        
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i)=='a'){
              num++;  
            }
            if(string.charAt(i)=='e'){
              num++;  
            }
            if(string.charAt(i)=='i'){
              num++;  
            }
            if(string.charAt(i)=='o'){
              num++;  
            }
            if(string.charAt(i)=='u'){
              num++;  
            }
        }
        
        System.out.println("Cantidad de vocales: "+ num);
    }
}
