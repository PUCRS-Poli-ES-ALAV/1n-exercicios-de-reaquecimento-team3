public class Ex10 {
    public static int fibg(int f0, int f1, int n) {
        if (n == 0)
            return f0;
        if (n == 1)
            return f1;
        return fibg(f0, f1, n - 1) + fibg(f0, f1, n - 2);
    }

    public static void main(String[] args) {
        int f0 = 2, f1 = 3;
        for (int i = 0; i <= 6; i++) {
            System.out.println("fibg(" + f0 + ", " + f1 + ", " + i + ") = " + fibg(f0, f1, i));
        }
    }
}
