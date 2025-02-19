import javax.swing.*;

public class EdadPersonas {

/**Solicitar la edad 10 personas e ir contando cuales son mayores de 10 y a cuáles menores de 18, al final mostrar los mayores y menores
 *
 */
public static void main(String[] args) {
int mayor=0, menor=0;
        int edad=0,contador=1;
        do {
                String edadT = JOptionPane.showInputDialog("Ingrese su edad"); // para pedir que lo ponga en pantalla
                edad = Integer.parseInt(edadT); // Convierte la edad en número
                if (edad < 18) {
                        menor++;

                } else if (edad >= 18) {
                        mayor++;
                }
        contador++; // cuenta las veces que se repite el bucle para que pare cuando sean 10
        }while (contador <= 10);

        JOptionPane.showMessageDialog(null, "Edad mayor: " + mayor+"\nEdad menor: " + menor); // va a poner el resultado por pantalla







}
        }










