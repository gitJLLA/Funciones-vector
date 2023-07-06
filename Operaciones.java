/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.operaciones;

public class Operaciones {

public static int sumar(int a, int b) {
        return a + b;
    }
    
    public static int restar(int a, int b) {
        return a - b;
    }
    
    public static int multiplicar(int a, int b) {
        return a * b;
    }
    
    public static double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }
    }
    
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 10;
        
        int resultadoSuma = sumar(num1, num2);
        int resultadoResta = restar(num1, num2);
        int resultadoMultiplicacion = multiplicar(num1, num2);
        double resultadoDivision = dividir(num1, num2);
        
        System.out.println("Suma: " + resultadoSuma);
        System.out.println("Resta: " + resultadoResta);
        System.out.println("Multiplicación: " + resultadoMultiplicacion);
        System.out.println("División: " + resultadoDivision);
    }
}
