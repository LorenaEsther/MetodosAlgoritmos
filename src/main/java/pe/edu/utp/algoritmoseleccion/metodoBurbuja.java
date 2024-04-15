/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.algoritmoseleccion;

/**
 *
 * @author pc
 */
public class metodoBurbuja {
      public static void ordenamientoBurbuja(String[] arr, boolean asc) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (asc ? arr[j].compareTo(arr[j + 1]) > 0 : arr[j].compareTo(arr[j + 1]) < 0) {
                    
                    // INTERMACMBIO
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            
        }
        // Mostrar las cadenas ordenadas
        System.out.println("RESULTADO");
        for (String cadenaOrdenada : arr) {
            System.out.println(cadenaOrdenada);
        }
      }
}
