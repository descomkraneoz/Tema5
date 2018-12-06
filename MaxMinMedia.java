public class MaxMinMedia {
    final static int TAMANIO=50;
    final static int LIMITE_INF=1;
    final static  int LIMITE_SUP=100;

    public static void main(String[] args) {

        int [] vector=new int[TAMANIO];
        int suma=0;
        double media;
        MiPrimerArray.RellenarAleatorio(vector,LIMITE_INF,LIMITE_SUP);
        vector=MiPrimerArray.OrdenaBurbuja(vector);
        System.out.println(MiPrimerArray.muestraVector(vector));
        System.out.println("El mínimo es: "+vector[0]);
        System.out.println("El máximo es: "+vector[TAMANIO-1]);

        for (int num:vector
             ) {suma+=num;

        }
        media=(double)suma/vector.length;
        System.out.println(media);


    }
}
