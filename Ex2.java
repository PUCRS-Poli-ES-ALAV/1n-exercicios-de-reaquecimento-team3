
public class Ex2{
    public static void main(String[] args) {
        int s = soma(3,2);
        System.out.println(s);
    }

    public static int soma(int a, int b){
        if(b == 0)
        return a;
        return soma(++a, --b);
    }
}