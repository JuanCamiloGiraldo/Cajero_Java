package logica;

import java.util.Scanner;

public class logica_cajero {
    protected int saldo = 0, digito;
    Scanner entrada = new Scanner(System.in);

    protected void logica_cajero(int saldo, int digito){
        this.saldo = saldo;
        this.digito = digito;

    }
    private void ingresar_info(){
        digito = entrada.nextInt();
    }
}
