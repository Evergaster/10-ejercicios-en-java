package programas;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class calculadora {

    
    public static void main(String[] args) {
        //con Scanner se puede leer datos del teclado
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Introduce el primer número: ");
        num1 = sc.nextInt();
        System.out.println("Introduce el segundo número: ");
        num2 = sc.nextInt();
        
        System.out.printf("la suma es: %d", num1 + num2);
        System.out.printf("la resta es: %d", num1 - num2);
        System.out.printf("la multiplicación es: %.2f", num1 * num2);
        System.out.printf("la división es: %.2f", num1 / num2); 

        // con JOptionPane se puede mostrar mensajes en una ventana
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número: "));
        int num4 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número: "));
        JOptionPane.showMessageDialog(null, "la suma es: " + (num3 + num4));
        JOptionPane.showMessageDialog(null, "la resta es: " + (num3 - num4));
        JOptionPane.showMessageDialog(null, "la multiplicación es: " + (num3 * num4));
        JOptionPane.showMessageDialog(null, "la división es: " + (num3 / num4));
    }
}