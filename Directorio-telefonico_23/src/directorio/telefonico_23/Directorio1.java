package directorio.telefonico_23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Directorio1 {

  
    private final Scanner in = new Scanner(System.in).useDelimiter("\n");
    private HashMap<Integer, Cliente> lista;

    public Directorio1() {
        lista = new HashMap();
    }
    
    public void agregarCliente(Integer tel, Cliente cliente){
        lista.put(tel, cliente);
    }
    
    public Cliente buscarCliente(Integer tel){
        for(HashMap.Entry<Integer, Cliente> num : lista.entrySet()){
            if(num.getKey().equals(tel)){
                return num.getValue();
            }
        }
    
        return null;
    }
    
    public List buscarTelefono(String apellido){
        List<Integer> numeros = new ArrayList();
        
         for(HashMap.Entry<Integer, Cliente> num : lista.entrySet()){
             
             if(num.getValue().getApellido().equalsIgnoreCase(apellido)){
                 numeros.add(num.getKey());
             }
        }
         
         return numeros;
    }
    
    public List buscarClientes(String ciudad){
        List<Cliente> clientes = new ArrayList();
        
         for(HashMap.Entry<Integer, Cliente> num : lista.entrySet()){
             
             if(num.getValue().getCiudad().equalsIgnoreCase(ciudad)){
                 clientes.add(num.getValue());
             }
        }
         
         return clientes;
    }
    
    public void borrarCliente(Integer telefono){
        lista.remove(telefono);
    }
    
    public void ingresoDatos(int cantidad){
        String nombre, apellido, ciudad, direccion;
        int dni, telefono;
        
        
        
        for(int i = 0; i < cantidad; i++){
            
            System.out.println("Datos del cliente " + (i + 1) + "\n");
            System.out.print("Nombre: ");
            nombre = in.next();
            System.out.print("Apellido: ");
            apellido = in.next();
            System.out.print("DNI: ");
            dni = in.nextInt();
            System.out.print("Ciudad: ");
            ciudad = in.next();
            System.out.print("Direccion: ");
            direccion = in.next();
            //in.nextLine();
            System.out.print("Telefono: ");
            telefono = in.nextInt();
            
            agregarCliente(telefono, new Cliente(dni, nombre, apellido, ciudad, direccion));
            
            System.out.println("");
            
           
            
        }
    }

    public HashMap<Integer, Cliente> getLista() {
        return lista;
    }
}
