package logica;

import java.util.Scanner;

public class logica_cajero {
    private int saldo = 0, digito = 0; // saldo y digito se declaran como privados.
    Scanner entrada = new Scanner(System.in);

    public logica_cajero(int digito) {
        this.digito = digito;          //digito se inicializa como pública, ya que necesito que el otro fichero pueda ingresar data.

    }

    int numero = 0; //Genero un disparador para cerrar el ciclo do while, mientras no sea 4, el programa seguirá funcionando.

    public void info() {
        do {
            Scanner entrada = new Scanner(System.in);
            //muestra el mensaje de información
            System.out.println("-------------------------------------------------------");
            System.out.println("Por favor, seleccione una opción");
            System.out.println("1. Consulta tu saldo");
            System.out.println("2. Retiro de efectivo");
            System.out.println("3. Depósito de efectivo");
            System.out.println("4. Salir");
            System.out.println("--------------------------------------------------------");
            int digito = entrada.nextInt();
            switch (digito) {           //según el dígito que se ingrese, se activará un método distinto
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
                    numero = 4;         //le doy el valor 4 a la variable número, para salir del bucle
                    break;
                default:
                    System.out.println("ha ingresado una opción invalida: " + digito + " no es una entrada correcta");
                    break;
            }
        } while (numero != 4);
    }

    // suma la variable saldo con los dígitos ingresados por teclado
    private void consignar_saldo() {
        System.out.println("tu saldo actual es de: " + saldo + "$ Pesos ¿Cuanto deseas depositar?");

        int consignacion = entrada.nextInt();

        saldo = saldo + consignacion;
        System.out.println("su saldo actual es: " + saldo);
        info();
    }
    //resta la variable saldo con los dígitos ingresados por teclado, siempre y cuando el número ingresado sea inferior a saldo.
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
    //muestra por consola el saldo
    private void consultar() {
        System.out.println("su saldo actual es de: " + saldo);
        info();
    }
    //imprime el mensaje de salida
    private void salir() {

        System.out.println("Gracias por elegirnos");
    }
}
