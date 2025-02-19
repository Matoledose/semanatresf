import java.util.Scanner;

/**
 * Solicitar al usuario un número, y morstrará todos los número desde el 1 al numero ingresado.
 * sout
 *
 * Escribe un programa que muestre todos los múltiplos de 7 menores que 100.
 */

public class Ejemplo1For {
    public static void main(String[] args) {
        System.out.print("Ingrese un número ->");
        int numero=new Scanner(System.in).nextInt(); // lee el dato directamente no hace falta declarar el escaner.
        for(int i=1;i<=numero;i++) {
            System.out.print(i+"-"); // sin salto de linea
        }
        System.out.println();   // salto de linea manual
        for(int i=0;i<=100;i+=7){
    System.out.print(i+"-");

}


    }

}
