package empresa;

import java.time.LocalDate;
import java.time.LocalDateTime;



public class TestMain {

    public static void main(String[] args) {
        //LocalDate fecha=new LocalDate 
       Servicio a= new TrabajoPintura(90d, 1600d, "pepe lopez",LocalDate.now(),"guido casca ");
       Servicio b=new RevisionAlarma(20, LocalDate.now(), "lula da silva");
       Empresa as=new Empresa();
       Empresa aq=new Empresa();
        System.out.println(a.detalleServicio());
        System.out.println(""+a.costeManoObra());
        //as.mostrarCostoTotalDeObras();
        //aq.contratar(b);
    }

}
