public class Ex5 {
    public static int F(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        } else {
            return 2 * F(n - 1) + 3 * F(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(F(1));
        System.out.println(F(3));

        for (int i = 1; i <= 10; i++) {
            System.out.println("F(" + i + ") = " + F(i));
        }
    }
}
