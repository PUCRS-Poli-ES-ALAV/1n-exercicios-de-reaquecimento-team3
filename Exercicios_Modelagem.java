public class Exercicios_Modelagem {
    public static void main(String args[]){
        System.out.println(fatorial(3));
        System.out.println(somatorio(0));
    }   
    public static int fatorial(int n){
        if(n == 0)
        return 1;
        else if(n < 0)
        return -9999;
        else
        return n * fatorial(n-1);
    }

    public static int somatorio(int n){
        if(n > 0)
        return somatorio(n-1);
        if(n < 0)
        return somatorio(n+1);
        else
        return 0;
    }

    

}

