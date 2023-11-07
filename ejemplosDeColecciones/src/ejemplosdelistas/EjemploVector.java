package ejemplosdelistas;

import java.util.Vector;

public class EjemploVector {

    private Vector<String> lista;

    // constructor para inicializar el Vector
    public EjemploVector() {
        lista = new Vector();
    }

    // Método para agregar elementos al Vector
    public void agregarElemento(String elemento) {
        lista.add(elemento);
    }

    //Método para obtener el tamaño del Vector
    public int obtenerTamanio() {
        return lista.size();
    }

    //Método para acceder a un elemento por índice
    public String recuperarElemento(int indice) {
        if (indice > obtenerTamanio() || indice < 0) {
            return "El indice ingresado está fuera del rango que tiene el arreglo";
        } else {
            return lista.get(indice);
        }
    }

    //Método para recorrer el Vector
    public void recorrerVector() {
        //recorriendo el Vector con un for normal
        for (int i = 0; i < obtenerTamanio(); i++) {
            System.out.println(lista.get(i));
        }

        //recorriendo el Vector con un forEach
//        for(String elemento:lista){
//            System.out.println(elemento);
//        }
        //Recorriendo el Vector con el forEach que posee lista
//        lista.forEach(elem -> {
//            System.out.println(elem);
//        });
    }

    //Método para eliminar un elemento por índice
    public void eliminarElemento(int indice) {
        if (indice > obtenerTamanio() || indice < 0) {
            System.out.println("El indice ingresado está fuera del rango que tiene el Vector");
        } else {
            lista.remove(indice);
        }
    }

    //Método para verificar si un elemento existe en el Vector
    public boolean contieneElemento(String elemento) {
        return lista.contains(elemento);
    }

}
