public class Movil {
    private final String nombre;
    private final String modelo;
    private double precioSalida;
    private final int megasCamaraTrasera;
    private final int gigasMemoria;

    public Movil(String nombre, String modelo, double precioSalida, int megasCamaraTrasera, int gigasMemoria) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.precioSalida = precioSalida;
        this.megasCamaraTrasera = megasCamaraTrasera;
        this.gigasMemoria = gigasMemoria;
    }

    public String getNombre() {
        return nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecioSalida() {
        return precioSalida;
    }

    public void setNuevoPrecioSalida(int NuevoPrecio) {
        this.precioSalida = NuevoPrecio;
    }

    public double getMegasCamaraTrasera() {
        return megasCamaraTrasera;
    }

    public int getGigasMemoria() {
        return gigasMemoria;
    }

    @Override
    public String toString() {
        return "Móvil: " + nombre + " " + modelo + " = " + precioSalida + "€";
    }

    public String infoMovil() {
        String salida = "";
        salida += "El móvil " + nombre + " " + modelo + "\n";
        salida += "Tiene un precio de salida de " + precioSalida + " €\n";
        salida += "Las principales características son: \n";
        salida += "Cámara trasera de " + megasCamaraTrasera + " mpx y Memoria de " + gigasMemoria + "Gb";

        return salida;
    }

   /* public static void main(String[] args) {

        Movil miMovil = new Movil("Xiaomi", "RedMi Note 7", 196.70, 12, 4);
        Movil otroMovil = new Movil("Apple", "Iphone XS", 1109.80, 12, 4);
        Movil vecinoMovil = new Movil("Samsung", "Galaxy A9", 449.50, 24, 8);

        System.out.println(miMovil.infoMovil());
        System.out.println(miMovil.toString());

    }*/

}
