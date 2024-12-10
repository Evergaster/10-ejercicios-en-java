package programas;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de elementos a mostrar de la serie de Fibonacci: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;

        for(int i = 1; i <= n; i++){
            System.out.print(a + " ");
            int c = a + b;
            
            a = b;
            b = c;
        }
    }
}
