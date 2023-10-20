package Cajero;
import java.util.Scanner;

import logica.consignar;
import logica.consultar;
import logica.retirar;
import logica.salir;

public class Cajero {
    Scanner in = new Scanner(System.in);
    int digito;
    public void info(){
        System.out.println("-------------------------------------------------------");
        System.out.println("Por favor, seleccione una opción");
        System.out.println("1. Consulta tu saldo");
        System.out.println("2. Retiro de efectivo");
        System.out.println("3. Depósito de efectivo");
        System.out.println("4. Salir");
        System.out.println("--------------------------------------------------------");
        digito = in.nextInt();
        switch (in) {
            case 1:
                
                break;
        
            default:
                break;
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        


    }
}
