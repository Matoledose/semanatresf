import java.util.Scanner;

/**
 * Pedir un número comprendido entre el 1 y el 10. Hay que mostrar la tabla de multiplicar del número ingresado
    asegurándose que el dato inicial esté comprendido en el rango. Si no está correcto, solicitarlo nuevamente.
  */
public class TablaMultiplicar1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        do { // asegurar que lo que ingresa está entre el 1-10. sino lo va a volver a pedir
            System.out.println("Ingrese un número entre 1 y 10 para generar la tabla de multiplicar");
            numero = sc.nextInt();
        } while (!(numero > 0 && numero <= 10)); // numero<0 && numero>10
        System.out.println("LA TABALA DEL " + numero);
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + "x" + i + "=" + (numero * i));


        }
        /* Salidas anticipadas->  for. do-while. while
            1. Interrumpen el buble-> break
            1. Saltar la interación actual y continuar con el bucle-> continue
         */
        System.out.println("Salidas anticipada- BREAK");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break; // se va a salir-> se interrumpe
            } else {
                System.out.println(numero + "x" + i + "=" + (numero * i));
            }

        }
        System.out.println("Salidas interrumpida- CONTINUE");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                // CONTINUE, SALTAR
            } else {
                System.out.println(numero + "x" + i + "=" + (numero * i));
            }
        }
    }
}
