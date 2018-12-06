import java.util.Arrays;

/* Crear un array con 100 enteros aleatorios (entre el 1 y el 100)
 * Ordenarlo y mostrar por pantalla los numeros
  * que no estan almacenados en el array*/

public class MiPrimerArray {

    //creamos unas constantes estática para poder cambiar el tamaño del array
    final static int TAMANIO=50;
    final static int LIMITE_INFERIOR=1;
    final static int LIMITE_SUPERIOR=100;

    //metodo que nos crea un numero aleatorio
    public static int getAleatorio(int limiteInferior, int limiteSuperior){
        int salida;
        //estructura que intercambia uno por otro, se aprende de memoria
        int aux;
        if (limiteInferior<limiteSuperior){
            aux=limiteInferior;
            limiteInferior=limiteSuperior;
            limiteSuperior=aux;
        }

        salida=(int) (Math.random()*(limiteSuperior-limiteInferior)+1)+limiteInferior;

        return salida;
    }

    //vamos a crear nuestra propia salida para mostrar el array
    public static String muestraVector(int[] vector){
        String cadena="";
        /*for (int valor:vector) {
            cadena+=valor+" ";
        }*/ //hace lo mismo el de abajo

        for (int i = 0; i <vector.length ; i++) {
            cadena+=vector[i]+" ";
        }
        return cadena;
    }


    /** Rellena un vector entero con números enteros entre limiteInferior y limiteSuperior
     * en caso de ser limiteInferior menor que limiteSuperior, se intercambian los valores
     * @param vector Array de enteros
     * @param limiteInferior límite inferior de los números aleatorios a generar
     *                       <strong>También puede aparecer limiteInferior</strong>
     * @param limiteSuperior límite superior de los números aleatorios a generar
     *                       <strong>También puede aparecer limiteSuperior</strong>
     */
    public static void RellenarAleatorio(int[] vector, int limiteInferior, int limiteSuperior) {
        for (int i = 0; i <vector.length ; i++) {
            vector[i]=getAleatorio(limiteInferior,limiteSuperior);
        }
    }

    public static int[] OrdenaBurbuja(int[] vector){
        int[] salida;
        boolean hayCambio; //centinela o flag
        salida=vector.clone(); //copia defensiva para que no me cambien el vector desde el programa
        int i=vector.length;
        do{
            hayCambio=false;
            for (int j = 0; j <i-1 ; j++) {
                int aux;
                if (salida[j]>salida[j+1]){
                    aux=salida[j+1];
                    salida[j+1]=salida[j];
                    salida[j]=aux;
                    hayCambio=true;
                }

            }
            i--;
        }while (i>0 && hayCambio);

        return salida;
    }

    public static boolean Encuentra(int[] vector, int aBuscar){
        boolean resultado;
        resultado=false;
        int i=0;
        while (i<vector.length && !resultado){
            if (vector[i]==aBuscar){
                resultado =true;
            }
            i++;
        }
        return resultado;
    }


    public static void main(String[] args) {

        //Crear array
        int[] vectorDesordenado=new int[TAMANIO];
        int[] ordenado;

        /*comprueba que llena el array pero claro esta con 0 porque no
         he definido los numeros o lo que contendra el array
        System.out.println(muestraVector(vectorDesordenado));*/

        //Rellenar array

        //Ahora para rellenar el array vamos a hacer un metodo al que
        // le paso el vector y los limites
        RellenarAleatorio(vectorDesordenado,LIMITE_INFERIOR,LIMITE_SUPERIOR);

        //Array sin ordenar
        System.out.println(muestraVector(vectorDesordenado));

        //Ordenar array
       /* Arrays.sort(vectorDesordenado); // forma muy rapida de ordenar,
       pero no la usaremos de momento */

       ordenado=OrdenaBurbuja(vectorDesordenado);

        System.out.println(muestraVector(ordenado));

        //Buscar los que no estan en el array

        System.out.print("Números que no están: ");
        for (int i = LIMITE_INFERIOR; i <=LIMITE_SUPERIOR ; i++) {
            if (!Encuentra(ordenado,i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        // Segunda forma de buscar en el array los que no estan

        boolean[] estan;
        estan=new boolean[LIMITE_SUPERIOR-LIMITE_INFERIOR+1];

        System.out.print("Números que no están: ");
        for (int i = 0; i <ordenado.length ; i++) {
            estan[ordenado[i]-LIMITE_INFERIOR]=true;
        }
        for (int i = 0; i <estan.length ; i++) {
            if (!estan[i]){
                System.out.print(i+LIMITE_INFERIOR+" ");
            }
        }
        System.out.println();

        //Buscar los que no estan, tercera solucion, de una pasada lo comprueba

        int buscando=0;
        boolean esta;
        int indice;
        System.out.print("Números que no están: ");
        for (indice = LIMITE_INFERIOR; indice <=LIMITE_SUPERIOR ; indice++) {
            if (buscando<ordenado.length && ordenado[buscando]==indice){
                while (buscando < ordenado.length && ordenado[buscando]==indice) {
                    buscando++;
                }
            }
            else{
                System.out.print(indice+" ");
            }
        }
        System.out.println();
    }
}
