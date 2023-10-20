package logica;

import java.util.Scanner;

public class logica_cajero {
    protected int saldo = 0;
    Scanner entrada = new Scanner(System.in);

    public logica_cajero(int saldo){
        this.saldo = saldo;
    }
    private void info(){
        System.out.println("-------------------------------------------------------");
        System.out.println("Por favor, seleccione una opción");
        System.out.println("1. Consulta tu saldo");
        System.out.println("2. Retiro de efectivo");
        System.out.println("3. Depósito de efectivo");
        System.out.println("4. Salir");
        System.out.println("--------------------------------------------------------");
        int digito = entrada.nextInt();
        switch (digito) {
            case 1:
                consultar();
                break;
            case 2:
                retirar();
            case 3:
                consignar_saldo();
            case 4:
                salir();
            default:
                break;
        }
    }
    private void consignar_saldo(){
        int consignacion = entrada.nextInt();
        saldo = saldo + consignacion;

    }
    private void retirar(){
        int retiro = entrada.nextInt();
        if(retiro > saldo ){
            System.out.println("no tienes suficiente dinero para realizar el retiro");
        }else{ saldo = saldo - retiro;}
        
        }
    private void consultar(){
        System.out.println(saldo);
    }
    private void salir(){
        System.out.println("Gracias por elegirnos");
    }
}
