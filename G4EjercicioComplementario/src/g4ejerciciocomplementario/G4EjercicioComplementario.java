package g4ejerciciocomplementario;

import empresa.*;
import java.time.LocalDate;

public class G4EjercicioComplementario {

    public static void main(String[] args) {
        
        Empresa emp1 = new Empresa();
        TrabajoPintura serv1 = new TrabajoPintura(900, 3000, "Pepe Laurel", LocalDate.now(),"Jose Lopez");
    }

}
