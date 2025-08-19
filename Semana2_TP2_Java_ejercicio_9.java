/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana2_tp2_java_ejercicio_9;

import java.util.Scanner;

/**
 *
 * @author jimen
 */
public class Semana2_TP2_Java_ejercicio_9 {

    // Método que calcula el costo de envío
    public static double calcularCostoEnvio(double peso, String zona) {
        double costoEnvio = 0;

        if (zona.equalsIgnoreCase("Nacional")) {
            costoEnvio = peso * 5; // $5 por kg
        } else if (zona.equalsIgnoreCase("Internacional")) {
            costoEnvio = peso * 10; // $10 por kg
        } else {
            System.out.println("Zona inválida. Se asume costo de envío 0.");
        }

        return costoEnvio;
    }

    // Método que calcula el total de la compra
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    // Método principal (main)
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Pedimos los datos al usuario
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scan.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scan.nextDouble();

        scan.nextLine(); // limpiar buffer del Scanner
        System.out.print("Ingrese la zona de envío (Nacional o Internacional): ");
        String zona = scan.nextLine();

        // Calculamos costo de envío
        double costoEnvio = calcularCostoEnvio(peso, zona);

        // Calculamos total
        double total = calcularTotalCompra(precioProducto, costoEnvio);

        // Mostramos resultados
        System.out.println("Costo del producto: $" + precioProducto);
        System.out.println("Costo de envío: $" + costoEnvio);
        System.out.println("Total a pagar: $" + total);

    }
}
