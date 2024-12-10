package programas;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeNombres {
    public static void main(String[] args) {
        // Crear una lista para almacenar los nombres
        ArrayList<String> nombres = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar el menú
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar un nombre");
            System.out.println("2. Mostrar la lista de nombres");
            System.out.println("3. Eliminar un nombre");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    // Agregar un nombre
                    System.out.print("Ingresa un nombre: ");
                    String nombre = scanner.nextLine();
                    nombres.add(nombre);
                    System.out.println("Nombre agregado.");
                    break;
                case 2:
                    // Mostrar la lista de nombres
                    System.out.println("\nLista de nombres:");
                    for (int i = 0; i < nombres.size(); i++) {
                        System.out.println((i + 1) + ". " + nombres.get(i));
                    }
                    break;
                case 3:
                    // Eliminar un nombre
                    System.out.println("\nLista de nombres:");
                    for (int i = 0; i < nombres.size(); i++) {
                        System.out.println((i + 1) + ". " + nombres.get(i));
                    }
                    System.out.print("Ingresa el número del nombre a eliminar: ");
                    int indice = scanner.nextInt();
                    if (indice > 0 && indice <= nombres.size()) {
                        nombres.remove(indice - 1);
                        System.out.println("Nombre eliminado.");
                    } else {
                        System.out.println("Número inválido.");
                    }
                    break;
                case 4:
                    // Salir
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
