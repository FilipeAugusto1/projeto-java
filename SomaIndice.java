public class SomaIndice {
    public static void main(String[] args) {
        int INDICE = 12;
        int SOMA = 0;
        int K = 1;

        while (K <= INDICE) {
            SOMA = SOMA + K;
            K = K + 1;
        }

        System.out.println("O valor de SOMA é: " + SOMA);
    }
}
