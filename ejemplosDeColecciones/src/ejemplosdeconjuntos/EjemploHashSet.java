package ejemplosdeconjuntos;

import java.util.HashSet;

public class EjemploHashSet {

    private HashSet<String> set;

    public EjemploHashSet() {
        set = new HashSet<>();
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
