public class BurbujaOptimizada {

    public static String muestraArray(int[] vector) {
        String cadena = "";
        for (int i = 0; i < vector.length; i++) {
            cadena += vector[i] + " ";
        }
        return cadena;
    }

    public static int[] OrdenaConBurbuja(int[] vector){
        int buffer;
        int i;
        int j;
        for ( i = 0; i < vector.length ; i++) {
            for (j=0; j<i; j++){
                if (vector[i]<vector[j]){
                    buffer=vector[j];
                    vector[j]=vector[i];
                    vector[i]=buffer;
                }
            }
        }
        return vector;
    }


    public static void main(String[] args) {

        int[] miMatriz={5,10,-4,0,9,12,6,33,-7,8};

        int[] arrayOrdenado=OrdenaConBurbuja(miMatriz);

        System.out.println(muestraArray(arrayOrdenado));
    }
}
