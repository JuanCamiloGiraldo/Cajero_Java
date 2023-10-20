package logica;

import java.util.Scanner;

public class logica_cajero {
    // declaro como privado el saldo y el dígito
    private int saldo = 0, digito;
    Scanner entrada = new Scanner(System.in);
    //Inicializo la variable digito como publica
    public logica_cajero(int digito){
        this.digito = digito;

    }
    // genero el bucle principal en un ciclo do while
       public void info(){
        do{
            Scanner entrada = new Scanner(System.in);

            System.out.println("-------------------------------------------------------");
            System.out.println("Por favor, seleccione una opción");
            System.out.println("1. Consulta tu saldo");
            System.out.println("2. Retiro de efectivo");
            System.out.println("3. Depósito de efectivo");
            System.out.println("4. Salir");
            System.out.println("--------------------------------------------------------");
            int digito = entrada.nextInt();
        //usé switch case para ejecutar las lineas de código, si el digito es igual a 4, el bucle finalizará
        switch (digito) {
            case 1:
                consultar();
            case 2:
                retirar();
            case 3:
                consignar_saldo();
            case 4:
                salir();
                break;
            default:
                System.out.println("ha ingresado una opción invalida: " + digito + " no es una entrada correcta");
        }
        }while(digito != 4);
    }
    // el método consignar saldo usa la variable consignación para guardar el valor ingresado por teclado
    // después modifico la variable saldo sumandole la consignación
    private void consignar_saldo(){
        System.out.println("tu saldo actual es de: " + saldo + "$ Pesos ¿Cuanto deseas depositar?");

        int consignacion = entrada.nextInt();
        
        saldo = saldo + consignacion;
        info();
    }
    // retirar es lo mismo que consignar, solo que en lugar de sumar, resta y solo en el caso de que el saldo sea mayor al valor retirado
    private void retirar(){
        System.out.println("su saldo actual es de: " + saldo + "$ Pesos, ingrese cuanto desea retirar" );
        int retiro = entrada.nextInt();
    
        if(retiro > saldo ){
            System.out.println("no tienes suficiente dinero para realizar el retiro, tu saldo actual es de" + saldo  );
        }else{ saldo = saldo - retiro;
            System.out.println("retiro exitoso, su nuevo saldo es de " + saldo + "$ pesos");
        }
        info();
        }
        //consultar muestra el saldo
    private void consultar(){
        System.out.println("su saldo actual es de: "  + saldo);
        info();
    }
    //salir hace imprime un mensaje de despedida, al ser la opción 4 terminará el ciclo del programa
    private void salir(){
        System.out.println("Gracias por elegirnos");
    }
}
