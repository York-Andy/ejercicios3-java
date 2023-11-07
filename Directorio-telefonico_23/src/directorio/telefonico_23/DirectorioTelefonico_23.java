package directorio.telefonico_23;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;




public class DirectorioTelefonico_23 {
  
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int telefono = 1234;
        String ciudad = "Londres";
        Directorio1 prueba = new Directorio1();
        Cliente cliente=new Cliente(35265223, "giorgina", "corvalan", "londres", "Billinghust");
        Cliente cliente1=new Cliente (9876540, "dario", "gomez", "suiza", "calle ondo");
        prueba.ingresoDatos(2);
        
        if(prueba.buscarCliente(1234) == null){
            System.out.println("No hay cliente con ese numero en el directorio");
        } else{
            System.out.println("Cliente en el directorio con el numero " + telefono + ":\n");
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println("Apellido: " + cliente.getApellido());
            System.out.println("");
        }
        
        System.out.println();
        System.out.println("");
        
        System.out.println("Clientes que viven en la ciudad de " + ciudad + ":\n");
     
         
        prueba.agregarCliente(23456,cliente1);
        System.out.println("");
        prueba.ingresoDatos(2);
        prueba.getLista();
        prueba.buscarTelefono("gomez");
        
        
        
        System.out.println("Directorio:");
         for(HashMap.Entry<Integer, Cliente> num : prueba.getLista().entrySet()){
             System.out.println(num.getValue().getApellido() + ", " + num.getValue().getNombre() + "          " + num.getKey());
        }
    }
    


}
   
    
         
     
        
    
   
    
    
    
   
    

