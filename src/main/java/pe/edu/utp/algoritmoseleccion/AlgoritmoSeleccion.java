/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pe.edu.utp.algoritmoseleccion;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class AlgoritmoSeleccion {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String[] cadenas = solicitarCadenas(lector);
        
        while (true) {
            try {
            mostrarMenu();
            boolean continuar = true;
            int opcion = lector.nextInt();
            lector.nextLine();  // Vacía el buffer

            switch (opcion) {
                case 1 ->
                    metodoSeleccion(cadenas, lector);
                case 2 ->
                    metodoInsercion(cadenas, lector);
                case 3 ->
                    metodoBurbuja(cadenas, lector);
                case 4 ->
                    salir();
                default -> 
                    System.out.println("Opción no válida. Intente nuevamente.");

            }

            if (continuar) {
                System.out.print("Ingrese cualquier número para regresar al menú principal o 0 para salir: ");
                if (lector.nextInt() == 0) {
                    salir();
                    break;
                }
            }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número válido para la opción del menú.");
                lector.nextLine();  // Limpiar el buffer del escáner para evitar un bucle infinito
            }
        }
    }
    
     public static String[] solicitarCadenas(Scanner scanner) {
                        
            //solicitar cantidad de cadenas a ordenar
            System.out.print("Ingrese la cantidad de cadenas a ordenar: "); 
            int n = scanner.nextInt();
            scanner.nextLine();
        
         String [] cadenas = new String [n];
            for (int i = 0; i < n; i++) {
             System.out.print("Ingrese la cadena "+ (i + 1) + ": ");
                cadenas[i] = scanner.nextLine();           
        }
        return cadenas;
        } 
  
        public static void mostrarMenu() {
        System.out.println("===========================================");
        System.out.println("Bienvenido a los métodos de algoritmos");
        System.out.println("===========================================");
        System.out.println("Operaciones Disponibles: ");
        System.out.println("1. Método por Selección");
        System.out.println("2. Método por Inserción");
        System.out.println("3. Método Burbuja");
    }
        
        
        public static void metodoSeleccion(String[] cadenas, Scanner scanner) {
    
         System.out.println("Ingrese si desea ordenar de forma Ascendente o Descendente");
            String ordenar = scanner.nextLine();
        
            if (ordenar.equalsIgnoreCase("Ascendente")) {
                metodoSeleccion.ordenamientoPorSeleccionAscendente(cadenas);
            }
            else if (ordenar.equalsIgnoreCase("Descendente")) {
                metodoSeleccion.ordenamientoPorSeleccionDescendente(cadenas);
            }
            else {
                System.out.println("Texto no válido");
            }
    }
        public static void metodoInsercion(String[] cadenas, Scanner scanner) {
            
            System.out.println("Ingrese:");
            System.out.println("1. Ascendente");
            System.out.println("2. Descendente");
            
            int tipoOrden = scanner.nextInt();
            scanner.nextLine();
            
            if (tipoOrden != 1 && tipoOrden !=2) {
                System.out.println("Opcion inválida");
                return;
            }
            metodoInsercion.ordenamientoPorInsercion(cadenas, tipoOrden);
            
        }
        public static void metodoBurbuja(String[] cadenas, Scanner scanner) {
            System.out.println("Ingrese:");
            System.out.println("1. Ascendente");
            System.out.println("2. Descendente");
            
            int tipoOrden = scanner.nextInt();
            scanner.nextLine();
            
            if (tipoOrden != 1 && tipoOrden !=2) {
                System.out.println("Opcion inválida");
                return;
            }
            boolean asc = tipoOrden ==1;
            metodoBurbuja.ordenamientoBurbuja(cadenas, asc);
    }
        public static void salir() {
            System.out.println("Saliendo del programa, hasta luego!");
            System.out.println("HOLA A TODOSSSS");
            System.out.println("HOLA A TODOSSSS");
            System.out.println("HOLA A TODOSSSS");
            System.out.println("HOLA A TODOSSSS");
        }
}
