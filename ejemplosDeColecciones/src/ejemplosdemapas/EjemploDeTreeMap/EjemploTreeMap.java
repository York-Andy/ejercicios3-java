package ejemplosdemapas.EjemploDeTreeMap;

import java.util.TreeMap;

public class EjemploTreeMap {

    private TreeMap<Integer, String> map;

    public EjemploTreeMap() {
        map = new TreeMap<>();
    }

    public void agregarElemento(int clave, String valor) {
        map.put(clave, valor);
    }

    public String obtenerElemento(int clave) {
        return map.get(clave);
    }

    public void recorrerMap() {
        for (Integer clave : map.keySet()) {
            System.out.println("Clave: " + clave + ", Valor: " + map.get(clave));
        }
    }

    public void eliminarElemento(int clave) {
        map.remove(clave);
    }
}
