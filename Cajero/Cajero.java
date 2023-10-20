package Cajero;
import java.util.Scanner;  //importo Scanner para que sea posible ingresar datos por teclado
import logica.logica_cajero;    //importo lógica_cajero para usar las variables y métodos del objeto

public class Cajero {
    public static void main(String[] args) {
        System.out.println("Bienvenido al cajero, presione cualquier tecla para continuar");
        Scanner entrada = new Scanner(System.in);
        int digito = entrada.nextInt();    
        logica_cajero logica = new logica_cajero(digito); //importo la variable dígito, para poder enviarla a los métodos de lógica cajero
        logica.info(); //inicializo logica.info para iniciar la ejecución de funciones.

    }
}
