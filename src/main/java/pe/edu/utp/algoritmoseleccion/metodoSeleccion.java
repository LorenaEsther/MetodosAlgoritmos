/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.algoritmoseleccion;

/**
 *
 * @author pc
 */
public class metodoSeleccion {
    public static void ordenamientoPorSeleccionAscendente (String cadena[]) {
        int n = cadena.length;
        
        for (int i = 0; i < n - 1; i++) {
            int minimo = i;
            for (int j = i + 1; j < n; j++) {
                if (cadena[j].compareTo(cadena[minimo]) < 0) {
                    minimo = j;
                }
            }
            String temporal = cadena[minimo];
            cadena [minimo] = cadena [i];
            cadena [i] = temporal;
        } 
        // Mostrar las cadenas ordenadas
        System.out.println("RESULTADO");
        for (String cadenaOrdenada : cadena) {
            System.out.println(cadenaOrdenada);
        }
    }
    
    public static void ordenamientoPorSeleccionDescendente (String cadena[]) {
        int n = cadena.length;
        
        for (int i = 0; i < n - 1; i++) {
            int maximo = i;
            for (int j = i + 1; j < n; j++) {
                if (cadena[j].compareTo(cadena[maximo]) > 0) {
                    maximo = j;
                }
            }
            String temporal = cadena[maximo];
            cadena[maximo] = cadena [i];
            cadena [i] = temporal;
        }
        // Mostrar las cadenas ordenadas
        System.out.println("RESULTADO");
        for (String cadenaOrdenada : cadena) {
            System.out.println(cadenaOrdenada);
        }
    }
}
