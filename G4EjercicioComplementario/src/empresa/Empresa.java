package empresa;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public class Empresa {

    private static int acumulador = 0;
    //private int acumuladorObj;
    private double ganancias;

    public Empresa() {
        // acumuladorObj = Empresa.acumulador++;
        acumulador++;
        ganancias = 0;
    }

    /*
    public int getAcumuladorObj() {
        return acumuladorObj;
    }

    public void setAcumuladorObj(int acumuladorObj) {
        this.acumuladorObj = acumuladorObj;
    }*/
    public static int getAcumulador() {
        return acumulador;
    }

    public void contratar(Servicio service) {
        if (service instanceof TrabajoPintura) {
            System.out.println("La edificacion es: " + ((TrabajoPintura) service).getEdificaion() + "\n" + ((TrabajoPintura) service).detalleServicio());
            ganancias += ((TrabajoPintura) service).costeTotal();
        } else if (service instanceof RevisionAlarma) {
            System.out.println(((RevisionAlarma) service).detalleServicio());
            ganancias += ((RevisionAlarma) service).costeTotal();
        }
    }

    public void mostrarCostoTotalDeObras() {
        System.out.println("La suma de todos los servicios contratados fue: "+ganancias);
    }
}
