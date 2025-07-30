public class Ex4 {
    public static void main(String[] args) {
        System.out.println(inv_str("obas"));
    }

    public static String inv_str(String s){
        if(s.isEmpty()) return s;
        return inv_str(s.substring(1)) + s.charAt(0);
    }
}
