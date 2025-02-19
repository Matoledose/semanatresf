import javax.swing.*;
/**
public class MenuOpciones {
    /**Crear un menú que se repita hasta que el usuario elija la opción salir. Tendrá 3 opciones:
     * 1-> Hola que tal (saludo)
     * 2-> Indicar la fecha de hoy
     * 3-> Salir


    public static void main(String[] args) {
        int opcion=0;
        do {

            opcion=Integer.parseInt(JOptionPane.showInputDialog("\"Hola puedes elegir entre las siguientes opciones \\n (1)-> Hola que tal!! \\n (2)-> Indicar la fecha de hoy \\n (3) Salir\""));
            String mensaje;
            switch (opcion) {
                case 1->mensaje="Hola que tal!! ";
                case 2->mensaje="Indicar la fecha de hoy ";
                case 3->mensaje="Salir";
        }while(opcion!=3);
    }
}
**/