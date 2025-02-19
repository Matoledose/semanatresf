import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Fecha {
    public static void main(String[] args) {



    // El tipo de fecha LocalDate/ LocalleDateTime
    LocalDate fecha= LocalDate.now();// La fecha de hoy
        System.out.println(fecha);
    LocalDateTime fechaYhora = LocalDateTime.now();
    System.out.println(fechaYhora.getDayOfMonth());
    System.out.println(fechaYhora.getMonth());
    System.out.println(fechaYhora.getYear());
    System.out.println(fechaYhora.getHour());
    int hora= fechaYhora.getHour();
    if (hora<14) {
        System.out.println("Buenos días");
    }else{
        System.out.println("Buenas tardes");
    }
    }
}
