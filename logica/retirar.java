package logica;

public class retirar extends logica_cajero{
    private void Retiro(){
        int retiro = entrada.nextInt();
        if(retiro > saldo ){
            System.out.println("no tienes suficiente dinero para realizar el retiro");
        }else{ saldo = saldo - retiro;}
        
        }
}
