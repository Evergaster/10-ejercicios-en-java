package programas;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class asciiChar {
    public static void main(String[] args) {
        //la conversion en scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un caracter: ");
        char caracter = sc.next().charAt(0);
        int ascii = (int) caracter;
        System.out.printf("El valor ASCII de %c es %d", caracter, ascii);

        //la conversion en JOptionPane
        char caracter2 = JOptionPane.showInputDialog("Introduce un caracter: ").charAt(0);
        int ascii2 = (int) caracter2;
        JOptionPane.showMessageDialog(null, "El valor ASCII de " + caracter2 + " es " + ascii2);
    }
}
