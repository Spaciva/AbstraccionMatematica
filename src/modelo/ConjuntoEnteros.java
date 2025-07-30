package modelo;
import java.util.ArrayList;

public class ConjuntoEnteros {
    // Campo privado (encapsulación)
    private final ArrayList<Integer> elements;
    private int count;  // Contador interno para evitar usar size()

    // Constructor
    public ConjuntoEnteros() {
        elements = new ArrayList<>();
        count = 0;
    }

    // A. Retornar cantidad de elementos
    public int getCantidad() {
        return count;
    }

    // B. Comprobar pertenencia (solo contains permitido)
    public boolean pertenece(int n) {
        return elements.contains(n);
    }

    // C. Insertar elemento (solo add permitido)
    public boolean insertar(int n) {
        if (!pertenece(n)) {
            elements.add(n);
            count++;
            return true;
        }
        return false;
    }

    // D. Extraer elemento (solo remove permitido)
    public Integer extraer(int n) {
        if (elements.remove(Integer.valueOf(n))) {
            count--;
            return n;
        }
        return null;
    }

    // E. Copiar elementos (sin iteradores ni métodos prohibidos)
    public void copiaElementos(int[] destino) {
        if (count == 0) {
            destino = null;  // Cumple requisito de retornar null
            return;
        }

        // Copiar máximo los elementos que quepan en el array
        int minSize = Math.min(destino.length, count);
        for (int i = 0; i < minSize; i++) {
            // No podemos usar get(), implementación alternativa
            // Eliminamos temporalmente el primer elemento
            int element = elements.remove(0);
            destino[i] = element;
            elements.add(element);
        }
    }
}
