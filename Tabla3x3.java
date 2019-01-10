import javax.swing.*;
import java.util.Arrays;

public class Tabla3x3 {
    public static void main(String[] args) {
        int[][] miTabla = new int[3][3];
        int contadorFila = 0;
        int contadorPosicion = 0;
        for (int i = 0; i <= miTabla.length - 1; i++) {

            for (int j = 0; j < miTabla[i].length; j++) {
                miTabla[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor " + contadorFila + "." + contadorPosicion + " para el array"));
                contadorPosicion++;
                System.out.printf("%2s ", miTabla[i][j]);
            }
            contadorFila++;
            contadorPosicion = 0;
            System.out.println();
        }

        System.out.println("-----------------------");

        int[][] miOtraTabla = new int[3][3];
        contadorFila = 0;
        contadorPosicion = 0;
        for (int i = 0; i <= miOtraTabla.length - 1; i++) {
            for (int j = 0; j < miOtraTabla[i].length; j++) {
                miOtraTabla[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor " + contadorFila + "." + contadorPosicion + " para el array"));
                contadorPosicion++;
                System.out.printf("%2s ", miOtraTabla[i][j]);
            }
            contadorFila++;
            contadorPosicion = 0;
            System.out.println();
        }

        System.out.println("-----------------------");

        int[][] miTablaSuma = new int[3][3];
        for (int i = 0; i < miTablaSuma.length; i++) {
            for (int j = 0; j < miTablaSuma[i].length; j++) {
                miTablaSuma[i][j] = miTabla[i][j] + miOtraTabla[i][j];
                System.out.printf("%2s ", miTablaSuma[i][j]);
            }
            System.out.println();
        }
    }
}
