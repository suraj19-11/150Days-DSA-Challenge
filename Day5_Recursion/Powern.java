public class Powern {
    public static int power(int x, int n){
        if( n == 0 ){
            return 1;
        }
        return x * power(x, n-1);
        
    }

    //Optimized Power
    public static int Optimizedpower(int x,int n){
        if(n == 0){
            return 1;
        }

        int halfPower = Optimizedpower(x, n/2);
        int HPSq = halfPower * halfPower;

        //n is odd

        if(n % 2 != 0){
            HPSq = x * HPSq;
        }

        return HPSq;
    }
    public static void main(String[] args) {
        System.out.println(power(2, 05));
        System.out.println(Optimizedpower(2, 4));
        
    }
    
}
