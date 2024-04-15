/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.algoritmoseleccion;

/**
 *
 * @author pc
 */
public class metodoInsercion {
    public static void ordenamientoPorInsercion (String array[], int orden) {     
        
        //Proceso de Ordenamiento por insercion
        for (int i = 1; i < array.length; i++){
            String aux = array[i];
            int pos = i;                    
            
            //Verificar orden
            if(orden == 1){
                while((pos > 0) && (array[pos-1].compareTo(aux) > 0)){
                array[pos] = array[pos-1];
                pos--;
                }
            } else if (orden == 2) {
                while((pos > 0) && (array[pos-1].compareTo(aux) < 0)){
                array[pos] = array[pos-1];
                pos--;
                }
            } else {
                System.out.print("Valor de orden no válido");
                return;
            }

            array[pos] = aux;
        }
        
        //Impresión de los elementos del array ordenado
        System.out.println("RESULTADO");
        for(String value : array){
            System.out.print("\n"+value);
        }
        System.out.println("");
        System.out.println("");
    }
}
