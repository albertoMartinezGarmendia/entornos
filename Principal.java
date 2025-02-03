import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Hola mundo");
        mostrarFecha();

        System.out.println("Introduce cuantos usuarios vas a crear: ");
        int size = teclado.nextInt();
        teclado.nextLine();
        Usuario[] usuarios=crearArray(size,teclado);

        for (Usuario usuario:usuarios){
            System.out.println("Nombre: "+usuario.getNombre()+
            "\nApellidos: "+usuario.getApellidos()+
            "\nEmail: "+usuario.getEmail()+"\n");
        }
    }

    public static void mostrarFecha(){

        LocalDateTime fecha = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");

        System.out.println("fecha y hora: " + fecha.format(formato));
    }

    public static Usuario[] crearArray(int size,Scanner teclado){

        Usuario[] usuarios = new Usuario[size];

        for(int i=0;i<usuarios.length;i++){
            usuarios[i] = new Usuario();
            System.out.println("Introduce el nombre del "+(i+1)+"º usuario: ");
            usuarios[i].setNombre(teclado.nextLine());
            System.out.println("Introduce los apellidos del " +(i+1)+ "º usuario: ");
            usuarios[i].setApellidos(teclado.nextLine());
            System.out.println("Introduce el email del "+(i+1)+"º usuario: \n");
            usuarios[i].setEmail(teclado.nextLine());
        }

        return usuarios;
    }
}