package programas;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class ascii {
    public static void main(String[] args) {
        //la conversion en scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un caracter: ");
        int caracter = sc.nextInt();

        char caracterChar = (char) caracter;
        System.out.printf("El caracter es: %c", caracterChar);
        
        //la conversion en JOptionPane
        int caracter2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un caracter: "));
        char caracterChar2 = (char) caracter2;
        JOptionPane.showMessageDialog(null, "El caracter es: " + caracterChar2);

    }
}
