package ejemplosdelistas;

import java.util.ArrayList;

public class EjemploArrayList {

    private ArrayList<String> lista;

    // constructor para inicializar el atributo de la clase
    public EjemploArrayList() {
        lista = new ArrayList();
    }

    // Método para agregar elementos al ArrayList
    public void agregarElemento(String elemento) {
        lista.add(elemento);
    }

    //Método para obtener el tamaño del ArrayList
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

    //Método para recorrer el ArrayList
    public void recorrerArrayList() {
        //recorriendo el ArrayList con un for normal
//        for (int i = 0; i < obtenerTamanio(); i++) {
//            System.out.println(lista.get(i));
//        }

        //recorriendo el ArrayList con un forEach
//        for(String elemento:lista){
//            System.out.println(elemento);
//        }

        //Recorriendo el ArrayList con el forEach que posee lista
        lista.forEach(elemento -> {
            System.out.println(elemento);
        });
    }

    //Método para eliminar un elemento por índice
    public void eliminarElemento(int indice) {
        if (indice > obtenerTamanio() || indice < 0) {
            System.out.println("El indice ingresado está fuera del rango que tiene el arreglo");
        } else {
            System.out.println("El elemento fue eliminado " + lista.get(indice));
            String string = lista.remove(indice);
            System.out.println(string + " fue eliminado de forma correcta.");
        }
    }

    //Método para verificar si un elemento existe en el ArrayList
    public boolean contieneElemento(String elemento) {
        return lista.contains(elemento);
    }
}
