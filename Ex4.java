public class Ex4 {
    public static void main(String[] args) {
        System.out.println(inv_str("obas",4));
    }

    public static String inv_str(String s, int n){
        if(n<0) return "";
        return inv_str(s.substring(1) + s.charAt(0),n-1);
    }
}
