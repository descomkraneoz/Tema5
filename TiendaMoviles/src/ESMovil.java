import javax.swing.*;

public class ESMovil {

    private static String prompt(String info, String titulo) {
        return JOptionPane.showInputDialog(null, info, titulo, JOptionPane.QUESTION_MESSAGE);
    }

    public static Movil leeMovil() {
        String nombre = prompt("Introduzca la marca del Móvil", "Marca de móvil");
        if (nombre == null) {
            return null;
        }
        String modelo = prompt("Introduzca el modelo de " + nombre, "modelo de " + nombre);
        if (modelo == null) {
            return null;
        }
        double precioSalida = 0;
        boolean precioCorrecto = false;
        while (!precioCorrecto) {
            String precioCadena = prompt("Precio de salida", "Precio de " + nombre + " " + modelo);
            if (precioCadena == null) {
                return null;
            }
            try {
                precioSalida = Double.parseDouble(precioCadena);
                if (precioSalida <= 0) {
                    return null;
                }
                precioCorrecto = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error en la entrada del precio", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        int megasCamaraTrasera = Integer.parseInt(prompt("Introduzca mpx de la cámara trasera del móvil", "Px Cámara trasera del " + modelo));
        if (megasCamaraTrasera <= 0) {
            return null;
        }
        int gigasMemoria = Integer.parseInt(prompt("Introduzca Gb del móvil", "Gb del " + modelo));
        if (gigasMemoria <= 0) {
            return null;
        }
        return new Movil(nombre, modelo, precioSalida, megasCamaraTrasera, gigasMemoria);
    }

    public static void main(String[] args) {
        Movil nuevoMovil = ESMovil.leeMovil();

        if (nuevoMovil == null) {
            System.out.println("Debido a un fallo al introducir un dato no se va crear el móvil. Vuelva a introducir los datos");
            return;
        }

        System.out.println(nuevoMovil);
        System.out.println(nuevoMovil.infoMovil());
    }
}
