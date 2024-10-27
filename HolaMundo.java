
// importar librerias
import java.util.Scanner;

/**
 * HolaMundo
 */
public class HolaMundo {

    public static void main(String[] args) {
        // imprime datos en consola saltando linea
        System.out.println("Hola jaiver!");
        // imprime datos pero no salta linea
        System.out.print("Como van las cosas");
        // %s para imprimir cadenas %d para imprimir enteros %n para saltar linea
        System.out.printf("Aqui va una cadena con un %s", "jaiver");
        System.out.printf("Mi nombre es %s y tengo %d años %n", "Jaiver", 23);
        // var para declarar variables
        // Scanner para leer datos
        var entrada = new Scanner(System.in);
        // .nextint para leer un entero
        var entero = entrada.nextInt();

        System.out.println(entero);
        // .close para cerrar el scanner
        entrada.close();

    }
    
}
