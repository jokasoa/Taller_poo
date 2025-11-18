
import java.util.Scanner;

public class TiendaEstructurada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre1, nombre2;
        double precio1, precio2;
        int cantidad1, cantidad2;

        System.out.println("=== REGISTRO DE PRODUCTOS (Estructurado) ===");

        // Producto 1
        System.out.print("\nNombre del producto 1: ");
        nombre1 = sc.nextLine();
        System.out.print("Precio: ");
        precio1 = sc.nextDouble();
        System.out.print("Cantidad: ");
        cantidad1 = sc.nextInt();
        sc.nextLine();

        // Producto 2
        System.out.print("\nNombre del producto 2: ");
        nombre2 = sc.nextLine();
        System.out.print("Precio: ");
        precio2 = sc.nextDouble();
        System.out.print("Cantidad: ");
        cantidad2 = sc.nextInt();

        double total1 = precio1 * cantidad1;
        double total2 = precio2 * cantidad2;
        double totalGeneral = total1 + total2;

        System.out.println("\n=== RESUMEN (Estructurado) ===");
        System.out.println("\nProducto 1: " + nombre1);
        System.out.println("Total: $" + total1);

        System.out.println("\nProducto 2: " + nombre2);
        System.out.println("Total: $" + total2);

        System.out.println("\nTOTAL GENERAL: $" + totalGeneral);
    }
}