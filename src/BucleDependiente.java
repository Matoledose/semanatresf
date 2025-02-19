import java.util.Scanner;

//El bucle generalmente el interno depende del valor del externo
public class BucleDependiente {
    public static void main(String[] args) {

        /*
        Ejemplo-> solicitar un número y vamos a dibujar un triángulo de n lados utilizando asterísticos
        n=4         n=7
        ****        *******
        ***         ******
        **          *****
        *           ****
                    ***
                     **
                     *
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número para el triángulo  ");
        int num1=sc.nextInt(); // 4
        for(int fila=1; fila<=num1; fila++) { // fila<= 4 true
            for(int columna=fila; columna<=num1; columna++) {
                System.out.print("*");
            }
            System.out.println(); // salto de linea en cada fila
            }
        // Anuta pide el triángulo al revés
        System.out.println("Piramide al revés");
        for (int fila=num1; fila>=1; fila--) {
            for(int columna=fila; columna<=num1; columna++) {
                System.out.print("*");
                    }
            System.out.println(); // salto de linea en cada fila
        }



    }
}
