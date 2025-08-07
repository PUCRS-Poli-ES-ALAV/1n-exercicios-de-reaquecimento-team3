public class Ex7 {
    public static int soma(int[] v, int i) {
        if (i == v.length)
            return 0;
        return v[i] + soma(v, i + 1);
    }

    public static int produto(int[] v, int i) {
        if (i == v.length)
            return 1;
        return v[i] * produto(v, i + 1);
    }

    public static void main(String[] args) {
        int[] vetor = { 2, 3, 4 };
        System.out.println("soma: " + soma(vetor, 0));
        System.out.println("produto: " + produto(vetor, 0));
    }
}