package logica;

import java.util.Scanner;

public class logica_cajero {
    private int saldo = 0, digito = 0;
    Scanner entrada = new Scanner(System.in);

    public logica_cajero(int digito) {
        this.digito = digito;

    }

    int numero = 0;

    public void info() {
        do {
            Scanner entrada = new Scanner(System.in);

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
                    break;
                case 3:
                    consignar_saldo();
                case 4:
                    salir();
                    numero = 4;
                    break;
                default:
                    System.out.println("ha ingresado una opción invalida: " + digito + " no es una entrada correcta");
                    break;
            }
        } while (numero != 4);
    }

    private void consignar_saldo() {
        System.out.println("tu saldo actual es de: " + saldo + "$ Pesos ¿Cuanto deseas depositar?");

        int consignacion = entrada.nextInt();

        saldo = saldo + consignacion;
        info();
    }

    private void retirar() {
        System.out.println("su saldo actual es de: " + saldo + "$ Pesos, ingrese cuanto desea retirar");
        int retiro = entrada.nextInt();

        if (retiro > saldo) {
            System.out.println("no tienes suficiente dinero para realizar el retiro, tu saldo actual es de" + saldo);
        } else {
            saldo = saldo - retiro;
            System.out.println("retiro exitoso, su nuevo saldo es de " + saldo + "$ pesos");
        }
        info();
    }

    private void consultar() {
        System.out.println("su saldo actual es de: " + saldo);
        info();
    }

    private void salir() {

        System.out.println("Gracias por elegirnos");
    }
}
