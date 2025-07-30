public class Ex3 {
    public static void main(String[] args) {
        System.out.println("soma deu:" + somaFracao(4));
    }

    public static double somaFracao(int n) {
        if (n == 1) {
            return 1.0;
        } else {
            return 1.0 / n + somaFracao(n - 1);
        }
    }
}
