public class Sequencias {

    public static void main(String[] args) {
        System.out.println("Sequência A: Próximo número é " + proximoNumeroA());
        System.out.println("Sequência B: Próximo número é " + proximoNumeroB());
        System.out.println("Sequência C: Próximo número é " + proximoNumeroC());
        System.out.println("Sequência D: Próximo número é " + proximoNumeroD());
        System.out.println("Sequência E: Próximo número é " + proximoNumeroE());
        System.out.println("Sequência F: Próximo número é " + proximoNumeroF());
    }

    public static int proximoNumeroA() {
        return 7 + 2;
    }

    public static int proximoNumeroB() {
        return 64 * 2;
    }

    public static int proximoNumeroC() {
        int n = (int) Math.sqrt(36) + 1;
        return n * n;
    }

    public static int proximoNumeroD() {
        int n = (int) Math.sqrt(64 / 4) + 2;
        return n * n * 4;
    }

    public static int proximoNumeroE() {
        return 8 + 5;
    }

    public static int proximoNumeroF() {
        int proximo = 20;
        while (!String.valueOf(proximo).contains("1")) {
            proximo++;
        }
        return proximo;
    }
}
