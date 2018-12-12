/*Desarrollar un programa en el que se pidan al usuario un vector de números enteros e indique en pantalla
 si dicho vector es capicúa, es decir, la secuencia de sus elementos es igual vista de delante
 hacia atrás y de detrás hacia delante.
  */

import javax.swing.*;

public class Capicua {
    public static String muestraArray(int[] vector) {
        String cadena = "";
        for (int i = 0; i < vector.length; i++) {
            cadena += vector[i] + " ";
        }
        return cadena;
    }


    public static void main(String[] args) {
        int tamanio = Integer.parseInt(JOptionPane.showInputDialog("Introduce un tamaño de array"));
        int[] miArray = new int[tamanio];
        int contador = 0;
        for (int i = 0; i <= tamanio - 1; i++) {
            miArray[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor " + contador + " para el array"));
            //System.out.println(Arrays.toString(miArray));
            contador++;
        }
        System.out.println(muestraArray(miArray));

        for (int i = 0; i <miArray.length-1 ; i++) {
            if (miArray[0]+i==miArray[miArray.length-1]-i){
                System.out.println("Capicua");
            }else{
                System.out.println("No es capicua");
            }
        }
    }
}
