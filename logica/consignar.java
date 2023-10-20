package logica;

public class consignar extends logica_cajero {
    
    private void consignar_saldo(){
        int consignacion = entrada.nextInt();
        saldo = saldo + consignacion;

    }
}
