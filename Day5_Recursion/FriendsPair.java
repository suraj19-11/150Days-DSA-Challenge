public class FriendsPair {
    
    public static int FP(int n){
        if(n == 1 ||  n == 2){
            return n;
        }

        // //choice

        // //single
        // int fnm1 = FP(n-1);
        // //pair
        //  int fnm2 = FP(n-2);
        //  int pairways = (n-1) * fnm2;

        //  //totways
        //  int totways =  fnm1 + pairways;
        //  return totways;

         return FP(n-1) + (n-1) * FP(n-2);

    
    }
    public static void main(String[] args) {

        System.out.println(FP(4));
    }
}
