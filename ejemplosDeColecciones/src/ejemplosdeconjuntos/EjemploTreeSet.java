package ejemplosdeconjuntos;

import java.util.TreeSet;

public class EjemploTreeSet {

    private TreeSet<String> set;

    public EjemploTreeSet() {
        set = new TreeSet<>();
    }

    public void agregarElemento(String elemento) {
        set.add(elemento);
    }

    public boolean contieneElemento(String elemento) {
        return set.contains(elemento);
    }

    public void recorrerSet() {
        for (String elemento : set) {
            System.out.println(elemento);
        }
    }

    public void eliminarElemento(String elemento) {
        set.remove(elemento);
    }
}
