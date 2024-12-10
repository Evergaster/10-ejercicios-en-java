package programas;
import java.util.Scanner;
public class circulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el radio del círculo: ");
        double radio = sc.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);

        System.out.printf("El área del círculo es: %.2f", area);
    }
}
