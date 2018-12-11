import java.util.Arrays;

public class OrdenadosDesordenados {

    public static String muestraArray(int[] vector) {
        String cadena = "";
        for (int i = 0; i < vector.length; i++) {
            cadena += vector[i] + " ";
        }
        return cadena;
    }

    public static int[] ordenaArrayCreciente(int[] vector) {
        int[] salida;
        boolean hayCambio; //centinela o flag
        salida = vector.clone(); //copia defensiva para que no me cambien el vector desde el programa
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

    public static int[] ordenaArrayDecreciente(int[] vector) {
        int[] invertido = new int[vector.length];
        int[] aux;
        aux = ordenaArrayCreciente(vector);
        for (int i = 0; i < aux.length; i++) {
            invertido[i] = aux[aux.length - 1 - i];
        }
        aux = invertido;
        return aux;
    }

    public static String comoEstaOrdenado(int[] vector) {
        int[] arrayOrdenadoCreciente = ordenaArrayCreciente(vector);
        int[] arrayOrdenadoDecreciente = ordenaArrayDecreciente(vector);
        String salida = "";
        for (int i = 0; i < vector.length; i++) {
            if (Arrays.equals(vector, arrayOrdenadoCreciente)) {
                return salida = "El array esta ordenado de menor a mayor";
            }
            if (Arrays.equals(vector, arrayOrdenadoDecreciente)) {
                return salida = "El array esta ordenado de mayor a menor";
            } else {
                return salida = "El array no esta ordenado";
            }
        }
        return salida;
    }

    public static void main(String[] args) {

        int[] miArray = new int[]{1, 5, 3, 2, 9, 6, 10, 7, 4, 8};

        System.out.println(muestraArray(miArray));

        System.out.println(comoEstaOrdenado(miArray));


        int[] arrayOrdenado = ordenaArrayCreciente(miArray);

        System.out.println(muestraArray(arrayOrdenado));

        System.out.println(comoEstaOrdenado(arrayOrdenado));


        int[] otroArrayOrdenado = ordenaArrayDecreciente(miArray);

        System.out.println(muestraArray(otroArrayOrdenado));

        System.out.println(comoEstaOrdenado(otroArrayOrdenado));
    }
}