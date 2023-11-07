package ejemplosdemapas.EjemploDeTreeMap;

import java.util.HashMap;

public class EjemploHashMap {

    private HashMap<String, Integer> map;

    public EjemploHashMap() {
        map = new HashMap<>();
    }

    public void agregarElemento(String clave, int valor) {
        map.put(clave, valor);
    }

    public int obtenerElemento(String clave) {
        return map.get(clave);
    }

    public void recorrerMap() {
        for (String clave : map.keySet()) {
            System.out.println("Clave: " + clave + ", Valor: " + map.get(clave));
        }
    }

    public void eliminarElemento(String clave) {
        map.remove(clave);
    }
}
