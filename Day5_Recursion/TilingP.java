public class TilingP {
    public static int TP(int n){
        //Base Case
        if(n == 0 || n == 1){
            return 1;
        }

        //Kaam
        //Vertical choice
        int fnml = TP(n-1);

        //Horizontal choice
        int fnml2 = TP(n-2);

        int totWays = fnml + fnml2;
        return totWays;
    }
    public static void main(String[] args){

        System.out.println(TP(6));
    }
    
}
