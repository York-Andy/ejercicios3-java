package ejemplosdeconjuntos;

import java.util.LinkedHashSet;

public class EjemploLinkedHashSet {

    private LinkedHashSet<String> set;

    public EjemploLinkedHashSet() {
        set = new LinkedHashSet<>();
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
