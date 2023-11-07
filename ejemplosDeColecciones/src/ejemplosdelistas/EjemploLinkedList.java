package ejemplosdelistas;

import java.util.LinkedList;

public class EjemploLinkedList {

    private LinkedList<String> lista;

    // constructor para inicializar el atributo de la clase
    public EjemploLinkedList() {
        lista = new LinkedList();
    }

    // Método para agregar elementos al LinkedList
    public void agregarElemento(String elemento) {
        lista.add(elemento);
    }

    //Método para obtener el tamaño del LinkedList
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

    //Método para recorrer el LinkedList
    public void recorrerArrayList() {
        //recorriendo el LinkedList con un for normal
        for (int i = 0; i < obtenerTamanio(); i++) {
            System.out.println(lista.get(i));
        }

        //recorriendo el LinkedList con un forEach
//        for(String elemento:lista){
//            System.out.println(elemento);
//        }
        //Recorriendo el LinkedList con el forEach que posee lista
//        lista.forEach(elem -> {
//            System.out.println(elem);
//        });
    }

    //Método para eliminar un elemento por índice
    public void eliminarElemento(int indice) {
        if (indice > obtenerTamanio() || indice < 0) {
            System.out.println("El indice ingresado está fuera del rango que tiene el arreglo");
        } else {
            lista.remove(indice);
        }
    }

    //Método para verificar si un elemento existe en el LinkedList
    public boolean contieneElemento(String elemento) {
        return lista.contains(elemento);
    }
}
