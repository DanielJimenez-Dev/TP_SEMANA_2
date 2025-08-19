/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana2_tp2_java_ejercicio_10;

import java.util.Scanner;

/**
 *
 * @author jimen
 */
public class Semana2_TP2_Java_ejercicio_10 {

    // Método que calcula el nuevo stock
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        return nuevoStock;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Pedimos los datos al usuario
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = scan.nextInt();

        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = scan.nextInt();

        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = scan.nextInt();

        // Calculamos el nuevo stock
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

        // Mostramos resultado
        System.out.println("El nuevo stock del producto es: " + nuevoStock);

    }
}
