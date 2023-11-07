package ejemplosdemapas.EjemploDeTreeMap;

import java.util.LinkedHashMap;

public class EjemploLinkedHashMap {

    private LinkedHashMap<String, Double> map;

    public EjemploLinkedHashMap() {
        map = new LinkedHashMap<>();
    }

    public void agregarElemento(String clave, double valor) {
        map.put(clave, valor);
    }

    public double obtenerElemento(String clave) {
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
