package Cajero;
import java.util.Scanner;
// importo logica_cajero de logica para usarlo
import logica.logica_cajero;

public class Cajero {
    
 
    public static void main(String[] args) {
        //Mensaje de bienvenida que solo se mostrará una vez
        System.out.println("Bienvenido al cajero, presione cualquier tecla para continuar");
        Scanner entrada = new Scanner(System.in);
        int digito = entrada.nextInt();    
        //envío el valor de dígito a través del operador designado "logica" 
        logica_cajero logica = new logica_cajero(digito);
        //inicializo info, para que el programa comience a recibir instrucciones.
        logica.info();

    }
}
