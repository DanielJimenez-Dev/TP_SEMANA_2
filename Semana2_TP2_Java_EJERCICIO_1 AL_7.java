/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana2_tp2_java;

import java.util.Scanner;

/**
 *
 * @author jimen
 */

public class Semana2_TP2_Java {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Ejercicio 1: Escribe un programa en java que solicite al usuario un año y determine si es bisiesto.
        Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea divisible por 400.
        */
        
        //Scanner input = new Scanner(System.in);
        
        //System.out.println("Ingrese un anio: ");
        //int anio = input.nextInt();
        
        //if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0) ) {
            //System.out.println("El anio " + anio + " es bisiesto.");
        //} else {
            //System.out.println("El anio " + anio + " no es bisiesto. ");
        //}
        
        //----------------------------------------------------------------------------------------
        
        // 2. Ejercicio: determinar el mayor de tres numero. 
        //Escribe un programa en java que pida al ususario tres numero enteros y determine cual es mayor.
        
        //Scanner input = new Scanner(System.in);
        
        //System.out.println("Ingrese el primer numero entero: ");
        //int num1 = input.nextInt();
        
        //System.out.println("Ingrese el segundo numero entero: ");
        //int num2 = input.nextInt();
        
        //System.out.println("Ingrese el tercer numero entero: ");
        //int num3 = input.nextInt();
        
        //int mayor = num1;
        
        //if (num2 > mayor) {
            //mayor = num2;
        //}
        
        //if (num3 > mayor) {
            //mayor = num3;
        //}
        
       // System.out.println("El mayor es: " + mayor);
        
        //----------------------------------------------------------------------
        
        /* 3. Ejercicio:Escribe un programa en java que solicite a usuario su edad 
        y clasifique su etapa de vida segun la siguiente tabla:
        - Menor de 12 años "niño".
        - Entre 12 y 17 años: "Adolecente".
        - Entre 18 y 59 años: "Adulto".
        - 60 Años o mas: "Adulto mayor".
        */
        
        //Scanner input = new Scanner(System.in);
        
        //System.out.println("Ingrese su edad: ");
        //int edad = input.nextInt();
        
        //if (edad < 12) {
            //System.out.println("Es un niño.");
        //} else if (edad >= 12 && edad <= 17) {
            //System.out.println("Es un Adolecente.");
        //} else if (edad >= 18 && edad <= 59) {
            //System.out.println("Es un adulto.");
        //} else { // edad mayor a 60
            //System.out.println("Es un Adulto mayor.");
        //}
        
        //------------------------------------------------------------------------
        
        /*
        4. Ejercicio:Calculadora de Descuento según categoría.
        Escribe un programa que solicite al usuario el precio de un producto y su categoría (A, B o C).
        Luego, aplique los siguientes descuentos:
        Categoría:
        A: 10% de descuento Categoría 
        B: 15% de descuento Categoría 
        C: 20% de descuento
        El programa debe mostrar el precio original, el descuento aplicado y el precio fina
        */
        //Scanner input = new Scanner(System.in);
        
        //System.out.println("Ingrese el precio de producto: ");
        //double precio = input.nextDouble();
        
        //System.out.println("Ingrese la categoria del produto (A, B, C): ");
        //char categoria = input.next().toUpperCase().charAt(0);
        
        //double descuento = 0;
        
        //if (categoria == 'A'){
            //descuento = 0.10;
        //} else if (categoria == 'B') {
            //descuento = 0.15;
        //} else if (categoria == 'C') {
            //descuento = 0.20;
        //} else {
            //System.out.println("ERROR, Categoria invalida..");
        //}
        
        //double precioFinal = precio - (precio * descuento);
        
        //System.out.println("Precio original: " + precio);
        //System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        //System.out.println("Precio final: " + precioFinal);
        
        //------------------------------------------------------------------------
        
        /* 5. Ejercicio: Suma de Números Pares (while).
        Escribe un programa que solicite números al usuario y sume solo los números pares. 
        El ciclo debe continuar hasta que el usuario ingrese el número 0, momento en el que 
        se debe mostrar la suma total de los pares ingresados.
        */
        //Scanner input = new Scanner(System.in);
        
        //int numero;
        //int sumaPares = 0;
        
        //System.out.print("Ingresa un numero (0 para terminar): ");
        //numero = input.nextInt();
        
        //while (numero != 0){
            //if (numero % 2 == 0) {
                //sumaPares += numero;
            //}
            
            //System.out.print("Ingresa un numero (0 para terminar): ");
            //numero = input.nextInt();
        //}
        //System.out.println("La suma de los numeros pares ingresados es: " + sumaPares);
        
        //-------------------------------------------------------------------------------
        
        /* 6. Ejercicio: Contador de Positivos, Negativos y Ceros (for).
           Escribe un programa que pida al usuario ingresar 10 números enteros 
           y cuente cuántos son positivos, negativos y cuántos son ceros.
        */
        //Scanner input = new Scanner(System.in);
        
        //int positivo = 0;
        //int negativo = 0;
        //int cero = 0;
        
        //for (int i = 1; i <= 10; i++) {
            //System.out.print("Ingrese el numero: " + i + ": ");
            //int numero = input.nextInt();
            
            //if (numero > 0) {
                //positivo++;
            //} else if (numero < 0) {
                //negativo ++;
            //} else {
                //cero++;
            //}
        //}
        //System.out.println("Cantidad de numeros positivos: " + positivo);
        //System.out.println("Cantidad de numeros negativos: " + negativo);
        //System.out.println("Cantidad de numeros ceros: " + cero);
        
        //-----------------------------------------------------------------------------
        
        /* 7. Ejercicio: 
        Validación de Nota entre 0 y 10 (do-while).
        Escribe un programa que solicite al usuario una nota entre 0 y 10. 
        Si el usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota 
        hasta que ingrese un valor válido.
        */
        
        //Scanner input = new Scanner(System.in);
        
        //int nota;
        
        //do {
            //System.out.print("Ingresa una nota ente 0 y 10: ");
            //nota = input.nextInt();
            
            //if (nota < 0 || nota > 10) {
                //System.out.println("Error nota invalida. Intente de nuevo: ");
            //}
            
        
        //} while (nota < 0 || nota > 10);
        
        //System.out.println(" La nota ingresa es valida: " + nota);
        
        //------------------------------------------------------------------------
        
    }
    
}
