/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.operaciones;

public class Vector {
    
 public static void main(String[] args) {
        int[] vector = new int[4]; 

       
        vector[0] = 2;
        vector[1] = 35;
        vector[2] = 48;
        vector[3] = 157;

        System.out.println("Elementos del vector:");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Elemento " + i + ": " + vector[i]);
        }

        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];
        }
        System.out.println("La suma de los elementos del vector es: " + suma);
    }
}
    
