import java.util.Scanner;

public class ContarLetraA {

    public static String contarLetraA(String s) {
        s = s.toLowerCase();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        return "A letra 'a' aparece " + count + " vezes na string.";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String string = scanner.nextLine();
        System.out.println(contarLetraA(string));
        scanner.close();
    }
}