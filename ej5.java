public class ej5 {
    public static void main(String[] args) {
        int[] val = {0, 1, 2, 3};
        int temp;

        System.out.println( "Original Array: "
                + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );

        // reverse the order of the numbers in the array

        //primera forma con for

        /*for (int i = 0; i <val.length/2 ; i++) {
            temp=val[i];
            val[i]=val[val.length-i-1];
            val[val.length-i-1]=temp;
        }*/

        //segunda forma mas larga con int

        temp=val[3];
        val[3]=val[0];
        val[0]=temp;
        temp=val[1];
        val[1]=val[2];
        val[2]=temp;



        System.out.println( "Reversed Array: "
                + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
    }
}
