public class SumOFNat {
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n + sum(n-1);
    } 

    //Fibonacci series
    public static int fibb(int n){
        if(n ==0 || n == 1){
            return n;
        }

        int f1 = fibb(n - 1);
        int f2 = fibb(n - 2);
        return f1 + f2;
    }

    public static void main(String args[]){
        int n = 5;
        System.out.println(sum(n));
        System.out.println(fibb(9));
        System.out.println(fibb(10));
        System.out.println(fibb(11));
    }
    
}
