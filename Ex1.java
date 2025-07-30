public class Ex1 {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        int resultado = multiplicarSucessivos(a, b);
        System.out.println("resultado da multiplicação de " + a + " por " + b + " = " + resultado);
    }

    public static int multiplicarSucessivos(int a, int b) {
        if (b == 0) {
            return 0;
        } else if (b < 0) {
            return -multiplicarSucessivos(a, -b);
        } else {
            return a + multiplicarSucessivos(a, b - 1);
        }
    }
}