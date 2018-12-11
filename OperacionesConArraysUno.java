import javax.swing.*;
import java.util.Arrays;

public class OperacionesConArraysUno {

    public static String muestraArray(int[] vector) {
        String cadena = "";
        for (int i = 0; i < vector.length; i++) {
            cadena += vector[i] + " ";
        }
        return cadena;
    }

    public static int[] ordenaArrayCreciente(int[] vector) {
        int[] salida;
        boolean hayCambio;
        salida = vector.clone();
        int i = vector.length;
        do {
            hayCambio = false;
            for (int j = 0; j < i - 1; j++) {
                int aux;
                if (salida[j] > salida[j + 1]) {
                    aux = salida[j + 1];
                    salida[j + 1] = salida[j];
                    salida[j] = aux;
                    hayCambio = true;
                }
            }
            i--;
        } while (i > 0 && hayCambio);
        return salida;
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

        int sumaPositivos = 0;
        int sumaNegativos = 0;
        double mediaPos = 0;
        double mediaNeg = 0;
        int contadorCeros = 0;
        int contadorPos = 0;
        int contadorNeg = 0;
        for (int i = 0; i < miArray.length; i++) {
            if (miArray[i] > 0) {
                sumaPositivos += miArray[i];
                contadorPos++;
                //mediaPos=(double)sumaPositivos/miArray.length;
                mediaPos = (double) sumaPositivos / contadorPos;
            }
            if (miArray[i] < 0) {
                sumaNegativos += miArray[i];
                contadorNeg++;
                //mediaNeg=(double)sumaNegativos/miArray.length;
                mediaNeg = (double) sumaNegativos / contadorNeg;
            }
            if (miArray[i] == 0) {
                contadorCeros++;
            }
        }
        System.out.println("La suma de los positivos es: " + sumaPositivos);
        System.out.println("La media de los positivos es: " + String.format("%.2f", mediaPos));
        System.out.println("La suma de los negativos es: " + sumaNegativos);
        System.out.println("La media de los negativos es: " + String.format("%.2f", mediaNeg));
        System.out.println("El número de 0 en el array es: " + contadorCeros);
    }
}