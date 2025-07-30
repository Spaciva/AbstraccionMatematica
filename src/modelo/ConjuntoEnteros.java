package modelo;
import java.util.ArrayList;
public class ConjuntoEnteros {

    private ArrayList<Integer> elementos;

    public ConjuntoEnteros() {
        elementos = new ArrayList<>();
    }
    public int getCantidad() {
        return elementos.size();
    }
    public boolean pertenece(int n) {
        return elementos.contains(n);
    }

    public boolean insertar(int n) {
        if (!elementos.contains(n)) {
            elementos.add(n);
            return true;
        }
        return false;
    }

    public Integer extraer(int n) {
        if (elementos.contains(n)) {
            elementos.remove(Integer.valueOf(n));
            return n;
        }
        return null;

    }

    public void copiarElementos(int[] destino) {
        if (elementos.size() != destino.length) {
            System.out.println("El arreglo destino no tiene el tamaño correcto.");
            return;
        }
        for (int i = 0; i < elementos.size(); i++) {
            destino[i] = elementos.get(i);
        }
    }


}
