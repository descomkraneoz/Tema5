import java.util.Arrays;

public class TablaDeArraysConNumeros {
    public static void main(String[] args) {

        int[] primerArray = {1, 2, 3, 4, 5};
        int[] segundoArray = {-5, -8, -10, -33, -101};

        System.out.println(muestraArray(primerArray));

        //System.out.println(MezclaDosArraysDeLongitudDistintaEnUnoNuevo(primerArray,segundoArray));

        System.out.println(MezclaDosArraysDeLongitudIgualEnUnoNuevo(primerArray, segundoArray));
    }

    public static String MezclaDosArraysDeLongitudIgualEnUnoNuevo(int[] primerArray, int[] segundoArray) {

        int[] tercerArray = new int[primerArray.length + segundoArray.length];

        for (int i = 0; i < tercerArray.length; i++) {
            if (i % 2 == 0) {
                tercerArray[i] = primerArray[i / 2];
            } else {
                tercerArray[i] = segundoArray[i / 2];
            }
        }
        return Arrays.toString(tercerArray);
    }

    public static String MezclaDosArraysDeLongitudDistintaEnUnoNuevo(int[] primerArray, int[] segundoArray) {

        int[] tercerArray = new int[primerArray.length + segundoArray.length];
        int contadorPrimero = 0;
        int contadorSegundo = 0;

        for (int i = 0; i < tercerArray.length; i++) {
            if (i % 2 == 0) {
                tercerArray[i] = primerArray[contadorPrimero];
                contadorPrimero++;
            }
            if (i % 2 != 0) {
                tercerArray[i] = segundoArray[contadorSegundo];
                contadorSegundo++;
            }
            if (tercerArray[i] == 0) {
                tercerArray[i] = 0;
            }
        }
        return Arrays.toString(tercerArray);
    }

    public static String muestraArray(int[] vector) {
        String cadena = "";
        for (int i = 0; i < vector.length; i++) {
            cadena += vector[i] + " ";
        }
        return cadena;
    }

}
