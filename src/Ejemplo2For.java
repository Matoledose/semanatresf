
import java.util.Scanner;

/*
Solicita 10 numeros enteros por pantalla y calcula la media
* Declarar variables que acumulará estos números ... pista utilizar el opera y asigna +=
Finalmente, muestra la media
 */
public class Ejemplo2For {
    public static void main(String[] args) {
        int numero=0;  // declaramos la variable igual  a 0
        Scanner sc = new Scanner(System.in);  // declaramos el scanner
        for (int i=1;i<=10;i++) {    // se va a repetir hasta que i  sea igual = 10. i num veces pide numero
            System.out.println("Ingrese diez números");
            numero += sc.nextInt();
        }
            System.out.println("La media es  "+(double) numero/10);


    }
    }
