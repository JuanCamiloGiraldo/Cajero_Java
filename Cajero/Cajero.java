package Cajero;
import java.util.Scanner;

import logica.logica_cajero;

public class Cajero {
    
 
    public static void main(String[] args) {
        System.out.println("Bienvenido al cajero, presione cualquier tecla para continuar");
        Scanner entrada = new Scanner(System.in);
        int digito = entrada.nextInt();    
        logica_cajero logica = new logica_cajero(digito);
        logica.info();

    }
}
