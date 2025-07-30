package app;
import modelo.ConjuntoEnteros;
import modelo.ConjuntoEnteros.*;

public class ClasePrincipal {
    public static void main(String[] args) {
        // 1. Crear 3 objetos
        ConjuntoEnteros conjunto1 = new ConjuntoEnteros();
        ConjuntoEnteros conjunto2 = new ConjuntoEnteros();
        ConjuntoEnteros conjunto3 = new ConjuntoEnteros();

        // 2. Probar inserción (método C)
        System.out.println("Insertar 5: " + conjunto1.insertar(5));  // true
        System.out.println("Insertar 5: " + conjunto1.insertar(5));  // false (duplicado)

        // 3. Probar pertenencia (método B)
        System.out.println("¿10 existe?: " + conjunto1.pertenece(10));  // false

        // 4. Probar extracción (método D)
        System.out.println("Extraer 5: " + conjunto1.extraer(5));    // 5
        System.out.println("Extraer 5: " + conjunto1.extraer(5));    // null

        // 5. Probar copia de elementos (método E)
        int[] copia = new int[3];
        conjunto2.insertar(10);
        conjunto2.insertar(20);
        conjunto2.copiaElementos(copia);

        System.out.print("Elementos copiados: ");
        for (int num : copia) {
            System.out.print(num + " ");  // 10 20 0
        }

        // 6. Caso conjunto vacío
        int[] vacio = new int[0];
        conjunto3.copiaElementos(vacio);  // Asigna null internamente
    }
}



