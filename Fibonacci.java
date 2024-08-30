import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {

    public static List<Integer> fibonacci(int n) {
        List<Integer> fibSeq = new ArrayList<>();
        fibSeq.add(0);
        fibSeq.add(1);
        while (fibSeq.get(fibSeq.size() - 1) + fibSeq.get(fibSeq.size() - 2) <= n) {
            int next = fibSeq.get(fibSeq.size() - 1) + fibSeq.get(fibSeq.size() - 2);
            fibSeq.add(next);
        }
        return fibSeq;
    }

    public static String pertenceAFibonacci(int n) {
        List<Integer> fibSeq = fibonacci(n);
        if (fibSeq.contains(n)) {
            return "O número " + n + " pertence à sequência de Fibonacci.";
        } else {
            return "O número " + n + " NÃO pertence à sequência de Fibonacci.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();
        System.out.println(pertenceAFibonacci(numero));
        scanner.close();
    }
}