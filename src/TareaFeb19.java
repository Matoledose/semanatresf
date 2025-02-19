import java.util.Scanner;
/**
 * Tarea 19 febrero 2025
 * 1.Pedir un número y calcular su factorial. Por ejemplo, el factorial de 5 se denota 5! y es igual a 5 × 4 × 3 × 2 × 1 = 120
 **/
public class TareaFeb19 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Indique el número para calcular su factorial");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            num *= i;
        }
        System.out.println("El factorial de  " + num + " es: " +num);







    }

    }

