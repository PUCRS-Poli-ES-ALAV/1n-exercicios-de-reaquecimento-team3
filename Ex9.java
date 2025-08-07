public class Ex9 {
    public static void permutar(String prefixo, String resto) {
        if (resto.length() == 0) {
            System.out.println(prefixo);
            return;
        }

        for (int i = 0; i < resto.length(); i++) {
            permutar(prefixo + resto.charAt(i), resto.substring(0, i) + resto.substring(i + 1));
        }
    }

    public static void main(String[] args) {
        int n = 3;
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".substring(0, n);
        permutar("", letras);
    }
}
