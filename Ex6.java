public class Ex6 {
    public static void main(String[] args) {
        System.out.println(Ackerman(1, 2));
    }

    public static int Ackerman(int m, int n){
        if(m == 0)
        return n+1;
        if(n == 0)
        return Ackerman(m-1,1);

        return Ackerman(m-1,Ackerman(m, n-1));
    }
}
