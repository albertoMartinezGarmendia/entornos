import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        mostrarFecha();
    }

    public static void mostrarFecha(){

        LocalDateTime fecha = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");

        System.out.println("fecha y hora: " + fecha.format(formato));
    }
}