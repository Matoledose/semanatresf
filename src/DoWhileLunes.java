import javax.swing.*;

public class DoWhileLunes {
    public static void main(String[] args) {
        String opcion= ""; // es necesario declarar opcion fuera

        do { //indicamos que muestre el menu al menos una vez| Bloque de instrucciones....
            opcion = JOptionPane.showInputDialog(null, "Indique una opción de la operación \n (1) sumar \n (2) restar \n (3) multiplicar \n (4)dividir \n (5) Modulo \n (6) Exponente \n (7) Salir");
            //* Validar que la opción sea entre 1 y 6 *//*
            int op = 0; // inicializamos opción en cada iteración
            try {
                op = Integer.parseInt(opcion);//convertimos el valor de String a numérico
            } catch (NumberFormatException e) {
                JOptionPane.showInputDialog(null, "El número opcion no existe"); // validamos si no es numerico
            }
            if (op >= 1 && op <= 6) { // solo entra a pedir los numeros si las opciones son correcta
                String num1T = JOptionPane.showInputDialog(null, " Indique el número 1");
                String num2T = JOptionPane.showInputDialog(null, " Indique el número 2");

                int a = 0, b = 0;
                String mensaje = "";
                try {
                    a = Integer.parseInt(num1T);
                    b = Integer.parseInt(num2T);
                } catch (NumberFormatException e) {
                    mensaje = "El número no es válido";
                }
                //***validar que a ó b no sean iguales a 0 ***
                if (a != 0 && b != 0) {
                    switch (op) {
                        case 1 -> mensaje = "El resultado de sumar " + a + "+" + b + "=" + (a + b);
                        case 2 -> mensaje = "El resultado de restar " + a + "-" + b + "=" + (a - b);
                        case 3 -> mensaje = "El resultado de multiplicar " + a + "*" + b + "=" + (a * b);
                        case 4 -> mensaje = "El resultado de dividir " + a + "/" + b + "=" + (a / b);
                        case 5 -> mensaje = "El resultado de modulo " + a + "%" + b + "=" + (a % b);
                        case 6 -> mensaje = "El resultado de exponente " + a + "^" + b + "=" + Math.pow(a, b);
                        default -> mensaje = "HA OCURRIDO UN ERROR";
                    }
                }
                JOptionPane.showMessageDialog(null, mensaje);

                }
                }while (!opcion.equals("7")) ;// repite la interación mientras opción sea distinto a "7".


                            }


        }


