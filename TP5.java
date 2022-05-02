/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myprueba.tp5;

/**
 *
 * @author Manuel Belgrano Nº3
 */
public class TP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arreglo a1 = new Arreglo();
        System.out.println("Cuenta Caracteres:");
        Arreglo.cuentaCaracter("Maximiliano",'i');
        System.out.println("******************************");
        
        System.out.println("Cuenta Vocales:");
        Arreglo.contarVocales("Maximiliano");
        System.out.println("******************************");
        
        System.out.println("Suma Lista de Arreglos:");
        int[] lista = {2,3,4};
        Arreglo.sumarLista(lista);
         System.out.println("******************************");
         
         System.out.println("Buscar Mayor y menor: ");
         Arreglo.buscarMayor(args);
    }
    
}
