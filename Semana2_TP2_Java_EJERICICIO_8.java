/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana2_tp2_java_ejercicio_8;

import java.util.Scanner;

/**
 *
 * @author jimen
 */
public class Main {

    //Método que calcula el precio final
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double precioFinal = precioBase + (precioBase * impuesto) - (precioBase * descuento);
        return precioFinal;
    }
    
public class Semana2_TP2_Java_parte_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 8.Ejercicio: 
        
        Scanner scan = new Scanner(System.in);

        // Pedir datos al usuario
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = scan.nextDouble();

        System.out.print("Ingrese el porcentaje de impuesto (%): ");
        double impuesto = scan.nextDouble() / 100; // lo convertimos a decimal

        System.out.print("Ingrese el porcentaje de descuento (%): ");
        double descuento = scan.nextDouble() / 100; // lo convertimos a decimal

        // Llamada al método
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        // Mostrar el resultado
        System.out.println("El precio final del producto es: " + precioFinal);
        
    }
    
    }

}
