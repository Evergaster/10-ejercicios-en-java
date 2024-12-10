package programas;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class nombreModificado {

    public static void main(String[] args) {
        //con Scanner se puede leer datos del teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa el nombre: ");
        String nombre = sc.next();

        System.out.printf("bienvendio %s", nombre);
        // con JOptionPane se puede mostrar mensajes en una ventana
        String nombre2 = JOptionPane.showInputDialog("ingresa el nombre: ");
        JOptionPane.showMessageDialog(null, "bienvendio " + nombre2);
    }
}