# 10 proyectos en Java

---

En este repositorio veremos **10 ejercicios básicos** en Java para entender los conceptos fundamentales del lenguaje, como las variables, estructuras básicas y métodos, junto con algunos ejemplos prácticos.

## Variables

Las variables en Java se declaran especificando primero el tipo de dato seguido del nombre de la variable:

```java
int entero = 0;
double decimal = 0.00;
boolean booleano = true;
String texto = "Hola";
byte byte = 127;
short corto = 32767;
```

### Tabla de tipos de datos

| Tipo de variable | Bytes que ocupa | Rango de valores |
| :--------------- | :-------------: | ----------------: |
| boolean          | 1               | true, false       |
| byte             | 1               | -128 a 127        |
| short            | 2               | -32,768 a 32,767  |
| int              | 4               | -2,147,483,648 a 2,147,483,647 |
| long             | 8               | -9.2x10<sup>18</sup> a 9.2x10<sup>18</sup> |
| float            | 4               | ±3.4x10<sup>38</sup> |
| double           | 8               | ±1.7x10<sup>308</sup> |
| char             | 2               | Caracter Unicode |

## Estructura base

La estructura base en Java es fundamental para que el código sea válido. Todo programa necesita al menos una clase pública con un método `main`.

#### Ejemplo

```java
public class NombreDeArchivo {

    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

## Concatenación

En Java, la concatenación de cadenas se realiza principalmente usando el operador `+`. Para formatear cadenas, se utiliza el método `printf`, donde cada especificador (`%`) indica el tipo de dato que se quiere imprimir.
<div style="display: flex; background: white;justify-content: center; align-items: center; width: 100%;">
    <img src="https://www.it.uc3m.es/pbasanta/asng/course_notes/input_output_printf_example_es.png" style="max-width: 100%; height: auto;">
</div>

Por ejemplo:

```java
System.out.printf("El número es %d y el texto es %s", 10, "Hola");
```

### Tabla de especificadores

| Especificador | Descripción |
| ------------- | ----------- |
| `%c`          | Imprime un carácter ASCII |
| `%d`, `%i`    | Número entero decimal |
| `%x`, `%X`    | Número entero en hexadecimal |
| `%f`          | Número de coma flotante |
| `%s`          | Cadena de texto |
| `%%`          | Imprime el símbolo `%` |

## Ejercicios

### 1. haz una calculadora que haga la funciones basicas

<details>
<summary>Haz clic para mostrar el código</summary>

```java
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
```
</details>
    
    
### 2. declara 2 variables que se comparen y que te muestre si es mayor, menor o igual

<details>
<summary>Haz clic para mostrar el codigo</summary>

```java
package programas;

public class comparaciones {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 =3;

        if(num1 >= num2){
            if(num1 == num2){
                System.out.println("num1 es igual a num2");
            }else{
                System.out.println("num1 es mayor que num2");
            }
        }else{
            System.out.println("num1 es menor que num2");
        }
    }
}
```
</details>
    
### 3. declara un String donde pongas tu nombre y te lo muestre "bienvenido nombre"
<details>
<summary>Haz clic para mostrar el codigo</summary>

```java
package programas;

public class nombre {
    public static void main(String[] args) {
        String nombre = "Juan";

        System.out.printf("bienvendio %s", nombre);
    }
}
```
</details>
    
## 4. modificando el anterior, haz que pida el nombre al usuario atravez de la terminal o ventana flotante

<details>
<summary>Haz clic para mostrar el codigo</summary>

```java
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
```
</details>
    
### 5. haz un programa si el numero es multiplo de 2(resto == 0) y te muestre si es par o inpar
<details>
<summary>Haz clic para mostrar el codigo</summary>

```java
package programas;
import java.util.Scanner;
public class divideEntre2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num1 = sc.nextInt();
        if(num1 % 2 == 0){
            System.out.println("El número es par");
        }else{
            System.out.println("El número es impar");
        }
    }
}

```
</details>
    
### 6. haz un programa que calcule (pi*R^2) el radio se pedira por terminal(recuerda convertirlo a double)

<details>
<summary>Haz clic para mostrar el codigo</summary>

```java
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

```
</details>
    
### 7. lee un numero y conviertelo en ascii y se muestre(ejemplo: 97 es a)
<details>
<summary>Haz clic para mostrar el codigo</summary>

```java
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
```
</details>
    
### 8. con el codigo anterior, modificalo para que pida caracter ascii y lo muestre en entero
<details>
<summary>Haz clic para mostrar el codigo</summary>

```java
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

```
</details>
    
### 9. haz la serie fibonacci que empieze desde cero
<details>
<summary>Haz clic para mostrar el codigo</summary>

```java
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

```
</details>
    
### 10. Crea un programa en Java que permita al usuario gestionar una lista de nombres. El programa debe permitir agregar nombres, mostrar la lista de nombres y eliminar un nombre específico.
<details>
<summary>Haz clic para mostrar el codigo</summary>

```java
package programas;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeNombres {
    public static void main(String[] args) {
        // Crear una lista para almacenar los nombres
        ArrayList<String> nombres = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar el menú
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar un nombre");
            System.out.println("2. Mostrar la lista de nombres");
            System.out.println("3. Eliminar un nombre");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    // Agregar un nombre
                    System.out.print("Ingresa un nombre: ");
                    String nombre = scanner.nextLine();
                    nombres.add(nombre);
                    System.out.println("Nombre agregado.");
                    break;
                case 2:
                    // Mostrar la lista de nombres
                    System.out.println("\nLista de nombres:");
                    for (int i = 0; i < nombres.size(); i++) {
                        System.out.println((i + 1) + ". " + nombres.get(i));
                    }
                    break;
                case 3:
                    // Eliminar un nombre
                    System.out.println("\nLista de nombres:");
                    for (int i = 0; i < nombres.size(); i++) {
                        System.out.println((i + 1) + ". " + nombres.get(i));
                    }
                    System.out.print("Ingresa el número del nombre a eliminar: ");
                    int indice = scanner.nextInt();
                    if (indice > 0 && indice <= nombres.size()) {
                        nombres.remove(indice - 1);
                        System.out.println("Nombre eliminado.");
                    } else {
                        System.out.println("Número inválido.");
                    }
                    break;
                case 4:
                    // Salir
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}

```
</details>