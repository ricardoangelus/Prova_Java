import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class BubbleSort {
    public static void main(String args[]) {

        long start = System.nanoTime();

        Random random = new Random();

        int[] v = new int [1000];
        int[] v2 = {10000};
        int[] v3 = {100000};
        int[] v4 = {1000000};
        int[] v5 = {5000000};
        int[] v6 = {10000000};

        for (int i=0; i<v.length;i++) {
            v[i] = random.nextInt(1000);
            System.out.println(v[i]);
        }
        BubbleSort bs = new BubbleSort();



        bs.ordenar(v);
        for(int num : v) {



        long end = System.nanoTime();
        long resultado = end - start;

        // 1 segundo é igual a 1_000_000_000
        double cpu_time_used = (double)(resultado) / 1e+9;
        double cpu_time_used2 = (double)(resultado);

        System.out.println("Quantidade de Itens: " + num + " -----> Tempo de uso da CPU: " + cpu_time_used + " segundos");
        //System.out.println("Quantidade de Itens: " + num + " -----> Tempo de uso da CPU: " + cpu_time_used2 + " segundos");

        }
    }

    /**
     * Método que ordena um vetor de inteiros utilizando o algoritmo
     * de Bubble Sort.
     *
     * @param v - Vetor que será ordenado.
     */
    public void ordenar(int[] v) {
        // for utilizado para controlar a quantidade de vezes que o vetor será ordenado.
        for(int i = 0; i < v.length - 1; i++) {
            // for utilizado para ordenar o vetor.
            for(int j = 0; j < v.length - 1 - i; j++) {
        /* Se o valor da posição atual do vetor for maior que o proximo valor,
          então troca os valores de lugar no vetor. */
                if(v[j] > v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;


                }
            }
        }
    }
}
