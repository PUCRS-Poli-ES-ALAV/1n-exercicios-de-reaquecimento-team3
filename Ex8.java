
public class Ex8 {
    public static void main(String args[]) {
        System.out.println();
        System.out.println(pal("aba"));
        System.out.println(pal("aoba"));
    }

    public static boolean pal(String s) {
        if (s.length() <= 1)
            return true;
        if (s.charAt(0) != s.charAt(s.length() - 1))
            return false;
        return pal(s.substring(1, s.length() - 1));
    }
}
