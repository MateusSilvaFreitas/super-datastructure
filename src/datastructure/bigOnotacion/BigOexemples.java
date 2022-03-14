package datastructure.bigOnotacion;

public class BigOexemples {

    /**
     * Time complexity from this method: 2 + 5*(n/2)
     * How he are calculated???
     * Total operations before loop = 2;
     * Total operations in loop = 5(Instance a variable in loop declaration is a operation too)
     * multiplied by entrance length, in this case = N / 2
     * <p>
     * Space complexity from this method: 4 + N
     */
    public static int[] inverterLista(int[] lista) {
        int tamanho = lista.length;
        int limite = tamanho >> 1;
        for (int i = 0; i < limite; i++) {
            int aux = lista[i];
            lista[i] = lista[tamanho - 1];
            lista[tamanho - 1] = aux;
            tamanho--;
        }
        return lista;
    }

    /**
     * Time complexity from this method: N * (N - 1) / 2
     * Simplified to (N² - N) / 2 + 1
     * How multiply for 2 is equal to multiply by 0.5, we follow the last step, remove the const that multiplies the operator
     * Now, we have: N² - N
     * In this case, we still have a operation, so we stay with the dominant, that in case is N²
     * Since the o - N, doesn't do difference in the wrost case, we remove then;
     * In the end, we have: O(N²), a exponencial complexity
     */
    public static boolean verificaElementosDuplicados(String[] lista) {
        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = i + 1; j < lista.length; j++) {
                if (lista[i] == lista[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
