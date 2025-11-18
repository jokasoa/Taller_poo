
public class TiendaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== REGISTRO DE PRODUCTOS ===");
        Producto[] productos = new Producto[2];
        double totalGeneral = 0;

        for (int i = 0; i < 2; i++) {
            System.out.println("\nProducto #" + (i + 1));
            
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            
            System.out.print("Precio: ");
            double precio = sc.nextDouble();
            
            System.out.print("Cantidad: ");
            int cantidad = sc.nextInt();
            sc.nextLine(); // Limpia buffer

            productos[i] = new Producto(nombre, precio, cantidad);
        }

        System.out.println("\n=== RESUMEN DE INVENTARIO ===");
        for (Producto p : productos) {
            p.mostrarInfo();
            totalGeneral += p.calcularTotal();
        }

        System.out.println("\nTOTAL GENERAL DEL INVENTARIO: $" + totalGeneral);
    }
}
