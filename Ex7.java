import java.util.Random;
public class Ex7 {
    public static void main(String args[]){
        System.out.println();
        System.out.println(pal("aba"));
        System.out.println("abba".substring("abba".length()/2));
        System.out.println(inv_str("abba".substring(0,("abba".length())/2)));
        System.out.println(pal("aoba"));
    }

    public static String inv_str(String s){
        if(s.isEmpty()) return s;
        return inv_str(s.substring(1)) + s.charAt(0);
    }

    public static boolean pal(String s){
        if(s.substring(s.length()/2).equals(inv_str(s.substring(0,(s.length())/2))))
        return true;
        return false;
    }
}
